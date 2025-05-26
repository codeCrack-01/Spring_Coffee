package com.thehecklers.sbur_rest_demo;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/coffees")
class RestApiDemoController {
	
	private final CoffeeRepository coffeeRepository;
	
	public RestApiDemoController (CoffeeRepository coffeeRepository) {
		this.coffeeRepository = coffeeRepository;
	}
	
	@GetMapping
	Iterable<Coffee> getCoffees() {
		return coffeeRepository.findAll();
	}
	
	@GetMapping("/{id}")
	Optional<Coffee> getCoffeeById (@PathVariable String id) {
		return coffeeRepository.findById(id);
	}
	
	@PostMapping
	Coffee postCoffee(@RequestBody Coffee coffee) {
		coffeeRepository.save(coffee);
		return coffee;
	}
	
	@PutMapping("/{id}")
	ResponseEntity<Coffee> putCoffee(@PathVariable String id, @RequestBody Coffee coffee) {
		return (coffeeRepository.existsById(id))
				? new ResponseEntity<>(coffeeRepository.save(coffee), HttpStatus.OK)
				: new ResponseEntity<>(coffeeRepository.save(coffee), HttpStatus.CREATED);

	}
	
	@DeleteMapping("/{id}")
	void deleteCoffee(@PathVariable String id) {
		coffeeRepository.deleteById(id);
	}
}
