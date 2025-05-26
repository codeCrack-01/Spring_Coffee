package com.thehecklers.sbur_rest_demo;

import org.springframework.data.repository.CrudRepository;

interface CoffeeRepository extends CrudRepository<Coffee, String> {
	
}
