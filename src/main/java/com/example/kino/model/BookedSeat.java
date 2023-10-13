package com.example.kino.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class BookedSeat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookedSeatId")
    int bookedSeatId;


    @OneToOne
    @JoinColumn(name = "seatId", referencedColumnName = "seatId")
    Seat seat;

    public BookedSeat(int bookedSeatId, Seat seat)
    {
        this.bookedSeatId = bookedSeatId;
        this.seat = seat;
    }

    public BookedSeat()
    {

    }

    public int getBookedSeatId() {
        return bookedSeatId;
    }

    public void setBookedSeatId(int bookedSeatId) {
        this.bookedSeatId = bookedSeatId;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

}
