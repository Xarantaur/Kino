package com.example.kino.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Booking
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingId;
  
    private int customerId;
    private int movieId;  // skal være scheduleId.
    private int seatId;

    public Booking(int bookingId, int customerId, int movieId, int seatId)
    {
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.movieId = movieId;
        this.seatId = seatId;
    }

    public Booking()
    {

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

    public int getMovieId()
    {
        return movieId;
    }

    public void setMovieId(int movieId)
    {
        this.movieId = movieId;
    }

    public int getSeatId()
    {
        return seatId;
    }

    public void setSeatId(int seatId)
    {
        this.seatId = seatId;
    }
}
