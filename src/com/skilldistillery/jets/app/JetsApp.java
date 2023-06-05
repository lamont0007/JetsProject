package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;

public class JetsApp {
//bring in airfield to use methods... instantiate when I "new" run the read file method... get a global scanner
	public static void main(String[] args) {

		JetsApp ja = new JetsApp();
		ja.run();
	}

	public void run() {
		mainMenu();

	}

	public void mainMenu() {
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("0. List fleet\n" + "1. Fly all jets\n" + "2. View fastest jet\n"
					+ "3. View jet with longest range\n" + "4. Load all Cargo Jets\n" + "5. Dogfight!\n"
					+ "6. Add a jet to Fleet\n" + "7. Remove a jet from Fleet\n" + "8. Quit\n");

			int userChoice = input.nextInt();
			if (userChoice == 0) {
				AirField.listHanger();
			} else if (userChoice == 1) {

				AirField.flyAllJets();

			} else if (userChoice == 2) {
				AirField.fastestJet();

			} else if (userChoice == 3) {
				AirField.longestRangeJet();

			} else if (userChoice == 4) {
				AirField.loadCargoJets();

			} else if (userChoice == 5) {
				AirField.dogFight();

			} else if (userChoice == 6) {
				AirField.addJettoHangar();

			} else if (userChoice == 7) {
				AirField.removeJetFromHangar();

			} else if (userChoice == 8) {
				AirField.quit();

			}
		}

	}

}