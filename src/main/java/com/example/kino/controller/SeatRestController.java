package com.example.kino.controller;

import com.example.kino.model.Seat;
import com.example.kino.repositories.SeatRepository;
import com.example.kino.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping()
public class SeatRestController
{

    @Autowired
    SeatService seatService;
    @Autowired
    SeatRepository seatRepository;

    public SeatRestController(SeatRepository seatRepository) {
        this.seatRepository = seatRepository;
    }

    @GetMapping("/getseats")
    public ResponseEntity<List<Seat>> getSavedSeats(@RequestParam ("scheduleId") Long scheduleId,
                                                    @RequestParam ("screenId") Long screenId)
    {
        List<Seat> seats = seatRepository.findByScheduleIdAndScreenId(scheduleId, screenId);
        System.out.println(seats.toString());
        return new ResponseEntity<>(seats, HttpStatus.OK);
    }

    @PostMapping("/save/seats")
    public ResponseEntity<String> saveSelectedSeats(@RequestBody List<String> selectedSeats,
                                                    @RequestBody int screenId,
                                                    @RequestBody int scheduleId){

        try{
            System.out.println("Received selected seats: " + selectedSeats);

            List<Seat> seatsToSave = new ArrayList<>();

            for(String seatInfo : selectedSeats){
                String[] parts = seatInfo.split("-");
                if(parts.length !=2) {
                    return ResponseEntity.badRequest().body("Invalid seat number" + seatInfo);
                }
                String seatRow = parts[0];
                String seatNumber = parts[1];

                Seat seat = new Seat();
               /* // midlertidig:
                seat.setScheduleId(scheduleId);
                seat.setScreenId(screenId);
                */ // midlertidig ^
                seat.setseatRow(seatRow);
                seat.setSeatNumber(seatNumber);
                seatService.saveSeat(seat);

            }
            return ResponseEntity.ok("Selected seats Saved.");
        }catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("error saving selected Seats");
        }

    }
}
