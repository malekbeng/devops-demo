package com.example.usermanagement.dto;

import com.example.usermanagement.model.User;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Data
public class UserDto {

    private String userId;
    private String nom;
    private String prenom;
    private int age;
    private String profession;

    public User userDtoToUser(){
        User u = new User();
        u.setAge(age);
        u.setProfession(profession);
        u.setNom(nom);
        u.setPrenom(prenom);
    return u ;
    }

}
