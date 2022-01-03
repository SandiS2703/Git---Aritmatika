package org.oop.latihan.inheritance.kendaraan;

public class Kendaraan {
	private String nama;
	private String warna;
	private String noPlat;
	private double hargaBeli;
	private int lamaPemakaian;
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getWarna() {
		return warna;
	}
	public void setWarna(String warna) {
		this.warna = warna;
	}
	public String getNoPlat() {
		return noPlat;
	}
	public void setNoPlat(String noPlat) {
		this.noPlat = noPlat;
	}
	public double getHargaBeli() {
		return hargaBeli;
	}
	public void setHargaBeli(double hargaBeli) {
		this.hargaBeli = hargaBeli;
	}
	public int getLamaPemakaian() {
		return lamaPemakaian;
	}
	public void setLamaPemakaian(int lamaPemakaian) {
		this.lamaPemakaian = lamaPemakaian;
	}
	
	public double totalHargaJual() {
		double totalHargaJual = 0.0;
		return totalHargaJual;
	}
	
	
}
