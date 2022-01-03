package org.oop.latihan.model.car;

public class Car {
	private String merk;
	private String color;
	private String factory;
	//private String doors;
	//private String engine;
	//private String driver;
	//private float speed;
	private double price;
	//private int usage;
	
	public Car(String merk, String color, String factory, double price) {
		this.merk = merk;
		this.color = color;
		this.factory = factory;
		this.price = price;
	}
	
	public String getMerk() {
		return merk;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getFactory() {
		return factory;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void CarIsRun(String doors, String engine, String driver, float speed) {
		if((doors.equals("Closed")) && (engine.equals("On")) && (driver.equals("Seated")) && (speed > 0)) {
			System.out.println("Car is running");
		}else {
			System.out.println("Car is not running");
		}
	}
	
	public void getSellPrice(int usage, double price) {
		double kurang;
		
		if((usage >= 1) && (usage <= 5)) {
			kurang = price * 0.05;
			price = price - kurang;
			System.out.println("Sell Price : "+price);
		}else {
			kurang = price * 0.10;
			price = price - kurang;
			System.out.println("Sell Price : "+price);
		}
	}
}

