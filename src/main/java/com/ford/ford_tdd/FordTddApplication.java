package com.ford.ford_tdd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FordTddApplication {

	static Vehicle vehicle = new Vehicle();

	public static void main(String[] args) {
		SpringApplication.run(FordTddApplication.class, args);

//		//Add passengers and display vehicle
//		vehicle.addPassenger("Mina");
//		displayCarASCII();
//		vehicle.addPassenger("Emma");
//		displayCarASCII();
//		vehicle.addPassenger("Rafi");
//		displayCarASCII();
//		vehicle.addPassenger("Daniel");
//		displayCarASCII();
//		vehicle.addPassenger("Ty");
//		displayCarASCII();
//
//		//Try to add to full vehicle
//		vehicle.addPassenger("Sam");
//		displayCarASCII();
//
//		//Remove passenger and add new one
//		vehicle.removePassenger("Ty");
//		displayCarASCII();
//		vehicle.addPassenger("Sam");
//		displayCarASCII();

	}


//	public static void displayCarASCII() {
//		String driver = "DRIVER"; // Fixed driver
//		String p0 = vehicle.getPassengerByIndex(0) != null ? vehicle.getPassengerByIndex(0) : "Available"; // Front Passenger
//		String p1 = vehicle.getPassengerByIndex(1) != null ? vehicle.getPassengerByIndex(1) : "Available"; // Middle Left
//		String p2 = vehicle.getPassengerByIndex(2) != null ? vehicle.getPassengerByIndex(2) : "Available"; // Middle Right
//		String p3 = vehicle.getPassengerByIndex(3) != null ? vehicle.getPassengerByIndex(3) : "Available"; // Rear Left
//		String p4 = vehicle.getPassengerByIndex(4) != null ? vehicle.getPassengerByIndex(4) : "Available"; // Rear Right
//
//		// Pad strings for consistent width (e.g., 10 characters for each name slot)
//		driver = String.format("%-10s", driver);
//		p0 = String.format("%-10s", p0);
//		p1 = String.format("%-10s", p1);
//		p2 = String.format("%-10s", p2);
//		p3 = String.format("%-10s", p3);
//		p4 = String.format("%-10s", p4);
//
//		System.out.println("\n      ___________________________");
//		System.out.println("     //            Ford         \\\\");
//		System.out.println("    //  .---------------------.  \\\\");
//		System.out.println("   ||   | " + driver + " | " + p0 + " |   ||"); // Front Row
//		System.out.println("   ||   |----------|----------|   ||");
//		System.out.println("   ||   | " + p1 + " | " + p2 + " |   ||"); // Middle Row
//		System.out.println("   ||   |----------|----------|   ||");
//		System.out.println("   ||   | " + p3 + " | " + p4 + " |   ||"); // Rear Row
//		System.out.println("   ||   '---------------------'   ||");
//		System.out.println("    \\\\___________________________//\n");
//	}



}
