package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements Fighter {

	public FighterJet(String model, double range, double price, double speed, String type) {
		super(model, range, price, speed, type);
	}

	@Override
	public void fight() {
		System.out.println("Fighter Jet Is Flying");

	}

	@Override
	public void fly() {
		System.out.println("SHHHHHHOOOOOOO ");

	}

}
