package com.example.kino.controller;

import com.example.kino.model.Customer;
import com.example.kino.repositories.CustomerRepository;
import com.example.kino.service.PasswordHashing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class CustomerRestController
{

    PasswordHashing passwordHashing;
    @Autowired
    CustomerRepository customerRepository;

    @PostMapping("/createuser")
    public ResponseEntity<Customer> postCustomer(@RequestBody Customer customer) {
        customer.setPassword(passwordHashing.doHashing(customer.getPassword()));
        Customer savedCustomer = customerRepository.save(customer);
        if (savedCustomer == null) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        } else {
            return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
        }

    }
}
