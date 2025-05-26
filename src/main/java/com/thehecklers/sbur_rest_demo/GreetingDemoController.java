package com.thehecklers.sbur_rest_demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingDemoController {
	
	private final Greeting greeting;
	
	public GreetingDemoController (Greeting greeting) {
		this.greeting = greeting;
	}
	
	@GetMapping
	String getGreeting() {
		return greeting.getName();
	}
	
	@GetMapping("/coffee")
	String getnameAndCoffee() {
		return greeting.getCoffee();	
	}
}
