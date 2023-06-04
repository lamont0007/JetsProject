package com.skilldistillery.jets.app;

import java.util.Scanner;

public class JetsApp {

	public static void main(String[] args) {
		JetsApp ja = new JetsApp();
		ja.run();
	}

	public void run() {
		try (Scanner userInput = new Scanner(System.in)) {
			for (int indexOfArrays = 0; indexOfArrays < 5; indexOfArrays++) {
			}

			while (true) {
				System.out.println("List fleet\n" + "1. Fly all jets\n" + "2. View fastest jet\n"
						+ "3. View jet with longest range\n" + "4. Load all Cargo Jets\n" + "5. Dogfight!\n"
						+ "6. Add a jet to Fleet\n" + "7. Remove a jet from Fleet\n" + "8. Quit\n");
		          while ((line = bufIn.readLine()) != null) {
						String[] jetRecord = line.split(",");

						String type = jetRecord[0];   // typeOf

						String model = jetRecord[1];
						int speed = Integer.parseInt(jetRecord[2]);
						int range = Integer.parseInt(jetRecord[3]);
						int price = Integer.parseInt(jetRecord[4]);
						
						if (type.equals("Passenger")) {
							jet = new JetImpl(model, speed, range, price);
						} else if (type.equals("Cargo")) {
							jet = new CargoPlane(model, speed, range, price);
						} else if (type.equals("Fighter")) {
							jet = new FighterJet(model, speed, range, price);
						}
						fleet.add(jet);

						// end specifics
					}
				}
			userInput.close();
			}
					}

	}

}