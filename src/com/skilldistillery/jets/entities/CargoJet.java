package com.skilldistillery.jets.entities;

public class CargoJet extends Jet implements Cargo {

	public CargoJet(String model, double range, double price, double speed, String type) {
		super(model, range, price, speed, type);

	}

	@Override
	public void fly() {
		System.out.println("Cwannnnggg");

	}

	@Override
	public void loadCargo() {
		System.out.println("Cargo Plane Loading Cargo");

	}

}
