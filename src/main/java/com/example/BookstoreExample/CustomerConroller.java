package com.example.BookstoreExample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
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
