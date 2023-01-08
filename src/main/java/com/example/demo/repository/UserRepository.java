package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

public interface UserRepository extends Neo4jRepository<User, String> {
    @Query("MATCH (n:User) WHERE n.email=~ ('(?i).*'+$email+'.*') RETURN n")
    User findByEmail(String email);
}
