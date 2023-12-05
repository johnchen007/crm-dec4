package com.snva.crmproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.snva.crmproject.entity.User;
import com.snva.crmproject.service.AuthenticationService;

class ResponseObject {
	private boolean isCreated;
	private String messsage;
	public ResponseObject(boolean isCreated, String messsage) {
		super();
		this.isCreated = isCreated;
		this.messsage = messsage;
	}
	public boolean isCreated() {
		return isCreated;
	}
	public void setCreated(boolean isCreated) {
		this.isCreated = isCreated;
	}
	public String getMesssage() {
		return messsage;
	}
	public void setMesssage(String messsage) {
		this.messsage = messsage;
	}
	
}
@RestController
public class AuthenticationController {
	
	@Autowired
	private AuthenticationService authenticationService; 

	@Autowired
	   private PasswordEncoder passwordEncoder;
	
	@PostMapping("/register")
	ResponseObject register(@RequestBody User user){
		System.out.println(user.getUsername());
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		if(authenticationService.createUser(user)==null) {
			return new ResponseObject(false, "username exists");
		}
		return new ResponseObject(true, "Successfully Created User");
	}

}
