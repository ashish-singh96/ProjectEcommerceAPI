package com.example.Project.Ecommerce.API.controller;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping(params = "category")
    public List<Product> getProductsByCategory(@RequestParam("category") String category) {
        return productRepository.findByCategory(category);
    }

    @DeleteMapping("/{productId}")
    public void deleteProductById(@PathVariable Integer productId) {
        productRepository.deleteById(productId);
    }
}
