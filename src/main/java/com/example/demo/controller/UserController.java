package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/users/")
public class UserController {

  @Autowired
  private UserRepository userRepository;

  @GetMapping("getUsers")
  public List<User> getUsers() {
    return (List<User>) userRepository.findAll();
  }

  @PostMapping("addUser")
  public ResponseEntity<User> addUser(@Valid @RequestBody User user) {
    User savedUser = userRepository.save(user);
    return ResponseEntity.ok(savedUser);
  }
}
