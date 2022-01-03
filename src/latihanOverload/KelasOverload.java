package latihanOverload;

public class KelasOverload {

	public static void main(String[] args) {
		Y y = new Y();
		y.p(10);
		y.p(10.0);
	}

}


class X{
	public void p(double i) {
		System.out.println(i * 2);
	}
}

class Y extends X{
	
	public void p(int i) {
		System.out.println(i);
	}
}