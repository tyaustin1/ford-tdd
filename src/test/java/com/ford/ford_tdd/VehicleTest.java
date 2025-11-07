package com.ford.ford_tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    private Vehicle vehicle;

    // This method runs before each test case, ensuring a fresh Vehicle object
    @BeforeEach
    void setUp() { // [11, 12, 13, 14, 15]
        vehicle = new Vehicle(); // [11, 12, 13, 14, 15]
    }

    @Test
    void test() {
        assertTrue(true);
    }
}