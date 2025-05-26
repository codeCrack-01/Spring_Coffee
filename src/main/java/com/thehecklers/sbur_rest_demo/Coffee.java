package com.thehecklers.sbur_rest_demo;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
class Coffee {
	@Id
	private String id;
	
	private String name;
	
	public Coffee(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Coffee() {
		// IDK why but a default constructor is important, even when not used ...
	}
	public Coffee(String name) {
		this.id = UUID.randomUUID().toString();
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
 }
