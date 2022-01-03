package org.oop.latihan.interface2;

abstract class BangunDatar {
	String nama;
	String warna;
	
	public BangunDatar(String nama, String warna) {
		this.nama = nama;
		this.warna = warna;
	}

	public String getNama() {
		return nama;
	}

	public String getWarna() {
		return warna;
	}
	
}
