package com.example.demo.controller;

import com.example.demo.entity.n_st;
import com.example.demo.entity.node_c;
import com.example.demo.entity.rel_final;
import com.example.demo.repository.n_stRepo;
import com.example.demo.repository.node_cRepository;
import com.example.demo.repository.rel_final_repo;
import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
@AllArgsConstructor
public class NewController {
    private final n_stRepo n_stRepo;
    private final com.example.demo.repository.node_cRepository node_cRepository;
    private final com.example.demo.repository.rel_final_repo rel_final_repo;

//    @GetMapping("/{fio}")
//    public Collection<n_st> getfromidd(@PathVariable String fio){
//        return n_stRepo.findByFIO(fio);
//    }
//    @GetMapping("/{str}")
//    public List getBookByTitleContaining(@PathVariable String str) {
//        return rel_final_repo.findByFIO(str);
//    }
    @GetMapping("/alls")
    public List<n_st> getfromiddf(){
        return n_stRepo.getAllUser();
    }
    @GetMapping("/alls/{FIO}")
    public List<n_st> getBYFIO(@PathVariable String FIO){
        return n_stRepo.findByFIO(FIO);
    }

    @GetMapping("/alls/finished")
    public List<n_st> getFinished(){
        return n_stRepo.findFinishedTheSchool();
    }
    @GetMapping("/alls/unfinished")
    public List<n_st> getUnfinshed(){
        return n_stRepo.findDidntFininshed();
    }
    @GetMapping("/alls/school/{company}")
    public List<n_st> getbySchool(@PathVariable String company){
        return n_stRepo.findBySchool(company);
    }
    @GetMapping("/alls/school")
    public List<node_c> getAllSchools(){
        return node_cRepository.getAllSchoolss();
    }

}
