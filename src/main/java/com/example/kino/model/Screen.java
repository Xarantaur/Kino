package com.example.kino.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class Screen
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int screenId;
    private int availableSeat;
    private int capacity;
    @JsonBackReference
    @OneToOne(mappedBy = "screen")
    Movie movie;


    public Screen(int availableSeat, int capacity, int screenId)
    {
        this.availableSeat = availableSeat;
        this.capacity = capacity;
        this.screenId = screenId;
    }

    public Screen()
    {

    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public int getAvailableSeat()
    {
        return availableSeat;
    }

    public void setAvailableSeat(int availableSeat)
    {
        this.availableSeat = availableSeat;
    }

    public int getCapacity()
    {
        return capacity;
    }

    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }

    public int getScreenId()
    {
        return screenId;
    }

    public void setScreenId(int screenId)
    {
        this.screenId = screenId;
    }
}
