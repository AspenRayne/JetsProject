package com.skilldistillery.jets.entities;

import java.util.ArrayList;
import java.util.List;

public class AirField {
	private List<Jet> jets = new ArrayList<>();

	public AirField() {

	}

	public String toString() {
		String returnString = "";
		for (Jet i : jets) {
			returnString = returnString.concat("\n" + i.toString());
		}
		return "LIST OF ALL JETS IN THE AIRFIELD\n================================" + returnString;
	}

	public void addJet(Jet jet, boolean print) {
		jets.add(jet);
		if (print) {
			System.out.println("New jet added to AirField, ready for take off!");
			System.out.println(jet);
		}
	}

	public void removeJet(int removeId) {
		for (Jet i : jets) {
			if (removeId == i.getId()) {
				System.out.println("Removing..." + i);
				jets.remove(i);
				break;
			}
		}System.out.println("Jet removed");
	}

	public void flyJets() {
		for (Jet i : jets) {
			i.fly();
		}
	}

	public void fastestJet() {
		double max = 0;
		String fastestJet = "";
		for (Jet i : jets) {
			if (i == null)
				continue;
			if (i.getSpeed() > max) {
				max = i.getSpeed();
				fastestJet = i.toString();
			}
		}
		System.out.println("Displaying Fastest Jet....");
		System.out.println(fastestJet);
	}

	public void longestRange() {
		double max = 0;
		String longestRange = "";
		for (Jet i : jets) {
			if (i == null)
				continue;
			if (i.getRange() > max) {
				max = i.getRange();
				longestRange = i.toString();
			}
		}
		System.out.println("Displaying Jet with longest Range...");
		System.out.println(longestRange);
	}

	public void loadCargo() {
		System.out.println("Loading cargo...");
		for (Jet i : jets) {
			if (i instanceof CargoPlane) {
				System.out.println(i);
				((CargoPlane) i).loadCargo();
			}
		}
	}

	public void dogFight() {
		System.out.println("Fighter jets initializing DOGFIGHT!");
		for (Jet i : jets) {
			if (i instanceof FighterJet) {
				System.out.println(i);
				((FighterJet) i).fight();
			}
		}
	}

}
