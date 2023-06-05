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
//		order matters in methods args
	}

	public abstract void fly();

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getRange() {
		return range;
	}

	public void setRange(double range) {
		this.range = range;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	
	

}