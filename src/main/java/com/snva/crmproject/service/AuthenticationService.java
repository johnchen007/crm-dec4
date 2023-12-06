package com.snva.crmproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.snva.crmproject.entity.userDetails.User;
import com.snva.crmproject.entity.userDetails.UserPersonalDetails;
import com.snva.crmproject.repository.user.AuthenticationRepository;
import com.snva.crmproject.repository.user.UserPersonalDetailsRepository;

@Service
public class AuthenticationService implements UserDetailsService {

	@Autowired
	AuthenticationRepository authenticationRepository;
	@Autowired
	UserPersonalDetailsRepository userPersonalDetailsRepository;
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
		 UserPersonalDetails userPersonalDetails = user.toUserPersonalDetails();
		 System.out.println(userPersonalDetails);
		 System.out.println(user);
		 user.setAccountNonLocked(true);
		 userPersonalDetailsRepository.save(userPersonalDetails);
		   return authenticationRepository.save(user);
	   }
	 
	 public User getUserDetailsbyUserName(String username) {
		 User user = authenticationRepository.findUserByUsername(username).get();
		 UserPersonalDetails userPersonalDetails = userPersonalDetailsRepository.findUserByUserId(user.getUserId()).get();
		 
		 return userPersonalDetails.toUser();
	 }

}
