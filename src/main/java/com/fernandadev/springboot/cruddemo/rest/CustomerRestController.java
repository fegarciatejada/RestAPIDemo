package com.fernandadev.springboot.cruddemo.rest;


import com.fernandadev.springboot.cruddemo.entity.Customer;
import com.fernandadev.springboot.cruddemo.dao.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/customers")
public class CustomerRestController {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerRestController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Customer> getCustomer(@PathVariable int id) {
        return customerRepository.findById(id);
    }

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer) {
//        customer.setId(0);
        customerRepository.save(customer);
        return customer;
    }

    @PutMapping
    public Customer updateCustomer(@RequestBody Customer customer) {
        customerRepository.save(customer);
        return customer;
    }

    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable int id) {
        customerRepository.deleteById(id);
        return "Deleted customer id - " + id;
    }
}

