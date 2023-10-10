package com.example.kino.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.sql.Time;
import java.time.LocalDate;

@Entity
public class Schedule
{
    @Id
    private int scheduleId;
    private LocalDate localdate;

    @Column(columnDefinition = "TIME")
    private Time time;

    private int movieId;

    public Schedule(LocalDate localdate, Time time, int movieId)
    {
        this.localdate = localdate;
        this.time = time;
        this.movieId = movieId;
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

    public int getmovieId()
    {
        return movieId;
    }

    public void setmovieId(int movieId)
    {
        this.movieId = movieId;
    }
}
