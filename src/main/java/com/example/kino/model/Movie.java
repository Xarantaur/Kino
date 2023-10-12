package com.example.kino.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class Movie
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movieId;
    private String hfreffoto;
    private String title;
    private String length;
    private String cast;
    private String description;
    @OneToOne
    @JoinColumn(name = "screenId", referencedColumnName = "screenId")
    Screen screen;

    public Movie(int movieId, String hfreffoto, String title, String length, String cast, String description, Screen screen)
    {
        this.movieId = movieId;
        this.hfreffoto = hfreffoto;
        this.title = title;
        this.length = length;
        this.cast = cast;
        this.description = description;
        this.screen = screen;
    }

    //Constructor

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

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }
}
