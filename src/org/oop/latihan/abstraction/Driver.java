package org.oop.latihan.abstraction;

public class Driver {

	public static void main(String[] args) {
		BangunDatar lingkaran = new Lingkaran("Lingkaran", "Merah", 7.0);
		BangunDatar persegipanjang = new PersegiPanjang("Persegi Panjang", "Biru", 5, 8);
		System.out.println(lingkaran.infoBangunDatar());
		System.out.println("\n" +persegipanjang.infoBangunDatar());
	}

}
