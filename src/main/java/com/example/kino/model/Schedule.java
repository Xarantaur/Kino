package com.example.kino.model;

import java.time.LocalDate;

public class Schedule
{
    LocalDate localdate;

    private int moveId;

    public Schedule(LocalDate localdate, int moveId)
    {
        this.localdate = localdate;
        this.moveId = moveId;
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
