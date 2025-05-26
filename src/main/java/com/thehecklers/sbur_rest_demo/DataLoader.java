package com.thehecklers.sbur_rest_demo;

import org.springframework.stereotype.Component;

import jakarta.annotation.*;
import java.util.List;

@Component
class DataLoader {
	private final CoffeeRepository coffeeRepository;
	
	public DataLoader(CoffeeRepository coffeeRepository) {
		this.coffeeRepository = coffeeRepository;
		}
	
	@PostConstruct
	private void loadData() {
		coffeeRepository.saveAll(List.of(
				new Coffee("Cafe Cereza"),
				new Coffee("Cafe Gandor"),
				new Coffee("Cafe Larenzo"),
				new Coffee("Cafe Tres Pontas")
		));
	}
}
