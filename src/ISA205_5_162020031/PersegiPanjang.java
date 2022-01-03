/*
Identitas Kode Program
NRP                 : 162020031
Nama                : Sandi Yusup Sinaga
Nama File           : PersegiPanjang.java
Deskripsi Program   : Penerapan Override & Overload Pada Program Menghitung Luas & Keliling Bangun Datar
*/
package ISA205_5_162020031;

public class PersegiPanjang extends BangunDatar{
	
	public float panjang;
	public float lebar;

	public PersegiPanjang(float panjang, float lebar) {
		super();
		this.panjang = panjang;
		this.lebar = lebar;
	}

	@Override
	public float luas() {
		float luas = 0;
		
		luas = panjang * lebar;
		
		return luas;
	}
	
	@Override
	public float keliling() {
		float keliling = 0;
		
		keliling = (lebar * 2) + (panjang * 2);
		
		return keliling;
	}
	
	//Overload
	public float luas(float panjang , float lebar) {
		float luas = 0;
		
		luas = panjang * lebar;
		
		return luas;
	}
	//Overload
	public float keliling(float panjang, float lebar) {
		float keliling = 0;
		
		keliling = panjang * lebar;
		
		return keliling;
	}

}
