package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

import com.qa.garage.vehicle.Bike;
import com.qa.garage.vehicle.Boat;
import com.qa.garage.vehicle.Car;
import com.qa.garage.vehicle.Plane;

public class Runner {

	public static void main(String[] args) {
		Garage g = new Garage();

		g.addVehicle(new Car(4, "Black"));
		g.addVehicle(new Boat(0, "Blue"));
		g.addVehicle(new Bike(2, "Red"));
		g.addVehicle(new Car(3, "red"));
		g.addVehicle(new Plane(3, "red+white"));

		System.out.println(g);

		System.out.printf("%nTest Billable ------------------------------%n");
		List<Billable> billable = new ArrayList<>();
		billable.add(new Car(4, "Black"));
		billable.add(new Boat(0, "Blue"));
		billable.add(new Bike(2, "Red"));
		billable.add(new Car(3, "red"));
		billable.add(new Plane(3, "red+white"));
		billable.add(new Employee("SH", 24, "CS"));

		for (Billable thing : billable) {
			System.out.println(thing.getClass().getSimpleName() + " " + thing.calcBill());
			// The methods you can call are any from object as Employee and Vehicle are both
			// subclasses, any from Billable as the share that interface but not any method
			// in vehicle / employee that happen to have the same name because I tested this
			// and it failed
		}
	}

}
