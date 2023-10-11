package com.dl.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class Client {

	@GetMapping("/get")
	public String getUser() {

		return "Get Level Invoked";
	}

	@PostMapping("/post")
	public String createUser() {

		return "Post Level Invoked";
	}

	@PutMapping("/put")
	public String updatemethod() {

		return "Put Level Invoked";
	}

	@DeleteMapping("/delete")
	public String deleteMethod() {

		return "Delete Level Invoked";
	}

	@RequestMapping("/methodlevel")
	public String helloWorld() {

		return "Method Level Invoked";
	}

}
