package com.intuit.demo.repo;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.intuit.demo.domain.Client;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "client", path = "client")
public interface ClientRepository extends PagingAndSortingRepository<Client, Long> {
	
	@RestResource(path="byType")
	List<Client> findByType(@Param("name") String name);
	
	@Override
	@RestResource(exported =false)
	Client save(Client c);

}
