package com.example.usermanagement;

import com.example.usermanagement.model.User;
import com.example.usermanagement.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class UserManagementApplicationTests {

  @Autowired
  UserRepository userRepository ;
  @Test
  public void addUserTest (){
    User user = new User();
    user.setAge(26);
    user.setPrenom("test");
    user.setNom("test");
    user.setProfession("test");
    userRepository.save(user);
    assertNotNull(user.getUserId());
  }

  @Test
  void contextLoads() {
  }

}
