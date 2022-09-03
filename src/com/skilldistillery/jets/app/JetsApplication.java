package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.CargoPlane;
import com.skilldistillery.jets.entities.FighterJet;
import com.skilldistillery.jets.entities.Jet;
import com.skilldistillery.jets.entities.PassengerPlane;

public class JetsApplication {
	private AirField airField = new AirField();
	private Scanner input = new Scanner(System.in);
	private static String[] typesOfJets = { "Fighter", "Cargo", "Passenger" };

	public JetsApplication() {

	}

	public static void main(String[] args) {
		JetsApplication ja = new JetsApplication();
		ja.launch();

	}

	private void launch() {
		List<String> aList = new ArrayList<>();
		readFile(aList);

		boolean keepGoing = true;
		while (keepGoing) {
			displayUserMenu();
			int choice = input.nextInt();
			keepGoing = menuSelection(choice);
		}

	}

	private void displayUserMenu() {
		System.out.println();
		System.out.println("=========== MENU ===========");
		System.out.println("|                          |");
		System.out.println("| 1. List Fleet            |");
		System.out.println("| 2. Fly all jets          |");
		System.out.println("| 3. View fastest jet      |");
		System.out.println("| 4. View longest range jet|");
		System.out.println("| 5. Load all Cargo Jets   |");
		System.out.println("| 6. Dogfight!             |");
		System.out.println("| 7. Add jet to Fleet      |");
		System.out.println("| 8. Remove jet from Fleet |");
		System.out.println("| 9. Quit                  |");
		System.out.println("|                          |");
		System.out.println("============================");
	}

	public boolean menuSelection(int choice) {
		switch (choice) {
		case 1:
			System.out.print(airField);
			break;
		case 2:
			airField.flyJets();
			break;
		case 3:
			airField.fastestJet();
			break;
		case 4:
			airField.longestRange();
			break;
		case 5:
			airField.loadCargo();
			break;
		case 6:
			airField.dogFight();
			break;
		case 7:
			jetCreator();
			break;
		case 8:
			System.out.println(airField);
			System.out.println("Please enter in the ID of the jet you would like to remove");
			int removeId = input.nextInt();
			airField.removeJet(removeId);
			break;
		case 9:
			System.out.println("Thank you for using JetsApplication! Come back soon!");
			return false;
		default: 
			System.out.println("Invalid Entry! Please select a number on the MENU!");
		}
		return true;
	}

	public void jetCreator() {
		System.out.println("Select the jet type you would like to add: ");
		for (int i = 0; i < typesOfJets.length; i++) {
			System.out.println((i + 1) + " " + typesOfJets[i]);
		}
		int userInput = input.nextInt();
		String jetType = JetsApplication.typesOfJets[userInput - 1];

		System.out.println("Please enter in model of jet: ");
		String model = input.next();
		System.out.println("Please enter in the speed in of jet in mph: ");
		double speed = input.nextDouble();
		System.out.println("Please enter in the range of jet in miles: ");
		int range = input.nextInt();
		System.out.println("Please enter in the price of the jet: ");
		long price = input.nextLong();

		Jet plane = null;
		
		if (jetType.equals("Cargo")) {
			plane = new CargoPlane(model, speed, range, price);
		}
		if (jetType.equals("Fighter")) {
			plane = new FighterJet(model, speed, range, price);
		}
		if (jetType.equals("Passenger")) {
			plane = new PassengerPlane(model, speed, range, price);
		}

		airField.addJet(plane, true);

	}

	public void readFile(List<String> aList) {
		List<Jet> jet = new ArrayList<>();
		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String names;
			while ((names = bufIn.readLine()) != null) {
				Jet plane = null;
				String[] jets = names.split(",");
				String jetType = jets[0];
				String model = jets[1];
				double speed = Double.parseDouble(jets[2]);
				int range = Integer.parseInt(jets[3]);
				long price = Long.parseLong(jets[4]);

				if (jetType.equals("Cargo")) {
					plane = new CargoPlane(model, speed, range, price);
				}
				if (jetType.equals("Fighter")) {
					plane = new FighterJet(model, speed, range, price);
				}
				if (jetType.equals("Passenger")) {
					plane = new PassengerPlane(model, speed, range, price);
				}

				airField.addJet(plane, false);

			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}

}
