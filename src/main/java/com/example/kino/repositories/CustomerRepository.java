package com.example.kino.repositories;


import com.example.kino.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String>
{
    Optional<Customer> findByEmailAndPassword(String email, String password);
    Customer findCustomerByEmailAndPassword(String email, String password);
}
