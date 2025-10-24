package com.ford.ford_tdd.key;

public class VehicleAnswer {



    private final String[] passengers;
    private int passengerCount;
    private static final int MAX_CAPACITY = 5; // Define the maximum capacity

    // Constructor to initialize the passengers array
    public VehicleAnswer() {
        this.passengers = new String[MAX_CAPACITY];
        this.passengerCount = 0;
    }

    /**
     * Adds a passenger to the first empty index in the array.
     *
     * @param passengerName The name of the passenger to add.
     * @return true if the passenger was added successfully, false if the vehicle is full.
     */
    public boolean addPassenger(String passengerName) {
        if (passengerCount < MAX_CAPACITY) {
            passengers[passengerCount] = passengerName;
            passengerCount++;
            System.out.println(passengerName + " added. Current passengers: " + passengerCount + "/" + MAX_CAPACITY);
            return true;
        } else {
            System.out.println("Vehicle is full. Cannot add " + passengerName);
            return false;
        }
    }

    /**
     * Removes a specified passenger from the array.
     * If multiple passengers have the same name, only the first occurrence is removed.
     *
     * @param passengerName The name of the passenger to remove.
     * @return true if the passenger was removed successfully, false if the passenger was not found.
     */
    public boolean removePassenger(String passengerName) {
        int indexToRemove = findPassenger(passengerName); // Use the findPassenger method
        if (indexToRemove != -1) {
            // Shift elements to the left to fill the gap
            for (int i = indexToRemove; i < passengerCount - 1; i++) {
                passengers[i] = passengers[i + 1];
            }
            passengers[passengerCount - 1] = null; // Clear the last element
            passengerCount--;
            System.out.println(passengerName + " removed. Current passengers: " + passengerCount + "/" + MAX_CAPACITY);
            return true;
        } else {
            System.out.println(passengerName + " not found in the vehicle.");
            return false;
        }
    }

    /**
     * Retrieves the passenger at a specific index.
     *
     * @param index The index of the passenger to retrieve.
     * @return The name of the passenger at the specified index, or null if the index is out of bounds.
     */
    public String getPassengerByIndex(int index) {
        if (index >= 0 && index < passengerCount) {
            return passengers[index];
        } else {
            System.out.println("Invalid index: " + index + ". Current passenger count: " + passengerCount);
            return null;
        }
    }

    /**
     * Finds the index of a specified passenger in the array.
     *
     * @param passengerName The name of the passenger to find.
     * @return The index of the passenger if found, otherwise -1.
     */
    public int findPassenger(String passengerName) {
        for (int i = 0; i < passengerCount; i++) {
            if (passengers[i] != null && passengers[i].equals(passengerName)) {
                return i;
            }
        }
        return -1; // Passenger not found
    }

    // Optional: A method to display all passengers
    public void displayPassengers() {
        if (passengerCount == 0) {
            System.out.println("No passengers in the vehicle.");
            return;
        }
        System.out.print("Passengers in vehicle (" + passengerCount + "/" + MAX_CAPACITY + "): [");
        for (int i = 0; i < passengerCount; i++) {
            System.out.print(passengers[i]);
            if (i < passengerCount - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Optional: Getter for passengerCount
    public int getPassengerCount() {
        return passengerCount;
    }

}
