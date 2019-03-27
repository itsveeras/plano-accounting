package com.intuit.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.intuit.demo.domain.Client.ClientBuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Data
public class ClientType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String type;

}