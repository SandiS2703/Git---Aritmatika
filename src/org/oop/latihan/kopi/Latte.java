package org.oop.latihan.kopi;

public class Latte extends AbstractKopi{
	double kopi, susu, foam;

	public Latte(double kopi, double susu, double foam) {
		this.kopi = kopi;
		this.susu = susu;
		this.foam = foam;
	}
	
	@Override
	void komposisi() {
		System.out.println("Komposisi Latte : ");
		System.out.println(+(kopi/this.total())*100+"% Kopi");
		System.out.println(+(susu/this.total())*100+"% Susu");
		System.out.println(+(foam/this.total())*100+"% Foam");
	}
	
	@Override
	double total() {
		double total = 0;
		
		total = kopi + susu + foam;
		
		return total;
	}
	
}
