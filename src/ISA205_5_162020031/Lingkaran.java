/*
Identitas Kode Program
NRP                 : 162020031
Nama                : Sandi Yusup Sinaga
Nama File           : Lingkaran.java
Deskripsi Program   : Penerapan Override & Overload Pada Program Menghitung Luas & Keliling Bangun Datar
*/
package ISA205_5_162020031;

public class Lingkaran extends BangunDatar {
	
	public float r;
	
	public Lingkaran(float r) {
		super();
		this.r = r;
	}

	@Override
	public float luas() {
		float luas = 0;
		
		luas = (float) (3.14 * (r * r));
		
		return luas;
	}
	
	@Override
	public float keliling() {
		float keliling = 0;
		
		keliling = (float) (2 * 3.14 * r);
		
		return keliling;
	}
	
	//Overload
	public float luas(float r) {
		float luas = 0;
		
		luas = (float) (3.14 * (r * r));
		
		return luas;
	}
	
	//Overload
	public float keliling(float r) {
		float keliling = 0;
		
		keliling = (float) (2 * 3.14 * r);
		
		return keliling;
	}
}
