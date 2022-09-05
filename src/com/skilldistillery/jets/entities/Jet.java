package com.skilldistillery.jets.entities;

public abstract class Jet {
	private static int pk = 1;
	
	private String model;
	private double speed;
	private int range;
	private long price;
	private int id;

	public Jet() {
	}

	public Jet(String model, double speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
		this.id = pk;
		pk++;
	}
	
	
	public void fly() {
		double result = (range / speed) * 60;
		System.out.println(toString() + "*Flied for " + Double.valueOf(String.format("%.2f", result)) + " Minutes*");
		
	}

	public double getSpeedInMach() {
		return speed / 767.3;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}
	
	
	

}
