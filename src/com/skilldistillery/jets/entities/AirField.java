package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {
	private List<Jet> hangar;

	public List<Jet> readJets(String fileName) {
		hangar = new ArrayList<>();

		try (BufferedReader bufIn = new BufferedReader(new FileReader("Jets.txt"))) {
			String line;

			Jet jet = null;
	          while ((line = bufIn.readLine()) != null) {
					String[] jetRecord = line.split(",");

					String type = jetRecord[0];   // typeOf

					String model = jetRecord[1];
					int speed = Integer.parseInt(jetRecord[2]);
					int range = Integer.parseInt(jetRecord[3]);
					int price = Integer.parseInt(jetRecord[4]);
					
					if (type.equals("Passenger")) {
						jet = new PassengerJet(model, speed, range, price);
					} else if (type.equals("Cargo")) {
						jet = new CargoJet(model, speed, range, price);
					} else if (type.equals("Fighter")) {
						jet = new FighterJet(model, speed, range, price);
					}
					hangar.add(jet);

					// end specifics
				}
				
		} catch (IOException e) {
			System.err.println(e);
		}
		return hangar;
	}
}