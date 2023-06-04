package com.skilldistillery.jets.entities;

public abstract class Jet {
	private String model;
	private double range;
	private double price;
	private double speed;

	public Jet(String model, double range, double price, double speed) {
		this.model = model;
		this.range = range;
		this.price = price;
		this.speed = speed;
		// TODO Auto-generated constructor stub; order matters in methods args
	}

	public abstract void fly(); 
		

	

}