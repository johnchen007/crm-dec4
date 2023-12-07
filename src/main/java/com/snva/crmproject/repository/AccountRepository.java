package com.snva.crmproject.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.snva.crmproject.entity.User;

public interface AccountRepository extends JpaRepository<User, Long> {
    
	static Optional<User> findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

    static Optional<User> findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
		
	}
    Optional<User> findByUsernameAndEmail(String username, String email);
}