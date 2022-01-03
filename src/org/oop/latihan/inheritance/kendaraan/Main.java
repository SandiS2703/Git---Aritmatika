package org.oop.latihan.inheritance.kendaraan;

public class Main {

	public static void main(String[] args) {
		
		Bus bus1 = new Bus();
		Taxi taxi1 = new Taxi();
		
		bus1.setNama("Sugeng Rahayu");
		bus1.setWarna("Orange");
		bus1.setNoPlat("D1752KJ");
		bus1.setKelas("Premium");
		bus1.setHargaBeli(2000000);
		bus1.setLamaPemakaian(6);
		bus1.setTipe("Jetbus3");
		
		taxi1.setNama("Blue Bird");
		taxi1.setWarna("Biru");
		taxi1.setNoPlat("D1883ZU");
		taxi1.setLayanan("MVP");
		taxi1.setHargaBeli(1500000);
		taxi1.setLamaPemakaian(3);
		
		System.out.println("BUS 1 \n-----------------------------------");
		System.out.println("Nama : " + bus1.getNama() + "\nWarna : " + bus1.getWarna() + "\nNomor Plat : " + bus1.getNoPlat() + "\nKelas : " + bus1.getKelas() + "\nHarga Beli : " + bus1.getHargaBeli() + "\nLama Pemakaian : " + bus1.getLamaPemakaian() + "\nTipe : " + bus1.getTipe());
		System.out.println("Harga Jual(Overriding)  : " + bus1.totalHargaJual());
		System.out.println("Harga Jual(Overloading) : " + bus1.totalHargaJual(bus1.getTipe()));
		
		System.out.println("\nTAXI 1 \n-----------------------------------");
		System.out.println("Nama : " + taxi1.getNama() + "\nHarga Beli : " + taxi1.getHargaBeli() + "\nLama Pemakaian : " + taxi1.getLamaPemakaian() + "\nTipe : " + taxi1.getLayanan());
		System.out.println("Harga Jual(Overriding)  : " + taxi1.totalHargaJual());
		System.out.println("Harga Jual(Overloading) : " + taxi1.totalHargaJual(taxi1.getLayanan()));
	}

}
