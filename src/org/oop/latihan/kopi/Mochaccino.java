package org.oop.latihan.kopi;

public class Mochaccino extends AbstractKopi{
	
	private double kopi, coklat, susu;

	public Mochaccino(double kopi, double coklat, double susu) {
		this.kopi = kopi;
		this.coklat = coklat;
		this.susu = susu;
	}
	
	@Override
	void komposisi() {
		System.out.println("Komposisi Mochaccino : ");
		System.out.println(+(kopi/this.total())*100+"% Kopi");
		System.out.println(+(coklat/this.total())*100+"% Coklat");
		System.out.println(+(susu/this.total())*100+"% Susu");
	}
	
	@Override
	double total() {
		double total = 0;
		total = kopi + coklat + susu;
		return total;
	}
}
