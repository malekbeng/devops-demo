package com.example.usermanagement;

import com.example.usermanagement.dto.UserDto;
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
    private UserServiceImpl userService;

    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody UserDto user) {
        User u = user.userDtoToUser() ;
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.addUser(u));
    }

    @GetMapping
    public ResponseEntity<List<User>> getUser() {
        return ResponseEntity.status(HttpStatus.OK).body(userService.retrieveUsers());
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@RequestBody UserDto user, @PathVariable String id) {
        User u = user.userDtoToUser() ;
        return ResponseEntity.status(HttpStatus.OK).body(userService.updateUser(u, id));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void  deleteUser( @PathVariable String id) {
        userService.deleteUser(id);

    }


}
