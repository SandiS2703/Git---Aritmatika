package org.oop.latihan.inheritance.kendaraan;

public class Bus extends Kendaraan {
	
	private String kelas;
	private String tipe;
	
	public String getKelas() {
		return kelas;
	}
	public void setKelas(String kelas) {
		this.kelas = kelas;
	}
	public String getTipe() {
		return tipe;
	}
	public void setTipe(String tipe) {
		this.tipe = tipe;
	}
	
	@Override
	public double totalHargaJual() {
		
		double totalHargaJual = 0.0;
		
		if(this.getLamaPemakaian() <= 5) {
			if(kelas.equals("Ekonomi")) {
				totalHargaJual = this.getHargaBeli() - (0.1 * this.getHargaBeli());
				return totalHargaJual;
			}else if(kelas.equals("Bisnis")) {
				totalHargaJual = this.getHargaBeli() - (0.07 * this.getHargaBeli());
				return totalHargaJual;
			}else {
				totalHargaJual = this.getHargaBeli() - (0.05 * this.getHargaBeli());
				return totalHargaJual;
			}
			
		}else {
			if(kelas.equals("Ekonomi")) {
				totalHargaJual = this.getHargaBeli() - (0.2 * this.getHargaBeli());
				return totalHargaJual;
			}else if(kelas.equals("Bisnis")) {
				totalHargaJual = this.getHargaBeli() - (0.15 * this.getHargaBeli());
				return totalHargaJual;
			}else {
				totalHargaJual = this.getHargaBeli() - (0.1 * this.getHargaBeli());
				return totalHargaJual;
			}
		}
	}
	
	public double totalHargaJual(String tipe) {
		
		double totalHargaJual = 0.0;
		
		if(tipe.equals("Jetbus1")) {
			totalHargaJual = this.getHargaBeli() - (0.08 * this.getHargaBeli());
			return totalHargaJual;
		}else if(tipe.equals("Jetbus2")) {
			totalHargaJual = this.getHargaBeli() - (0.06 * this.getHargaBeli());
			return totalHargaJual;
		}else {
			totalHargaJual = this.getHargaBeli() - (0.04 * this.getHargaBeli());
			return totalHargaJual;
		}
	}
	
}
