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
				System.out.println("TRANSPORTING JET TO ANOTHER AIRFIELD" + i);
				jets.remove(i);
				break;
			}
		}System.out.println("JET HAS BEEN SUCCESFULLY TRANSPORTED");
	}

	public void flyJets() {
		System.out.println("JETS PREPARING FOR TAKE OFF...");
		for (Jet i : jets) {
			i.fly();
		}
		System.out.println("\nJETS HAVE LANDED BACK TO AIRFIELD FOR REFUELING");
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
		System.out.println("FASTEST JET IN AIRFIELD HAS BEEN DISPLAYED BELOW");
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
		System.out.println("JET WITH LONGEST RANGE IN AIRFIELD HAS BEEN DISPLAYED BELOW");
		System.out.println(longestRange);
	}

	public void loadCargo() {
		System.out.println("LOADING CARGO...");
		for (Jet i : jets) {
			if (i instanceof CargoPlane) {
				System.out.println(i);
				((CargoPlane) i).loadCargo();
			}
		}
	}

	public void dogFight() {
		System.out.println("FIGHTERJETS PREPARING FOR DOG FIGHT!");
		for (Jet i : jets) {
			if (i instanceof FighterJet) {
				System.out.println(i);
				((FighterJet) i).fight();
			}
		}
		System.out.println("\nDOGFIGHT OVER WITH MINOR DAMAGE TO JETS");
	}

}
