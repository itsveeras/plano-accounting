package com.intuit.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.intuit.demo.domain.Client;
import com.intuit.demo.repo.ClientRepository;

@SpringBootApplication
public class CraftDemoApplication {
	
	@Autowired
	private ClientRepository clientRepo;
	
	@Component
	class DataInit implements ApplicationRunner {

		@Override
		public void run(ApplicationArguments args) throws Exception {
			clientRepo.save(Client.builder().firstName("Alfert").lastName("Steve").type("Business").build());
			clientRepo.save(Client.builder().firstName("Peter").lastName("Mark").type("Business").build());
			clientRepo.save(Client.builder().firstName("Jhon").lastName("Son").type("Individual").build());


		}
		
	}

	public static void main(String[] args) {
		SpringApplication.run(CraftDemoApplication.class, args);
	}

}
