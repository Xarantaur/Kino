package com.example.kino.model;

import jakarta.persistence.*;

@Entity
public class Seat
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seatId")
    private long seatId;
    private String seatNumber;
    private String seatRow;
    private int scheduleId;

    private int screenId;


    public String getSeatNumber()
    {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber)
    {
        this.seatNumber = seatNumber;
    }

    public String getseatRow()
    {
        return seatRow;
    }

    public void setseatRow(String seatRow)
    {
        this.seatRow = seatRow;
    }

    public Seat(){

    }

    public Seat(long seatId, String seatNumber, String seatRow, int scheduleId, int screenId)
    {
        this.seatId = seatId;
        this.seatNumber = seatNumber;
        this.seatRow = seatRow;
        this.scheduleId = scheduleId;
        this.screenId = screenId;
    }

    public int getScreenId()
    {
        return screenId;
    }

    public void setScreenId(int screenId)
    {
        this.screenId = screenId;
    }

    public int getScheduleId()
    {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId)
    {
        this.scheduleId = scheduleId;
    }


    public long getSeatId()
    {
        return seatId;
    }

    public void setSeatId(long seatId)
    {
        this.seatId = seatId;
    }
}
