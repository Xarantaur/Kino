package com.example.kino.controller;

import com.example.kino.model.Booking;
import com.example.kino.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class BookingRestController
{
    @Autowired
    BookingRepository bookingRepository;

    @GetMapping("/getbookings")
    public List<Booking> getBookings(@RequestParam(name = "customerId")Integer customerId) {
        List<Booking> lstBooking = bookingRepository.findBookingByCustomerId(customerId);
        return lstBooking;
    }
}
