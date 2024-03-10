package com.example.Gitdemo.RestController;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersRestController {

	private String HELLO = "Hello from rakesh";
	
	public String helloMessage() {
		return HELLO;
	}
	
}
