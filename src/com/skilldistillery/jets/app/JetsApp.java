package com.skilldistillery.jets.app;

import java.util.Scanner;

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
		while (true) {
			System.out.println("List fleet\n" + "1. Fly all jets\n" + "2. View fastest jet\n"
					+ "3. View jet with longest range\n" + "4. Load all Cargo Jets\n" + "5. Dogfight!\n"
					+ "6. Add a jet to Fleet\n" + "7. Remove a jet from Fleet\n" + "8. Quit\n");
			
		}
		
		
	}

}