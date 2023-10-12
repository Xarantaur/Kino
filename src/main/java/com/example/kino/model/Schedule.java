package com.example.kino.model;

import jakarta.persistence.*;

import java.sql.Time;
import java.time.LocalDate;

@Entity
public class Schedule
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public int getScheduleId()
    {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId)
    {
        this.scheduleId = scheduleId;
    }

    public int getMovieId()
    {
        return movieId;
    }

    public void setMovieId(int movieId)
    {
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

}
