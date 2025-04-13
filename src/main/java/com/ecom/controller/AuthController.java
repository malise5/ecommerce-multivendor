package com.ecom.controller;

import com.ecom.dto.SignupRequest;
import com.ecom.model.User;
import com.ecom.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/auth")
public class AuthController {

    private  UserRepository userRepository;

    public AuthController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }



    @PostMapping("/signup")
    public ResponseEntity<User> createUserHandler(@RequestBody SignupRequest req) {
        User user = new User();
        user.setFullName(req.getFullName());
        user.setEmail(req.getEmail());

        User savedUser = userRepository.save(user);
        return ResponseEntity.ok(savedUser);
    }
}
