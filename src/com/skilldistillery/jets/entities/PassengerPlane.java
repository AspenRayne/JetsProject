package com.skilldistillery.jets.entities;

public class PassengerPlane extends Jet{

	public PassengerPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public String toString() {
		return "\nPassenger Plane- " + "[" + getModel() + "] - ID: [" + getId() + "]\nSpeeds of [" + getSpeed() + " MPH]" + 
	" with a Range of [" + getRange() + " miles] and a Price of [$" + getPrice() + "]\n";
	}
	
	
}
