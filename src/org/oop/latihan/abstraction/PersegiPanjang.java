package org.oop.latihan.abstraction;

public class PersegiPanjang extends BangunDatar{
	double panjang, lebar;

	public PersegiPanjang(String nama, String warna, double panjang, double lebar) {
		super(nama, warna);
		this.panjang = panjang;
		this.lebar = lebar;
	}

	@Override
	double getLuas() {
		return panjang * lebar;
	}
	
	@Override
	String infoBangunDatar() {
		return "Nama : " +super.getNama()+ "\n"
				+ "Warna : " +super.getWarna()+ "\n"
				+ "Luas : " +getLuas();
	}
}
