package org.oop.latihan.interfaces;

public class Driver {

	public static void main(String[] args) {
		Sepeda sepeda = new Sepeda();
		
		System.out.println("Kecepatan awal : ");
		System.out.println(sepeda.getGear());
		System.out.println(sepeda.getKecepatan());
		
		sepeda.ubahGear(2);
		sepeda.percepatan(3);
		sepeda.lakukanPengereman(1);
		
		System.out.println("Status Akhir Sepeda : ");
		sepeda.printStatus();
	}

}
