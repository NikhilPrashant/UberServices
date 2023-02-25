package com.driver.model;

import javax.persistence.*;

@Entity(name = "cab")
public class Cab {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int perKmRate;
    boolean available;
    String password;

    public Cab() {
    }

    @OneToOne(mappedBy = "cab",cascade = CascadeType.ALL)
    Driver driver;

    public Cab(int id, int perKmRate, boolean available, String password, Driver driver) {
        this.id = id;
        this.perKmRate = perKmRate;
        this.available = available;
        this.password = password;
        this.driver = driver;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPerKmRate() {
        return perKmRate;
    }

    public void setPerKmRate(int perKmRate) {
        this.perKmRate = perKmRate;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}