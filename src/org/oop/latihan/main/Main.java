package org.oop.latihan.main;

import org.oop.latihan.model.car.Car;

public class Main {

	public static void main(String[] args) {
		
		Car car1 = new Car("Ertiga","Red","Suzuki",15.000);
		Car car2 = new Car("Altis","Blue","Toyota",13.000);
		Car car3 = new Car("Swift","Pink","Suzuki",12.000);
		
		System.out.println("Merk : " + car1.getMerk() + "\nColor : " + car1.getColor() + "\nFactory : " + car1.getFactory() + "\nPrice : " + car1.getPrice() );
		System.out.println("Merk : " + car2.getMerk() + "\nColor : " + car2.getColor() + "\nFactory : " + car2.getFactory() + "\nPrice : " + car2.getPrice() );
		System.out.println("Merk : " + car3.getMerk() + "\nColor : " + car3.getColor() + "\nFactory : " + car3.getFactory() + "\nPrice : " + car3.getPrice() );
		
		car1.CarIsRun("Opened", "On", "Seated", 100);
		car2.CarIsRun("Opened", "Off", "Seated", 0);
		car3.CarIsRun("Closed", "On", "Seated", 140);
		
		car1.getSellPrice(7, 15000);
		car2.getSellPrice(4, 13000);
		car3.getSellPrice(3, 12000);
	}

}
