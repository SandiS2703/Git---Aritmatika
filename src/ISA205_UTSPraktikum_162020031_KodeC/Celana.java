/*
Identitas Kode Program
NRP                 : 162020031
Nama                : Sandi Yusup Sinaga
Nama File           : Celana.java
Deskripsi Program   : Class Celana sebagai child dari onlineShop
*/
package ISA205_UTSPraktikum_162020031_KodeC;

public class Celana extends onlineShop{
	
	public String namaCelana;
	public double Harga;
	
	public String getNamaCelana() {
		return namaCelana;
	}
	public void setNamaCelana(String namaCelana) {
		this.namaCelana = namaCelana;
	}
	public double getHarga() {
		return Harga;
	}
	public void setHarga(double harga) {
		Harga = harga;
	}
	
	
}
