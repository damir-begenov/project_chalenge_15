package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Node
@AllArgsConstructor
@NoArgsConstructor
public class n_st {
    @Id
    private String IINID;
    private String FIO;
    private String LABEL;
    @Relationship(type="rel_final", direction = Relationship.Direction.OUTGOING)
    private List<rel_final> node_cs;

    public String getIINID() {
        return IINID;
    }

    public String getFIO() {
        return FIO;
    }

    public String getLABEL() {
        return LABEL;
    }

    public List<rel_final> getNode_cs() {
        return node_cs;
    }
}
