package com.example.BookstoreExample;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerConroller {

    private CustomerRepository customerRepository;

    public CustomerConroller(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/customers")
    public List<Customer> getCustomers() { return (List<Customer>) customerRepository.findAll(); }

    @PostMapping("/customers")
    public void addCustomers(@RequestBody Customer customer) { customerRepository.save(customer); }
}
