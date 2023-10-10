package com.example.kino.controller;

import com.example.kino.model.Seat;
import com.example.kino.repositories.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin
@RestController
@RequestMapping()
public class SeatRestController
{


    @Autowired
    SeatRepository seatRepository;

    public SeatRestController(SeatRepository seatRepository) {
        this.seatRepository = seatRepository;
    }

    @GetMapping("/getseats")
    public List<Seat> getAllSeats(){
    return seatRepository.findAll();
    }

    @PostMapping("/saveseats")
    public Seat createSeat(@RequestBody Seat seat){
        return seatRepository.save(seat);
    }
}
