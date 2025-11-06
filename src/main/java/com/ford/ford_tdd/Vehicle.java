package com.ford.ford_tdd;

public class Vehicle {

    /*
    Basic initialization (empty state)
    Add Passenger
    Remove Passenger

    * Unordered collection of objects
    No duplicates
    Only primitive types (no lists or collections)
    For this exercise, array size will be limited to 5 (vehicle seats 6, driver is not included)

    Follow Red->Green->Refactor
    Write a failing test (Red)
    Write just enough code to pass test (Green)
    Clean up implementation and test code once passing (Refactor)

    Write implementation and test cases for the following operations:
    - Check the number of passengers currently in the vehicle
    - Add passengers to the vehicle
    - Remove passengers from teh vehicle
    - Get seat/index of passenger by name
    - Get name of passenger in specified seat/index
    * */

    private final String[] passengers;
    private int passengerCount;
    private static final int MAX_CAPACITY = 5; // Define the maximum capacity

    public Vehicle() {
        this.passengers = new String[MAX_CAPACITY];
        this.passengerCount = 0;
    }

    public void addPassenger() {}

    public void removePassenger() {}

    public void getPassengerByIndex() {}

    public void findPassenger() {}

    public void getPassengerCount() {}
}
