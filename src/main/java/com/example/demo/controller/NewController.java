package com.example.demo.controller;

import com.example.demo.entity.n_st;
import com.example.demo.entity.rel_final;
import com.example.demo.repository.n_stRepo;
import com.example.demo.repository.rel_final_repo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@AllArgsConstructor
public class NewController {
    private final n_stRepo n_stRepo;
    private final com.example.demo.repository.rel_final_repo rel_final_repo;

//    @GetMapping("/{fio}")
//    public Collection<n_st> getfromidd(@PathVariable String fio){
//        return n_stRepo.findByFIO(fio);
//    }
//    @GetMapping("/{str}")
//    public List getBookByTitleContaining(@PathVariable String str) {
//        return rel_final_repo.findByFIO(str);
//    }
//    @GetMapping("/alls")
//    public List<rel_final> getfromiddf(){
//        return rel_final_repo.findAll();
//    }
}