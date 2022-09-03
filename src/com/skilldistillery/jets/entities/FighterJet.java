package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements CombatReady{

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	
	@Override
	public void fight() {
		System.out.println("PEW PEW PEW");
	}

	@Override
	public String toString() {
		return "\nFighter Jet- " + "[" + getModel() + "] - ID: [" + getId() + "]\nSpeeds of [" + getSpeed() + " MPH]" + 
				" with a Range of [" + getRange() + " miles] and a Price of [$" + getPrice() + "]\n";
	}
	
	
	
	
	
	

}
