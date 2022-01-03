package org.oop.latihan.bangunDatar;

public class PersegiPanjang {
	
	private double panjang;
	private double lebar;
	
	public PersegiPanjang(double panjang, double lebar) {
		this.panjang = panjang;
		this.lebar = lebar;
	}

	public double getPanjang() {
		return panjang;
	}

	public void setPanjang(double panjang) {
		this.panjang = panjang;
	}

	public double getLebar() {
		return lebar;
	}

	public void setLebar(double lebar) {
		this.lebar = lebar;
	}
	
	public double hitungKeliling() {
		double keliling = 0.0;
		keliling = 2 * (this.panjang + this.lebar);
		return keliling;
	}
	
	public double hitungLuas() {
		double luas = 0.0;
		luas = panjang * lebar;
		return luas;
	}
}