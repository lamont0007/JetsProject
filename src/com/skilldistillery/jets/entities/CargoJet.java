package com.skilldistillery.jets.entities;

public class CargoJet extends Jet implements Cargo {

	public CargoJet(String model, double range, double price, double speed) {
		super(model, range, price, speed);
		
	}

	@Override
	public void fly() {
		System.out.println("Cargo Jet is flying");
		
	}

	@Override
	public void loadCargo() {
		// TODO Auto-generated method stub
		
	}



}
