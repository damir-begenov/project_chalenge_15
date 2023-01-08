package com.example.demo;

import com.example.demo.entity.node_c;
import com.example.demo.repository.SongRepository;
import com.example.demo.repository.n_stRepo;
import com.example.demo.repository.node_cRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication   {

	private final SongRepository songRepository;
	private final node_cRepository nod_cRepository;
	private final n_stRepo n_stRepo;

	public DemoApplication(SongRepository songRepository, node_cRepository nod_cRepository, com.example.demo.repository.n_stRepo n_stRepo) {
		this.songRepository = songRepository;
		this.nod_cRepository = nod_cRepository;
		this.n_stRepo = n_stRepo;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		int i=0;
//		for(node_c node_cc : nod_cRepository.findAll()){
//			System.out.println(node_cc.getCompany() + " id of school is " + node_cc.getBINID());}
//		for(com.example.demo.entity.n_st n_st : n_stRepo.findAll()){
//			System.out.println(n_st.getFIO());
//			System.out.println(++i);
//			for(com.example.demo.entity.rel_final rel_final : n_st.getNode_cs()){
//				System.out.println("     " + rel_final);
//			}
//		}
//	}
}
