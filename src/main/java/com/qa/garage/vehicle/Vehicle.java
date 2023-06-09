package com.qa.garage.vehicle;

import com.qa.garage.Billable;

public abstract class Vehicle implements Billable {

	private int numWheels;

	private String colour;

	private static int count = 0;

	private final int id;

	public Vehicle(int numWheels, String colour) {
		// Increment count which is static across all subclasses of vehicle and then set
		// the id which is a final variable for each vehicle equal to count. SO you will
		// have a set of vehicles with id starting at 1
		super();
		count++;
		this.id = count;
		this.numWheels = numWheels;
		this.colour = colour;
	}

	@Override
	public abstract int calcBill();

	public int getId() {
		return this.id;
	}

	public int getNumWheels() {
		return this.numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}

	public String getColour() {
		return this.colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Vehicle [ID: " + this.id + "numWheels=" + this.numWheels + ", colour=" + this.colour + "]";
	}

//	public void hypothesis() {
//		System.out.println("Testing, testing...");
//	}
}
