package com.example.Project.Ecommerce.API.model;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String landmark;
    private String phoneNumber;
    private String zipcode;
    private String state;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Getters and setters
}

