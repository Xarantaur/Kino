package com.example.kino.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Booking
{
    @Id
    private int bookingId;
    private String firstName;
    private String lastName;
    private int customerId;
    private int movieId;
    private int seatId;

    public Booking(int bookingId, String firstName, String lastName, int customerId, int movieId, int seatId)
    {
        this.bookingId = bookingId;
        this.firstName = firstName;
        this.lastName = lastName;
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

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
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
