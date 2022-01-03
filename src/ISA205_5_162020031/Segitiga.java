/*
Identitas Kode Program
NRP                 : 162020031
Nama                : Sandi Yusup Sinaga
Nama File           : Segitiga.java
Deskripsi Program   : Penerapan Override & Overload Pada Program Menghitung Luas & Keliling Bangun Datar
*/
package ISA205_5_162020031;

public class Segitiga extends BangunDatar{
	
	public float alas;
	public float tinggi;
	
	public Segitiga(float alas, float tinggi) {
		super();
		this.alas = alas;
		this.tinggi = tinggi;
	}
	
	public float miring(float alas, float tinggi) {
		float miring = 0;
		
		miring = (float) (Math.sqrt( Math.pow(alas,2) + Math.pow(tinggi,2)));
		
		return miring;
	}
	
	@Override
	public float luas() {
		float luas = 0;
		
		luas =(float) (0.5 * alas * tinggi);
		
		return luas;
	}
	
	@Override
	public float keliling() {
		float keliling = 0;
		
		keliling = alas + tinggi + this.miring(this.alas, this.tinggi);
		
		return keliling; 
	}
	
	//Overload
	public float luas(float alas, float tinggi) {
		float luas = 0;
		
		luas =(float) (0.5 * alas * tinggi);
		
		return luas;
	}
	
	//Overoad
	public float keliling(float alas, float tinggi) {
		float keliling = 0;
		
		keliling = alas + tinggi + miring(alas, tinggi);
		
		return keliling; 
	}
}
