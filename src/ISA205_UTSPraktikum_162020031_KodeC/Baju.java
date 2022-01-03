/*
Identitas Kode Program
NRP                 : 162020031
Nama                : Sandi Yusup Sinaga
Nama File           : Baju.java
Deskripsi Program   : Class Baju sebagai child dari onlineShop
*/
package ISA205_UTSPraktikum_162020031_KodeC;

public class Baju extends onlineShop{
	
	public String namaBaju;
	public double Harga;
	
	public String getNamaBaju() {
		return namaBaju;
	}
	public void setNamaBaju(String namaBaju) {
		this.namaBaju = namaBaju;
	}
	public double getHarga() {
		return Harga;
	}
	public void setHarga(double harga) {
		Harga = harga;
	}
	
	
}
