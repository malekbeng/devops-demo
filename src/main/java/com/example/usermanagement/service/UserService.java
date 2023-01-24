package com.example.usermanagement.service;

import com.example.usermanagement.model.User;

import java.util.List;

public interface UserService {
  User addUser(User user);
  User updateUser(User user, String id);
  List<User> retrieveUsers();
  void deleteUser(String id);

}
