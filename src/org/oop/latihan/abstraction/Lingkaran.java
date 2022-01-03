package org.oop.latihan.abstraction;

public class Lingkaran extends BangunDatar {
	double jariJari;

	public Lingkaran(String nama, String warna, double jariJari) {
		super(nama, warna);
		this.jariJari = jariJari;
	}
	
	@Override
	double getLuas() {
		return Math.PI * jariJari * jariJari;
	}
	
	@Override
	String infoBangunDatar() {
		return "Nama : " + super.getNama() + "\n"
				+ "Warna : " + super.getWarna() + "\n"
				+ "Luas : " + getLuas();
	}
}
