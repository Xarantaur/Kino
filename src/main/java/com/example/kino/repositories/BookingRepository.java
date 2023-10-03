package com.example.kino.repositories;

import com.example.kino.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface BookingRepository extends JpaRepository<Booking, String>
{
}

