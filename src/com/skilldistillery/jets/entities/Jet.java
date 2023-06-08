package com.skilldistillery.jets.entities;

public abstract class Jet {
	private String model;
	private double range;
	private double price;
	private double speed;
	private double time;
	private String type;
	
	
	

	public Jet(String model, double range, double price, double speed, String type) {
		this.model = model;
		this.range = range;
		this.price = price;
		this.speed = speed;
		this.type = type;

	}


	public abstract void fly();

	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
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

	public double time() {
		return range/speed;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Jet [model =" + model + ", range= " + range + ", price= " + price + ", speed= " + speed + "]";
	}

}