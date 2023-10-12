package com.example.kino.repositories;

import com.example.kino.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface BookingRepository extends JpaRepository<Booking, String>
{
    List<Booking> findBookingByCustomerId(String customerId);
}

