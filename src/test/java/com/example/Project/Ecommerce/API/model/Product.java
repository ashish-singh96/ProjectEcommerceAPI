package com.example.Project.Ecommerce.API.model;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer price;
    private String description;
    private String category;
    private String brand;

    // Getters and setters
}
