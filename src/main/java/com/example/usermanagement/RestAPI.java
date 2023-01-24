package com.example.usermanagement;

import com.example.usermanagement.model.User;
import com.example.usermanagement.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class RestAPI {
  private final UserServiceImpl userService;

  @PostMapping
  private ResponseEntity<User> addUser(@RequestBody User user){
    return ResponseEntity.status(HttpStatus.CREATED).body(userService.addUser(user));
  }

}
