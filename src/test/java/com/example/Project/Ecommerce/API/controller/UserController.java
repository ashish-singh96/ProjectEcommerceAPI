package com.example.Project.Ecommerce.API.controller;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable Integer userId) {
        return userRepository.findById(userId).orElse(null);
    }
}
