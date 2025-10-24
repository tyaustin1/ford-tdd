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
    - Check if vehicle is empty
    - Check the number of passengers currently in the vehicle
    - Add passengers to the vehicle
    - Remove passengers from teh vehicle
    - Check for a specific passenger in the vehicle and return the index (seat) they are located in
    * */

    private String[] passengers;
    private int passengerCount;
    private static final int MAX_CAPACITY = 5;
}
