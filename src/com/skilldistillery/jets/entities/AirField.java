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

		try (BufferedReader bufIn = new BufferedReader(new FileReader("Jets.txt"))) {
			String line;

			Jet jet;
			while ((line = bufIn.readLine()) != null) {
				String[] jetRecord = line.split(",");
				if(jetRecord [0] .startsWith("Cargo"))
				{
					jet = new CargoJet(jetRecord[1],jetRecord[2],jetRecord[3],jetRecord[4]);
						
//					fighter and passenger jetRecord
				}
			}
		} catch (IOException e) {
			System.err.println(e);
		}
		return hangar;
	}
}