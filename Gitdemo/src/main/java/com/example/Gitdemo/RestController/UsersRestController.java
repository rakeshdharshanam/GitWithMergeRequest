package com.example.Gitdemo.RestController;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersRestController {

	private String HELLO = "Hello from drakesh";
	
	public String helloMessage() {
		return HELLO;
	}
	
}
