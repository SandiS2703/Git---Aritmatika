package org.oop.latihan.inheritance.kendaraan;

public class Taxi extends Kendaraan {
	
	private String layanan;

	public String getLayanan() {
		return layanan;
	}

	public void setLayanan(String layanan) {
		this.layanan = layanan;
	}
	
	@Override
	public double totalHargaJual() {
		double totalHargaJual = 0.0;
		totalHargaJual = this.getHargaBeli() - 0.1 * this.getHargaBeli();
		return totalHargaJual;
	}
	
	public double totalHargaJual(String layanan) {
		double totalHargaJual = 0.0;
		if(layanan.equals("Reguler")) {
			totalHargaJual = this.getHargaBeli() - 0.1 * this.getHargaBeli();
			return totalHargaJual;
		}else if(layanan.equals("MVP")) {
			totalHargaJual = this.getHargaBeli() - 0.08 * this.getHargaBeli();
			return totalHargaJual;
		}else {
			totalHargaJual = this.getHargaBeli() - 0.05 * this.getHargaBeli();
			return totalHargaJual;
		}
	}
}
