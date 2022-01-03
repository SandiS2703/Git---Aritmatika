package org.oop.latihan.Buku;

public class Buku {
	
	private String judul;
	private String pengarang;
	private String isi;
	private int tahun;
	private int harga;
	
	public Buku(String judul, String pengarang, int tahun, int harga) {
		this.judul = judul;
		this.pengarang = pengarang;
		this.tahun = tahun;
		this.harga = harga;
	}

	public String getJudul() {
		return judul;
	}

	public void setJudul(String judul) {
		this.judul = judul;
	}

	public String getPengarang() {
		return pengarang;
	}

	public void setPengarang(String pengarang) {
		this.pengarang = pengarang;
	}

	public String getIsi() {
		return isi;
	}

	public void setIsi(String isi) {
		this.isi = isi;
	}

	public int getTahun() {
		return tahun;
	}

	public void setTahun(int tahun) {
		this.tahun = tahun;
	}

	public int getHarga() {
		return harga;
	}

	public void setHarga(int harga) {
		this.harga = harga;
	}
	
	public double hargaJual() {
		double hargaJual = 0.0;
		hargaJual = this.harga - (0.2 * this.harga);
		return hargaJual;
	}
	
}
