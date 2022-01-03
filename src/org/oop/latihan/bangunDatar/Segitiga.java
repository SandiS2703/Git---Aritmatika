package org.oop.latihan.bangunDatar;

public class Segitiga {
	
	private double tinggi;
	private double alas;
	private double miring;
	
	public Segitiga(double tinggi, double alas, double miring) {
		this.tinggi = tinggi;
		this.alas = alas;
		this.miring = miring;
	}

	public double getTinggi() {
		return tinggi;
	}

	public void setTinggi(double tinggi) {
		this.tinggi = tinggi;
	}

	public double getAlas() {
		return alas;
	}

	public void setAlas(double alas) {
		this.alas = alas;
	}

	public double getMiring() {
		return miring;
	}

	public void setMiring(double miring) {
		this.miring = miring;
	}
	
	public double hitungLuas() {
		double luas = 0.0;
		luas = 0.5 * (this.alas * this.tinggi);
		return luas;
	}
	
	public double hitungKeliling() {
		double keliling = 0.0;
		keliling = this.alas + this.miring + this.miring;
		return keliling;
	}
}
