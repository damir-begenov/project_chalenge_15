package com.example.demo.repository;

import com.example.demo.entity.n_st;
import com.example.demo.entity.node_c;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import java.util.Collection;
import java.util.List;

public interface node_cRepository extends Neo4jRepository<node_c,String> {
    @Query("MATCH (u:node_c)<-[r:rel_final]-(m:n_st) WHERE m.FIO=~ ('(?i).*'+$str+'.*') RETURN u{.BINID, .LABEL , .company}")
    List<node_c> getAllUserNodeByFIO(String str);

    @Query("match (n:node_c) return n")
    List<node_c> getAllSchoolss();


}
