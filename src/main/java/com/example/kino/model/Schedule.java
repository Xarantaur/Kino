package com.example.kino.model;

import jakarta.persistence.*;

import java.sql.Time;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Schedule
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int scheduleId;
    private LocalDate localdate;

    @Column(columnDefinition = "TIME")
    private Time time;


    @ManyToOne
    @JoinColumn(name = "movieId")
    Movie movie;

    public Schedule(LocalDate localdate, Time time, Movie movie)
    {
        this.localdate = localdate;
        this.time = time;
        this.movie = movie;
    }



    public Schedule()
    {

    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public LocalDate getLocaldate()
    {
        return localdate;
    }

    public void setLocaldate(LocalDate localdate)
    {
        this.localdate = localdate;
    }


    public int getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

}


