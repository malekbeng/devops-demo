package com.example.usermanagement.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class User {

    @GeneratedValue(
            generator = "uuid"
    )
    @GenericGenerator(
            name = "uuid",
            strategy = "uuid2"
    )
    @Column(
            name = "id",
            updatable = false,
            nullable = false,
            length = 36
    )
    @Id
    private String userId;
    private String nom;
    private String prenom;
    private int age;
    private String profession;


}