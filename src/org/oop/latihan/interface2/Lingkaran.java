package org.oop.latihan.interface2;

class Lingkaran extends BangunDatar implements LingkaranInterface{
	double jariJari;

	public Lingkaran(String nama, String warna, double jariJari) {
		super(nama, warna);
		this.jariJari = jariJari;
	}
	
	@Override
	public double luas() {
		return Math.PI * jariJari * jariJari;
	}
	
	@Override
	public double keliling() {
		return 2 * Math.PI * jariJari;
	}
	
	@Override
	public String infoLingkaran() {
		return "Nama : " +super.getNama()+ "\n"
				+ "Warna : " +super.getWarna()+ "\n"
				+ "Luas : " +luas()+ "\n"
				+ "Keliling : " +keliling();
	}
}
