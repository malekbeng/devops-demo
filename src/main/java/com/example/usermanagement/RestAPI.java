package com.example.usermanagement;

import com.example.usermanagement.model.User;
import com.example.usermanagement.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class RestAPI {
    private final UserServiceImpl userService;

    @PostMapping
    private ResponseEntity<User> addUser(@RequestBody User user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.addUser(user));
    }

    @GetMapping
    private ResponseEntity<List<User>> getUser() {
        return ResponseEntity.status(HttpStatus.OK).body(userService.retrieveUsers());
    }

    @PutMapping("/{id}")
    private ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable String id) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.updateUser(user, id));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    private void  deleteUser( @PathVariable String id) {
        userService.deleteUser(id);

    }


}
