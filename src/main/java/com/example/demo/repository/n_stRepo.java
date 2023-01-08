package com.example.demo.repository;

import com.example.demo.entity.n_st;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import java.util.Collection;

public interface n_stRepo extends Neo4jRepository<n_st,String> {
    @Query("MATCH (u:node_c)<-[r:rel_final]-(m:n_st) RETURN m,u,r")
    Collection<n_st> getAllUser();
    Collection<n_st> findByFIO(String fio);
    n_st getByIINID(String iin);
}
