package com.example.kino.controller;

import com.example.kino.model.Customer;
import com.example.kino.repositories.CustomerRepository;
import com.example.kino.service.PasswordHashing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
public class CustomerRestController
{


    PasswordHashing passwordHashing = new PasswordHashing();
    @Autowired
    CustomerRepository customerRepository;

    @PostMapping("/loginuser")
    public ResponseEntity<String> getLoginCustomer(@RequestBody Customer customer) {
        String email = customer.getemail();
        String password = passwordHashing.doHashing(customer.getPassword());

        Optional<Customer> userOptional = customerRepository.findByEmailAndPassword(email, password);

        if(userOptional.isPresent()){
            return ResponseEntity.ok("Login succesful");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Invalid email or code");
        }
    }

    @GetMapping("/getuser")
    public ResponseEntity<Customer> getCustomer(
            @RequestParam(name = "email") String sentemail,
            @RequestParam(name = "password") String sentpassword
    ) {

        Customer foundCustomer = customerRepository.findCustomerByEmailAndPassword(sentemail, passwordHashing.doHashing(sentpassword));

        if(foundCustomer != null) {
            return ResponseEntity.ok(foundCustomer);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/user")
    public ResponseEntity<Customer> postCustomer(@RequestBody Customer customer) {
        System.out.println(customer);
        customer.setPassword(passwordHashing.doHashing(customer.getPassword()));
        Customer savedCustomer = customerRepository.save(customer);;

        if (savedCustomer == null) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        } else {
            return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
        }

    }
}
