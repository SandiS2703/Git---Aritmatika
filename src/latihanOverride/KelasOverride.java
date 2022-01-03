package latihanOverride;

public class KelasOverride {
	
	public static void main(String[] args) {
		
		A a = new A();
		a.p(100);
		a.p(10.0);
	}

}

class B{
	public void p(double i) {
		System.out.println(i * 2);
	}
}

class A extends B {
	@Override
	public void p(double i) {
		System.out.println(i);
	}
}