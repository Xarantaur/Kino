package com.example.kino.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Booking
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookingId")
    private int bookingId;
  
    private int customerId;

    @OneToOne
    @JoinColumn(name = "scheduleId", referencedColumnName = "scheduleId")
    Schedule schedule;  // skal være scheduleId.

    @OneToMany
    @JoinColumn(name = "bookingId", referencedColumnName = "bookingId")
    private List<BookedSeat> bookedSeats;


    public Booking(int bookingId, int customerId, Schedule schedule, List<BookedSeat> bookedSeats)
    {
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.schedule = schedule;
        this.bookedSeats = bookedSeats;

    }

    public Booking()
    {

    }

    public List<BookedSeat> getBookedSeatList() {
        return bookedSeats;
    }

    public void setBookedSeatList(List<BookedSeat> bookedSeatList) {
        this.bookedSeats = bookedSeatList;
    }


    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public int getBookingId()
    {
        return bookingId;
    }

    public void setBookingId(int bookingId)
    {
        this.bookingId = bookingId;
    }

    public int getCustomerId()
    {
        return customerId;
    }

    public void setCustomerId(int customerId)
    {
        this.customerId = customerId;
    }

}
