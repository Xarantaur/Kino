package com.example.kino.service;

import com.example.kino.model.Seat;
import com.example.kino.repositories.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeatService
{
    @Autowired
    private SeatRepository seatRepository;

    public Seat saveSeat(Seat seat){
        return seatRepository.save(seat);
    }
}
