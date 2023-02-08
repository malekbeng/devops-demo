package com.example.usermanagement.service;

import com.example.usermanagement.model.User;
import com.example.usermanagement.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements  UserService{
  private final UserRepository userRepository;
  @Override
  public User addUser(User user) {
    return userRepository.save(user);
  }

  @Override
  public User updateUser(User user, String id) {

  if (userRepository.findById(id).isPresent() == true){
    User userToUpdate = userRepository.findById(id).get();
    userToUpdate.setAge(user.getAge());
    userToUpdate.setNom(user.getNom());
    userToUpdate.setPrenom(user.getPrenom());
    userToUpdate.setProfession(user.getProfession());
    return userRepository.save(userToUpdate);
  }
    return null;
  }

  @Override
  public List<User> retrieveUsers() {
    return userRepository.findAll();
  }

  @Override
  public void deleteUser(String id) {
    userRepository.deleteById(id);
  }
}
