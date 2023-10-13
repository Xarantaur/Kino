package com.example.kino.repositories;

import ch.qos.logback.core.model.INamedModel;
import com.example.kino.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer>
{
    List<Booking> findBookingByCustomerId(Integer customerId);
}

