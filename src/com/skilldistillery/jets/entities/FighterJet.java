package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements Fighter {

	public FighterJet(String model, double range, double price, double speed) {
		super(model, range, price, speed);
	}

	@Override
	public void fight() {
		System.out.println("Fighter Jet Is Flyiing");

	}

	@Override
	public void fly() {
		System.out.println(" ");

	}

}
