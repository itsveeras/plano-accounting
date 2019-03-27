package com.intuit.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.intuit.demo.domain.Client;
import com.intuit.demo.repo.ClientRepository;

@RepositoryRestController
public class ClientController {

	@Autowired
	private ClientRepository clientRepo;
	
	@RequestMapping(value="/client/{id}", method=RequestMethod.PUT)
	public  ResponseEntity<Object> updateClient(@PathVariable Long id, @RequestBody Client client) {
		Optional<Client> c = clientRepo.findById(id);
		if (c.isPresent()) {
			client.setId(c.get().getId());
			clientRepo.save(client);
		} else {
			return ResponseEntity.notFound().build();
		}	
		return ResponseEntity.accepted().build();
	}
	
	@RequestMapping(value="/client", method=RequestMethod.POST)
	public  ResponseEntity<Object> saveClient(@RequestBody Client client) {
		Client c = clientRepo.save(client);
		return ResponseEntity.ok(c);
	}


}
