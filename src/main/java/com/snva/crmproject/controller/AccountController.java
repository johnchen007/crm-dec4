package com.snva.crmproject.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.snva.crmproject.entity.User;
import com.snva.crmproject.service.AccountService;


@RestController
@RequestMapping("/users")
@CrossOrigin(origins="http://localhost:4200/")
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/searchAccount")
    public ResponseEntity<User> getUserByUsernameAndEmail(
            @RequestParam(required = true) String username,
            @RequestParam(required = true) String email
    ) {
        Optional<User> user = accountService.getAccountByUsernameAndEmail(username, email);

        return user.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    
    @DeleteMapping("/account/{userId}")
    public ResponseEntity<String> deleteUser(@PathVariable Long userId) {
        accountService.deleteUserById(userId);
        return new ResponseEntity<>("User deleted successfully", HttpStatus.OK);
    }
}