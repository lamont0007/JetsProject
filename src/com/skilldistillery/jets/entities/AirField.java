package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {
	private List<Jet> hangar;

	public AirField() {
		readJets("Jets.txt");
	}

	public List<Jet> readJets(String fileName) {
		hangar = new ArrayList<>();

		try (BufferedReader bufIn = new BufferedReader(new FileReader(fileName))) {
			String line;

			Jet jet = null;
			while ((line = bufIn.readLine()) != null) {
				String[] jetRecord = line.split(",");

				String type = jetRecord[0];
				String model = jetRecord[1];
				double speed = Integer.parseInt(jetRecord[2]);
				double range = Integer.parseInt(jetRecord[3]);
				double price = Integer.parseInt(jetRecord[4]);

				if (type.equals("Passenger")) {
					jet = new PassengerJet(model, speed, range, price, type);
				} else if (type.equals("CargoCarrier")) {
					jet = new CargoJet(model, speed, range, price, type);
				} else if (type.equals("Fighter")) {
					jet = new FighterJet(model, speed, range, price, type);
				}
				hangar.add(jet);

			}

		} catch (

		IOException e) {
			System.err.println(e);
		}
		return hangar;
	}

	public void flyAllJets() {

		try {
			for (Jet jet : hangar) {
				jet.fly();
				double time = jet.getRange() / jet.getSpeed();
				System.out.println(
						jet.getModel() + " Time in air remaining " + time + " Speed: " + jet.getSpeed() + " Range");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void fastestJet() {
		double fastJet = 0;
		Jet fastestJet = null;

		for (Jet jet : hangar) {

			if (jet.getSpeed() > fastJet) {
				fastJet = jet.getSpeed();
				fastestJet = jet;

			}

		}
		System.out.println(fastestJet);
	}

	public void range() {
		for (Jet jet : hangar) {
			System.out.println(jet.getRange());

		}
	}

	public void dogFight() {

		for (Jet jet : hangar) {
			if ( jet instanceof FighterJet) {
				((FighterJet)jet).fight();
			} 
		}

	}

	public void addJettoHangar(String model, double speed, double range, double price, String type) {
		Jet jet = new PassengerJet(model, speed, range, price, type);
		hangar.add(jet);

	}

	public void removeJetFromHangar(int userChoice) {
		
		hangar.remove(userChoice);
		System.out.println("Jet was Removed");

	}
	public void listJetsToRemove() {
		for (int i = 0; i < hangar.size(); i++) {
			System.out.println(i + " " + hangar.get(i));
		}
	}

	public void quit() {
		System.out.println("Program has Ended");
	}

	public void listHanger() {
		for (Jet jet : hangar) {
			System.out.println(jet);
		}
	}

	public void longestRangeJet() {
		double longRangeJet = 0;
		Jet longestRangeJet = null;
		for (Jet jet : hangar) {
			if (jet.getRange() > longRangeJet) {
				longRangeJet = jet.getRange();
				longestRangeJet = jet;
			}
		}
		System.out.println(longestRangeJet);
	}

	public void loadCargoJets() {
		for (Jet jet : hangar) {
			if ( jet instanceof CargoJet) {
				((CargoJet)jet).loadCargo();
			} 

		}

	}

}