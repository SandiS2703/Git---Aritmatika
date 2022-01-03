package org.oop.latihan.bangunDatar;

public class bangunDatar {
	
	public static void main(String[] args) {
		
		Segitiga segitiga1 = new Segitiga(8, 3, 5);
		PersegiPanjang persegip1 = new PersegiPanjang(9, 5);
		
		System.out.println("Tinggi Segitiga : " +segitiga1.getTinggi()+ "\nAlas Segitiga : " +segitiga1.getAlas()+ "\nSisi Miring Segitiga : " +segitiga1.getMiring()+ "\nKeliling Segitiga : " +segitiga1.hitungKeliling()+ "\nLuas Segitiga : " +segitiga1.hitungLuas());
		System.out.println("\nPanjang Persegi Panjang : " +persegip1.getPanjang()+ "\nLebar Persegi Panjang : " +persegip1.getLebar()+ "\nKeliling Persegi Panjang : " +persegip1.hitungKeliling()+ "\nLuas Persegi Panjang : " +persegip1.hitungLuas());
	}
}
