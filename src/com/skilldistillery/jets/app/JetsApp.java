package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;

public class JetsApp {

	public static void main(String[] args) {

		JetsApp ja = new JetsApp();
		ja.run();
	}

	public void run() {
		mainMenu();

	}

	public void mainMenu() {
		Scanner input = new Scanner(System.in);
		AirField airfield = new AirField();

		while (true) {
			System.out.println("\n0. List fleet\n" + "1. Fly all jets\n" + "2. View fastest jet\n"
					+ "3. View jet with longest range\n" + "4. Load all Cargo Jets\n" + "5. Dogfight!\n"
					+ "6. Add a jet to Fleet\n" + "7. Remove a jet from Fleet\n" + "8. Quit\n");

			int userChoice = input.nextInt();
			input.nextLine();
			if (userChoice == 0) {
				airfield.listHanger();
			} else if (userChoice == 1) {

				airfield.flyAllJets();

			} else if (userChoice == 2) {
				airfield.fastestJet();

			} else if (userChoice == 3) {
				airfield.longestRangeJet();

			} else if (userChoice == 4) {
				airfield.loadCargoJets();

			} else if (userChoice == 5) {
				airfield.dogFight();

			} else if (userChoice == 6) {

				System.out.println("Please Enter a Jet");
				String model = input.nextLine();
				System.out.println("Please Enter Speed Of Jet");
				double speed = input.nextDouble();
				input.nextLine();
				System.out.println("Please Enter Range Of Jet");
				double range = input.nextDouble();
				input.nextLine();
				System.out.println("Please Enter Price Of Jet");
				double price = input.nextDouble();
				input.nextLine();
				String type = "Custom Jet";
				airfield.addJettoHangar(model, speed, range, price,type);

			} else if (userChoice == 7) {
				System.out.println("Please Remove Jet by Number");
				airfield.listJetsToRemove();
				userChoice = input.nextInt();
				input.nextLine();
				airfield.removeJetFromHangar(userChoice);
				

			} else if (userChoice == 8) {
				airfield.quit();

			}

		}

	}

}