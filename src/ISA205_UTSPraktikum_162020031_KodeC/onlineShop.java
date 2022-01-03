/*
Identitas Kode Program
NRP                 : 162020031
Nama                : Sandi Yusup Sinaga
Nama File           : onlineShop.java
Deskripsi Program   : Class onlineShop sebagai parent
*/
package ISA205_UTSPraktikum_162020031_KodeC;

public class onlineShop {
	
	public int jenisPembayaran;
	
	public int getJenisPembayaran() {
		return jenisPembayaran;
	}
	public void setJenisPembayaran(int jenisPembayaran) {
		this.jenisPembayaran = jenisPembayaran;
	}

	public double totalHarga(double harga1, double harga2, double harga3) {
		double totalHarga = 0.0;
		
		totalHarga = harga1 + harga2 + harga3;
		
		return totalHarga;
	}
	
	
}
