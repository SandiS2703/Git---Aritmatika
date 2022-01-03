/*
Identitas Kode Program
NRP                 : 162020031
Nama                : Sandi Yusup Sinaga
Nama File           : Sepatu.java
Deskripsi Program   : Class Sepatu sebagai child dari onlineShop
*/
package ISA205_UTSPraktikum_162020031_KodeC;

public class Sepatu extends onlineShop{
	
	public String namaSepatu;
	public double Harga;
	
	public String getNamaSepatu() {
		return namaSepatu;
	}
	public void setNamaSepatu(String namaSepatu) {
		this.namaSepatu = namaSepatu;
	}
	public double getHarga() {
		return Harga;
	}
	public void setHarga(double harga) {
		Harga = harga;
	}
	
	
	
}
