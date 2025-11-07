package com.ford.ford_tdd;

public class Vehicle {

    public final String[] passengers;
    private int passengerCount;
    private static final int MAX_CAPACITY = 5; // Define the maximum capacity

    public Vehicle() {
        this.passengers = new String[MAX_CAPACITY];
        this.passengerCount = 0;
    }

    public boolean addPassenger() { return false; }

    public boolean removePassenger() { return false; }

    public String getPassengerByIndex() { return ""; }

    public int findPassenger() { return -2; }

    public int getPassengerCount() { return -1; }
}
