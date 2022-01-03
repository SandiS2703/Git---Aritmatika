package org.oop.latihan.kopi;

public class Espresso extends AbstractKopi{
	
	double kopi;
	
	public Espresso(double kopi) {
		this.kopi = kopi;

	}

	@Override
	void komposisi() {
		System.out.println("Komposisi Espresso : ");
		System.out.println(+(this.kopi/this.total())*100+"% Kopi");
	}
	
	@Override
	double total() {
		double total = 0;
		
		total += kopi;
		
		return total;
	}
}
