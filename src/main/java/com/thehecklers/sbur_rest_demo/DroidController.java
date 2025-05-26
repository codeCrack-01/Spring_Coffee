package com.thehecklers.sbur_rest_demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/droid")
public class DroidController {
	private final Droid droid;
	
	public DroidController (Droid droid) {
		this.droid = droid;
	}
	
	@GetMapping
	Droid getDroid() {
		return droid;
	}
}
