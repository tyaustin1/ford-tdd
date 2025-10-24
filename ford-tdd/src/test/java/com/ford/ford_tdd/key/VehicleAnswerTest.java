package com.ford.ford_tdd.key;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehicleAnswerTest {

    private VehicleAnswer vehicleAnswer; // Declare a Vehicle instance

    // This method runs before each test case, ensuring a fresh Vehicle object
    @BeforeEach
    void setUp() { // [11, 12, 13, 14, 15]
        vehicleAnswer = new VehicleAnswer(); // [11, 12, 13, 14, 15]
    }

    // --- Tests for addPassenger method ---

    @Test
    @DisplayName("Should add a passenger when there is space")
    void addPassenger_Success() {
        assertTrue(vehicleAnswer.addPassenger("Alice")); // [3, 5]
        assertEquals(1, vehicleAnswer.getPassengerCount()); // [3, 5]
        assertEquals("Alice", vehicleAnswer.getPassengerByIndex(0)); // [3, 5]
    }

    @Test
    @DisplayName("Should add multiple passengers up to capacity")
    void addPassenger_FillToCapacity() {
        vehicleAnswer.addPassenger("Alice");
        vehicleAnswer.addPassenger("Bob");
        vehicleAnswer.addPassenger("Charlie");
        vehicleAnswer.addPassenger("David");
        vehicleAnswer.addPassenger("Eve");
        assertEquals(5, vehicleAnswer.getPassengerCount()); // [3, 5]
        assertFalse(vehicleAnswer.addPassenger("Frank")); // [3, 5] // Should not add when full
        assertEquals(5, vehicleAnswer.getPassengerCount()); // [3, 5]
    }

    @Test
    @DisplayName("Should not add passenger when vehicle is full")
    void addPassenger_VehicleFull() {
        // Fill the vehicle
        vehicleAnswer.addPassenger("P1");
        vehicleAnswer.addPassenger("P2");
        vehicleAnswer.addPassenger("P3");
        vehicleAnswer.addPassenger("P4");
        vehicleAnswer.addPassenger("P5");

        assertFalse(vehicleAnswer.addPassenger("Overload")); // [3, 5]
        assertEquals(5, vehicleAnswer.getPassengerCount()); // [3, 5]
    }

    @Test
    @DisplayName("Should handle adding null passenger name")
    void addPassenger_NullName() {
        assertTrue(vehicleAnswer.addPassenger(null)); // [3, 5]
        assertEquals(1, vehicleAnswer.getPassengerCount()); // [3, 5]
        assertNull(vehicleAnswer.getPassengerByIndex(0)); // [3]
    }

    // --- Tests for removePassenger method ---

    @Test
    @DisplayName("Should remove an existing passenger")
    void removePassenger_Success() {
        vehicleAnswer.addPassenger("Alice");
        vehicleAnswer.addPassenger("Bob");
        assertTrue(vehicleAnswer.removePassenger("Alice")); // [3, 5]
        assertEquals(1, vehicleAnswer.getPassengerCount()); // [3, 5]
        assertEquals("Bob", vehicleAnswer.getPassengerByIndex(0)); // [3, 5] // Bob should shift to index 0
    }

    @Test
    @DisplayName("Should remove the first occurrence of a passenger with duplicate names")
    void removePassenger_DuplicateNames() {
        vehicleAnswer.addPassenger("Alice");
        vehicleAnswer.addPassenger("Bob");
        vehicleAnswer.addPassenger("Alice"); // Add Alice again
        assertEquals(3, vehicleAnswer.getPassengerCount()); // [3, 5]

        assertTrue(vehicleAnswer.removePassenger("Alice")); // [3, 5] // Should remove the first Alice
        assertEquals(2, vehicleAnswer.getPassengerCount()); // [3, 5]
        assertEquals("Bob", vehicleAnswer.getPassengerByIndex(0)); // [3, 5]
        assertEquals("Alice", vehicleAnswer.getPassengerByIndex(1)); // [3, 5]
    }

    @Test
    @DisplayName("Should not remove a non-existent passenger")
    void removePassenger_NotFound() {
        vehicleAnswer.addPassenger("Alice");
        assertFalse(vehicleAnswer.removePassenger("Bob")); // [3, 5]
        assertEquals(1, vehicleAnswer.getPassengerCount()); // [3, 5]
        assertEquals("Alice", vehicleAnswer.getPassengerByIndex(0)); // [3, 5]
    }

    @Test
    @DisplayName("Should not remove from an empty vehicle")
    void removePassenger_EmptyVehicle() {
        assertFalse(vehicleAnswer.removePassenger("Alice")); // [3, 5]
        assertEquals(0, vehicleAnswer.getPassengerCount()); // [3, 5]
    }

    @Test
    @DisplayName("Should remove the last passenger successfully")
    void removePassenger_LastPassenger() {
        vehicleAnswer.addPassenger("Solo");
        assertTrue(vehicleAnswer.removePassenger("Solo")); // [3, 5]
        assertEquals(0, vehicleAnswer.getPassengerCount()); // [3, 5]
        assertNull(vehicleAnswer.getPassengerByIndex(0)); // [3] // Should be null or out of bounds
    }

    // --- Tests for getPassengerByIndex method ---

    @Test
    @DisplayName("Should return correct passenger for a valid index")
    void getPassengerByIndex_ValidIndex() {
        vehicleAnswer.addPassenger("Alice");
        vehicleAnswer.addPassenger("Bob");
        assertEquals("Alice", vehicleAnswer.getPassengerByIndex(0)); // [3, 5]
        assertEquals("Bob", vehicleAnswer.getPassengerByIndex(1)); // [3, 5]
    }

    @Test
    @DisplayName("Should return null for an out-of-bounds negative index")
    void getPassengerByIndex_NegativeIndex() {
        vehicleAnswer.addPassenger("Alice");
        assertNull(vehicleAnswer.getPassengerByIndex(-1)); // [3]
    }

    @Test
    @DisplayName("Should return null for an index beyond current passenger count")
    void getPassengerByIndex_IndexTooHigh() {
        vehicleAnswer.addPassenger("Alice");
        assertNull(vehicleAnswer.getPassengerByIndex(1)); // [3] // passengerCount is 1, index 1 is invalid
        assertNull(vehicleAnswer.getPassengerByIndex(5)); // [3] // MAX_CAPACITY is 5, but only 1 passenger
    }

    @Test
    @DisplayName("Should return null for index in an empty vehicle")
    void getPassengerByIndex_EmptyVehicle() {
        assertNull(vehicleAnswer.getPassengerByIndex(0)); // [3]
    }

    // --- Tests for findPassenger method ---

    @Test
    @DisplayName("Should return correct index for an existing passenger")
    void findPassenger_Found() {
        vehicleAnswer.addPassenger("Alice");
        vehicleAnswer.addPassenger("Bob");
        vehicleAnswer.addPassenger("Charlie");
        assertEquals(0, vehicleAnswer.findPassenger("Alice")); // [3, 5]
        assertEquals(1, vehicleAnswer.findPassenger("Bob")); // [3, 5]
        assertEquals(2, vehicleAnswer.findPassenger("Charlie")); // [3, 5]
    }

    @Test
    @DisplayName("Should return -1 for a non-existent passenger")
    void findPassenger_NotFound() {
        vehicleAnswer.addPassenger("Alice");
        assertEquals(-1, vehicleAnswer.findPassenger("Zoe")); // [3, 5]
    }

    @Test
    @DisplayName("Should return -1 for an empty vehicle")
    void findPassenger_EmptyVehicle() {
        assertEquals(-1, vehicleAnswer.findPassenger("Alice")); // [3, 5]
    }

    @Test
    @DisplayName("Should return the first index for duplicate passenger names")
    void findPassenger_DuplicateNames() {
        vehicleAnswer.addPassenger("Alice");
        vehicleAnswer.addPassenger("Bob");
        vehicleAnswer.addPassenger("Alice"); // Add Alice again
        assertEquals(0, vehicleAnswer.findPassenger("Alice")); // [3, 5] // Should find the first Alice at index 0
    }
}
