package com.example.kino.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Movie
{
    @Id
    private int movieId;
    private String title;
    private String length;
    private String cast;
    private String description;


        //Constructor
    public Movie(int movieId, String title, String length, String cast, String description)
    {
        this.movieId = movieId;
        this.title = title;
        this.length = length;
        this.cast = cast;
        this.description = description;
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
}
