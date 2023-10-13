package com.example.kino.model;

import jakarta.persistence.*;

@Entity
public class BookedSeat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookedSeatId")
    int bookedSeatId;

    @ManyToOne
    @JoinColumn(name = "bookingId", referencedColumnName = "bookingId")
    Booking booking;

    @OneToOne
    @JoinColumn(name = "seatId", referencedColumnName = "seatId")
    Seat seat;

    public BookedSeat(int bookedSeatId, Booking booking, Seat seat)
    {
        this.bookedSeatId = bookedSeatId;
        this.booking = booking;
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

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

}
