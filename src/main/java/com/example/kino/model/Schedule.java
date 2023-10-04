package com.example.kino.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;
@Entity
public class Schedule
{

    LocalDate localdate;
@Id
    private int moveId;

    public Schedule(LocalDate localdate, int moveId)
    {
        this.localdate = localdate;
        this.moveId = moveId;
    }

    public Schedule()
    {

    }

    public LocalDate getLocaldate()
    {
        return localdate;
    }

    public void setLocaldate(LocalDate localdate)
    {
        this.localdate = localdate;
    }

    public int getMoveId()
    {
        return moveId;
    }

    public void setMoveId(int moveId)
    {
        this.moveId = moveId;
    }
}
