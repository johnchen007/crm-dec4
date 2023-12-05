package com.snva.crmproject.service;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snva.crmproject.entity.User;
import com.snva.crmproject.repository.AccountRepository;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    
    public Optional<User> getAccountByEmail(String email) {
        return AccountRepository.findByEmail(email);
    }

    public Optional<User> getAccountByUsername(String username) {
        return AccountRepository.findByUsername(username);
    }


    public void deleteUserById(Long userId) {
        accountRepository.deleteById(userId);
    }
    
    public Optional<User> getAccountByUsernameAndEmail(String username, String email) {
        if (username != null && email != null) {
            // logic 
            return accountRepository.findByUsernameAndEmail(username, email);
        } else {
            return Optional.empty(); 
        }
    }

}