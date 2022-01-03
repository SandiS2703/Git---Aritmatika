/*
Identitas Kode Program
NRP                 : 162020031
Nama                : Sandi Yusup Sinaga
Nama File           : Main.java
Deskripsi Program   : Penerapan Override & Overload Pada Program Menghitung Luas & Keliling Bangun Datar
*/
package ISA205_5_162020031;

public class Main {

	public static void main(String[] args) {
		
		Persegi persegi1 = new Persegi(5);
		PersegiPanjang persegip1 = new PersegiPanjang(5, 3);
		Lingkaran lingkaran1 = new Lingkaran(19);
		Segitiga segitigaSiku1 = new Segitiga(3, 4);
		
		System.out.println("Luas Persegi Overriding : " +persegi1.luas());
		System.out.println("Luas Persegi Overloading : " +persegi1.luas(4));
		System.out.println("Keliling Persegi Overriding : " +persegi1.keliling());
		System.out.println("Keliling Persegi Overloading : " +persegi1.keliling(4));
		
		System.out.println("\nLuas Persegi Panjang Overriding : " +persegip1.luas());
		System.out.println("Luas Persegi Panjang Overloading : " +persegip1.luas(4, 2));
		System.out.println("Keliling Persegi Panjang Overriding : " +persegip1.keliling());
		System.out.println("Keliling Persegi Panjang Overloading : " +persegip1.keliling(4, 2));
		
		System.out.println("\nLuas Lingkaran Overriding : " +lingkaran1.luas());
		System.out.println("Luas Lingkaran Overloading : " +lingkaran1.luas(21));
		System.out.println("Keliling Lingkaran Overriding : " +lingkaran1.keliling());
		System.out.println("Keliling Lingkaran Overloading : " +lingkaran1.keliling(21));
		
		System.out.println("\nLuas Segitiga Overriding : " +segitigaSiku1.luas());
		System.out.println("Luas Segitiga Overloading : " +segitigaSiku1.luas(8, 24));
		System.out.println("Keliling Segitiga Overriding : " +segitigaSiku1.keliling());
		System.out.println("Keliling Segitiga Overloading : " +segitigaSiku1.keliling(8, 24));
	}

}
