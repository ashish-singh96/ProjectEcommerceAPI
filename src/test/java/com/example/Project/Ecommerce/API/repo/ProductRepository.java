package com.example.Project.Ecommerce.API.repo;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByCategory(String category);
}
