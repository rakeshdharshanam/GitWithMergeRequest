package com.example.Gitdemo.RestController;

import org.springframework.web.bind.annotation.RestController;

import com.example.Gitdemo.Configurations.Configurations;

@RestController
public class UsersRestController {

	private String HELLO = "Hello from rakesh";
	
	public String helloMessage() {

		return HELLO+" "+Configurations.NAME;

	}
	
}
