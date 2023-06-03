package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {
	private List<Jet> hangar;
	
	private List<Jet> readJets(String fileName) {
		hangar = new ArrayList<>();
		
		try (BufferedReader bufIn = new BufferedReader(new FileReader(fileName))) {
			String line;
			
			while ((line = bufIn.readLine()) != null) {
				String[] jetRecord = line.split(",");
				
				// specifics
				// read in the jet line from the file, 1 line at a time
				// create a concrete Jet kinda plane base on the 1st token
				//     if I've just read in Passenger, then I know to instantiate a new Passenger kinda Jet
				// ... and add that new Jet kinda thingy to the fleet
				
			
				// end specifics
			}
		} catch (IOException e) {
			System.err.println(e);
		}
		return hangar;
	}
}