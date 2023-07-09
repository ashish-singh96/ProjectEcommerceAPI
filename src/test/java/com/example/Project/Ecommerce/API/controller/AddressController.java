package com.example.Project.Ecommerce.API.controller;

@RestController
@RequestMapping("/addresses")
public class AddressController {
    @Autowired
    private AddressRepository addressRepository;

    @GetMapping
    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    @GetMapping("/{addressId}")
    public Address getAddressById(@PathVariable Integer addressId) {
        return addressRepository.findById(addressId).orElse(null);
    }
}

