package com.example.demo.controller;

import com.example.demo.entity.SchoolPageEntity;
import com.example.demo.entity.n_st;
import com.example.demo.entity.node_c;
import com.example.demo.entity.rel_final;
import com.example.demo.repository.n_stRepo;
import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
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
    @GetMapping("/alls/school/{BINID}")
    public SchoolPageEntity getbySchool(@PathVariable String BINID) throws ParseException {
        int finished = 0;
        int unfinished = 0;
        List<n_st> n_sts = new ArrayList<>();
        SchoolPageEntity schoolPageEntity = new SchoolPageEntity();
        List<n_st> nn =  n_stRepo.findBySchool(BINID);
        List<Date> dates = new ArrayList<>();
        for(n_st n: nn) {
            List<rel_final> node = n.getRel_finals();
            rel_final lol = node.get(0);
            String inputDate =  lol.getStart_date();
            SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
            Date afterConvDate = formatter.parse(inputDate);
            dates.add(afterConvDate);
            System.out.println(afterConvDate);
            n_sts.add(n);
            if (lol.getEnd_date()!="") {
                finished++;
            } else {
                unfinished++;
            }
        }

        schoolPageEntity.setN_sts(n_sts);
        schoolPageEntity.setFinished(finished);
        schoolPageEntity.setUnfinished(unfinished);
        return schoolPageEntity;
    }
    @GetMapping("/alls/school")
    public List<node_c> getAllSchools(){
        return node_cRepository.getAllSchoolss();
    }


}
