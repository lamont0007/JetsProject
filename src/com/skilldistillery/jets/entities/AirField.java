package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {
	private static List<Jet> hangar;

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
					jet = new PassengerJet(model, speed, range, price);
				} else if (type.equals("Cargo")) {
					jet = new CargoJet(model, speed, range, price);
				} else if (type.equals("Fighter")) {
					jet = new FighterJet(model, speed, range, price);
				}
				hangar.add(jet);

			}

		} catch (

		IOException e) {
			System.err.println(e);
		}
		return hangar;
	}

	public static void flyAllJets() {

		try {
			for (Jet jet : hangar) {
				double speed = jet.getSpeed();
				double range = jet.getRange();
				double time = range / speed();
				System.out.println(jet + " Time in air remaining " + time + " Speed: " + speed + " Range");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	private static void speed() {
		for(Jet jet : hangar) {
			System.out.println(jet.getSpeed());
		}

		
	}

	public static void fastestJet() {
		for(Jet jet : hangar) {
			System.out.println(jet.time);
			
		}
	}

	public static void range() {
		for(Jet jet : hangar) {
			System.out.println(jet.getRange());

		;
	}

	public static void loadCargoJets1() {
		

	}

	public static void dogFight() {
		

	}

	public static void addJettoHangar() {
		

	}

	public static void removeJetFromHangar() {
		

	}

	public static void quit() {
		System.out.println("Program has Ended");

	}

	public static void listHanger() {
		

	}

	
}