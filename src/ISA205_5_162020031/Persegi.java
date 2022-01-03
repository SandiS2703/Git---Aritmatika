/*
Identitas Kode Program
NRP                 : 162020031
Nama                : Sandi Yusup Sinaga
Nama File           : Persegi.java
Deskripsi Program   : Penerapan Override & Overload Pada Program Menghitung Luas & Keliling Bangun Datar
*/
package ISA205_5_162020031;

public class Persegi extends BangunDatar{
	
	public float sisi;
	
	public Persegi(float sisi) {
		super();
		this.sisi = sisi;
	}

	@Override
	public float luas() {
		float luas = 0;
		
		luas = sisi * sisi;
		
		return luas;
	}
	
	@Override
	public float keliling() {
		float keliling = 0;
		
		keliling = sisi * 4;
		
		return keliling;
	}
	
	//Overload
	public float luas(float sisi) {
		float luas = 0;
		
		luas = sisi * sisi;
		
		return luas;
	}
	
	//Overload
	public float keliling(float sisi) {
		float keliling = 0;
		
		keliling = sisi * 4;
		
		return keliling;
	}

}
