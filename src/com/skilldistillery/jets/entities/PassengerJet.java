package com.skilldistillery.jets.entities;

public class PassengerJet extends Jet implements PassengerPlane {

	public PassengerJet(String model, double range, double price, double speed, String type) {
		super(model, range, price, speed, type);
		
	}

	@Override
	public void fly() {
		System.out.println("swoooosh");
		
	}

	@Override
	public void PassengerBoarding() {
		System.out.println("Boarding Passengers");
		
	}

}
