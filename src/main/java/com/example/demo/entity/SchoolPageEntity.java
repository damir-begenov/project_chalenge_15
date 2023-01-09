package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class SchoolPageEntity {
    int finished;
    int unfinished;
    List<n_st> n_sts;

    public void setFinished(int finished) {
        this.finished = finished;
    }

    public void setUnfinished(int unfinished) {
        this.unfinished = unfinished;
    }

    public void setN_sts(List<n_st> n_sts) {
        this.n_sts = n_sts;
    }

    public int getFinished() {
        return finished;
    }

    public int getUnfinished() {
        return unfinished;
    }

    public List<n_st> getN_sts() {
        return n_sts;
    }
}
