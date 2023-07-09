package com.example.Project.Ecommerce.API.controller;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("/{orderId}")
    public Order getOrderById(@PathVariable Integer orderId) {
        return orderRepository.findById(orderId).orElse(null);
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return orderRepository.save(order);
    }
}
