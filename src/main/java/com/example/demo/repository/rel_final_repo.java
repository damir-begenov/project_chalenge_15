package com.example.demo.repository;

import com.example.demo.entity.rel_final;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import java.util.List;

public interface rel_final_repo extends Neo4jRepository<rel_final,Long> {
    @Query("MATCH (u:node_c)<-[r:rel_final]-(m:n_st) WHERE m.FIO=~ ('(?i).*'+$str+'.*') RETURN r{.END_ID, .START_ID, .end_date, .source, .type, .start_date}")
    List<rel_final> findByFIO(String str);
}

