package com.example.Project.Ecommerce.API.model;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String password;
    private String phoneNumber;

    // Getters and setters
}
