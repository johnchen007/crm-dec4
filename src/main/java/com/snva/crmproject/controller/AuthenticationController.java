package com.snva.crmproject.controller;

import java.security.Principal;
import java.util.List;

import com.snva.crmproject.utility.Roles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snva.crmproject.entity.userDetails.User;
import com.snva.crmproject.service.AuthenticationService;

import lombok.Data;

@Data
class ResponseObject {
    private boolean isCreated;
    private String messsage;

    public ResponseObject(boolean isCreated, String message) {
        super();
        this.isCreated = isCreated;
        this.messsage = message;
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

@CrossOrigin(origins = "${fontEnd.origins}")
@RestController
public class AuthenticationController {
    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

    @Autowired
    private AuthenticationService authenticationService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    //---> Moved to CreateUserController start
    @PostMapping("/register")
    public ResponseEntity<ResponseObject> register(@RequestBody User user) {
        System.out.println(user.getUsername());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        if (authenticationService.createUser(user) == null) {
            return new ResponseEntity<ResponseObject>(new ResponseObject(false, "username exists"), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<ResponseObject>(new ResponseObject(true, "Successfully Created User"), HttpStatus.OK);
    }

    @PreAuthorize("hasAuthority('" + Roles.SUPER_ADMIN + "')")
    @PostMapping("/createRec_admin")
    ResponseEntity<ResponseObject> createRec_admin(@RequestBody User user) {
        System.out.println(user.getUsername());
        user.setRole(Roles.RECRUITER_ADMIN);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        if (authenticationService.createUser(user) == null) {
            return new ResponseEntity<ResponseObject>(new ResponseObject(false, "username exists"), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<ResponseObject>(new ResponseObject(true, "Successfully Created User"), HttpStatus.OK);
    }

    @PreAuthorize("hasAuthority('" + Roles.SUPER_ADMIN + "')")
    @PostMapping("/createTech_admin")
    ResponseEntity<ResponseObject> createTech_admin(@RequestBody User user) {
        System.out.println(user.getUsername());
        user.setRole(Roles.TRAINER_ADMIN);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        if (authenticationService.createUser(user) == null) {
            return new ResponseEntity<ResponseObject>(new ResponseObject(false, "username exists"), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<ResponseObject>(new ResponseObject(true, "Successfully Created User"), HttpStatus.OK);
    }

    @PreAuthorize("hasAuthority('" + Roles.SUPER_ADMIN + "')")
    @PostMapping("/createBD_admin")
    ResponseEntity<ResponseObject> createBD_admin(@RequestBody User user) {
        System.out.println(user.getUsername());
        user.setRole(Roles.BUSINESS_DEV_ADMIN);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        if (authenticationService.createUser(user) == null) {
            return new ResponseEntity<ResponseObject>(new ResponseObject(false, "username exists"), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<ResponseObject>(new ResponseObject(true, "Successfully Created User"), HttpStatus.OK);
    }

    @PreAuthorize("hasAuthority('" + Roles.RECRUITER_ADMIN + "')")
    @PostMapping("/createRecUser")
    ResponseEntity<ResponseObject> createRecUser(@RequestBody User user) {
        System.out.println(user.getUsername());
        user.setRole(Roles.RECRUITER);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        if (authenticationService.createUser(user) == null) {
            return new ResponseEntity<ResponseObject>(new ResponseObject(false, "username exists"), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<ResponseObject>(new ResponseObject(true, "Successfully Created User"), HttpStatus.OK);
    }

    @PreAuthorize("hasAuthority('" + Roles.TRAINER_ADMIN + "')")
    @PostMapping("/createTechUser")
    ResponseEntity<ResponseObject> createTechUser(@RequestBody User user) {
        System.out.println(user.getUsername());
        user.setRole(Roles.TRAINER);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        if (authenticationService.createUser(user) == null) {
            return new ResponseEntity<ResponseObject>(new ResponseObject(false, "username exists"), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<ResponseObject>(new ResponseObject(true, "Successfully Created User"), HttpStatus.OK);
    }

    @PreAuthorize("hasAuthority('" + Roles.BUSINESS_DEV_ADMIN + "')")
    @PostMapping("/createBDUser")
    ResponseEntity<ResponseObject> createBDUser(@RequestBody User user) {
        System.out.println(user.getUsername());
        user.setRole(Roles.BUSINESS_DEV);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        if (authenticationService.createUser(user) == null) {
            return new ResponseEntity<ResponseObject>(new ResponseObject(false, "username exists"), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<ResponseObject>(new ResponseObject(true, "Successfully Created User"), HttpStatus.OK);
    }
    //---> Moved to CreateUserController end

    //moved t AuthenticationBController
    @RequestMapping("/loginEndpoints")
    public User login(Principal user) {
        //System.out.println(user.toString());
        System.out.println(user.getName().isEmpty());
        return authenticationService.getUserDetailsbyUserName(user.getName());
    }


    @RequestMapping("/")
    public User user(Principal user) {
        System.out.println(user.getName().isEmpty());
        return authenticationService.getUserDetailsbyUserName(user.getName());
    }

    @RequestMapping("/getUserById/{userId}")
    public User user(@PathVariable long userId) {
        System.out.println(userId);
        return authenticationService.getUserDetailsbyUserId(userId);
    }

    @RequestMapping("/getAllUsers")
    public List<User> getAllUsers() {
        return authenticationService.getAllUsers();
    }

    @PostMapping("/changePassword")
    User updatePassword(@RequestBody User user) {
        System.out.println(user.getUsername());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return authenticationService.updatePassword(user);
    }

    @PostMapping("/updateUser")
    User updateUser(@RequestBody User user) {
        System.out.println(user.getUsername());
        return authenticationService.updateUser(user);
    }

    @PostMapping("/suspendUser")
    User suspendUser(@RequestBody User user) {
        return authenticationService.suspendUser(user);
    }

}
