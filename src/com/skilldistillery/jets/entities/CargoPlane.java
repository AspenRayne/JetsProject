package com.skilldistillery.jets.entities;

public class CargoPlane extends Jet implements CargoCarrier{

	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	@Override
	public void loadCargo() {
		System.out.println("Loading cargo complete!");
	}
	@Override
	public String toString() {
		return "\nCargo Plane- " + "[" + getModel() + "] - ID: [" + getId() + "]\nSpeeds of [" + getSpeed() + " MPH]" + 
				" with a Range of [" + getRange() + " miles] and a Price of [$" + getPrice() + "]\n";
	}
	
	
	
	

}
