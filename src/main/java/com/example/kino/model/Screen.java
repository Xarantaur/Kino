package com.example.kino.model;


import org.springframework.data.annotation.Id;

public class Screen
{


    private int availableSeat = 0;
    private int capacity = 0;
    @Id
    private int screenId = 0;

    public Screen(int availableSeat, int capacity, int screenId)
    {
        this.availableSeat = availableSeat;
        this.capacity = capacity;
        this.screenId = screenId;
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
