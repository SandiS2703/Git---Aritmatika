package latihan1;

public class MainA {
	public static void main(String[] args) {
		
		A superOb = new A();
		B subOb = new B();
		
		superOb.i = 100;
		superOb.j = 200;
		//superclass tidak mengakses behavior dari subclass
		
		System.out.println("Isi dari SuperClass");
		superOb.tampilJ();
		System.out.println("");
		
		subOb.i = 11;
		subOb.j = 12;
		subOb.k = 13;
		System.out.println("Isi dari SubClass");
		
		//mengakses method tampilJ pada superClass
		
		subOb.tampilJ();
		subOb.tampilK();
		subOb.jumlah();
		subOb.jumlahA();
		
	}
}
