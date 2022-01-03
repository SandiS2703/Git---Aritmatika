package org.oop.latihan.interfaces;

public class Sepeda implements Kendaraan{
	
	int kecepatan;
	int gear;
	
	public Sepeda() {
		this.kecepatan = 0;
		this.gear = 0;
	}
	
	@Override
	public void ubahGear(int newGear) {
		gear = newGear;
	}
	
	@Override
	public void percepatan(int increment) {
		kecepatan += increment;
	}
	
	@Override
	public void lakukanPengereman(int decrement) {
		kecepatan -= decrement;
	}
	
	@Override
	public void printStatus() {
		System.out.println("Kecepatan : " +kecepatan +
				 "\nGear : " +gear);
	}

	public int getKecepatan() {
		return kecepatan;
	}

	public int getGear() {
		return gear;
	}
	
	
}
