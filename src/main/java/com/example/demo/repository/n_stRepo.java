package com.example.demo.repository;

import com.example.demo.entity.n_st;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import java.util.Collection;
import java.util.List;

public interface n_stRepo extends Neo4jRepository<n_st,String> {
    @Query("MATCH (u:node_c)<-[r:rel_final]-(m:n_st) RETURN m,u,r")
    List<n_st> getAllUser();

    @Query("MATCH (u:node_c)<-[r:rel_final]-(m:n_st) WHERE m.FIO=~ ('(?i).*'+'(?i)'+$FIO+'.*') or " +
            "m.IINID=~ ('(?i)'+$FIO+'.*') RETURN m,u,r")
    List<n_st> findByFIO(String FIO);

    @Query("MATCH (u:node_c)<-[r:rel_final]-(m:n_st) RETURN u")
    List<n_st> findAllSchool();

    @Query("MATCH (u:node_c)<-[r:rel_final]-(m:n_st) WHERE r.end_date<>'' RETURN m,u,r")
    List<n_st> findFinishedTheSchool();
    @Query("MATCH (u:node_c)<-[r:rel_final]-(m:n_st) WHERE r.end_date='' RETURN m,u,r")
    List<n_st> findDidntFininshed();


    @Query("MATCH (u:node_c)<-[r:rel_final]-(m:n_st) WHERE u.BINID=~ ($BINID)  RETURN m,u,r")
    List<n_st> findBySchool(String BINID);

    n_st getByIINID(String iin);
}
