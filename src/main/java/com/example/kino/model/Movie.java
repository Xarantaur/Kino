package com.example.kino.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Movie
{
    @Id
    private int movieId;

    private String hfreffoto;
    private String title;
    private String length;
    private String cast;
    private String description;
    @JsonBackReference
    @OneToMany(mappedBy = "movie")
    List<Schedule> schedule;


        //Constructor
    public Movie(int movieId, String hfreffoto, String title, String length, String cast, String description, List<Schedule> schedule)
    {
        this.movieId = movieId;
        this.hfreffoto = hfreffoto;
        this.title = title;
        this.length = length;
        this.cast = cast;
        this.description = description;
        this.schedule = schedule;
    }

    public Movie()
    {

    }

    //getter and setters
    public int getMovieId()
    {
        return movieId;
    }

    public void setMovieId(int movieId)
    {
        this.movieId = movieId;
    }

    public String getHfreffoto() {
        return hfreffoto;
    }

    public void setHfreffoto(String hfreffoto) {
        this.hfreffoto = hfreffoto;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getLength()
    {
        return length;
    }

    public void setLength(String length)
    {
        this.length = length;
    }

    public String getCast()
    {
        return cast;
    }

    public void setCast(String cast)
    {
        this.cast = cast;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public List<Schedule> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<Schedule> schedule) {
        this.schedule = schedule;
    }
}
