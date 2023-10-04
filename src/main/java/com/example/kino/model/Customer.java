package com.example.kino.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Customer
{
    private String email;
    private String password;
    @Id
    private int customerId;
    private String firstName;
    private String lastName;

    public Customer(String email, String password, int customerId, String firstName, String lastName)
    {
        this.email = email;
        this.password = password;
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer()
    {

    }

    public String getemail()
    {
        return email;
    }

    public void setemail(String email)
    {
        this.email = email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public int getCustomerId()
    {
        return customerId;
    }

    public void setCustomerId(int customerId)
    {
        this.customerId = customerId;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
}
