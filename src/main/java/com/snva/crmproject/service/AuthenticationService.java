package com.snva.crmproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.snva.crmproject.entity.User;
import com.snva.crmproject.repository.AuthenticationRepository;

@Service
public class AuthenticationService implements UserDetailsService {

	@Autowired
	AuthenticationRepository authenticationRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = authenticationRepository.findUserByUsername(username) 
		         .orElseThrow(() -> new UsernameNotFoundException("User not present")); 
		System.out.println(user.getRole());
		         return user; 
	}
	
	 public User createUser(User user) { 
		 if(authenticationRepository.findUserByUsername(user.getUsername()).isPresent()) {
			 return null;
		 }
		   return authenticationRepository.save(user);
	   } 

}
