package latihan1;

public class A {
	public int i, j;
	
	void tampilJ() {
		System.out.println("i dan j : " +i+ " " +j);
	}
	
}


//Subclass
class B extends A{
	int k;
	
	void tampilK() {
		System.out.println("K : "+k);
	}
	
	void jumlah() {
		System.out.println("Jumlah = "+(i+j+k));
	}
	
	void jumlahA() {
		System.out.println("Jumlah A = "+(super.i+j+k));
	}
}