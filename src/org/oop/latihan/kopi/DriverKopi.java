package org.oop.latihan.kopi;
import java.util.Scanner;

public class DriverKopi {

	public static void main(String[] args) {
		int a;
		Espresso E1 = new Espresso(45);
		Mochaccino M1 = new Mochaccino(10, 20, 20);
		Latte L1 = new Latte(10, 40, 10);
		Cappuccino C1 = new Cappuccino(10, 10, 10);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("----------------------------");
		System.out.println("|          KopiKu          |");
		System.out.println("----------------------------");
		System.out.println("|1.Espresso                |");
		System.out.println("|2.Moccacino               |");
		System.out.println("|3.Capucino                |");
		System.out.println("|4.Latte                   |");
		System.out.println("----------------------------");
		
		System.out.println("Masukkan pilihan : ");
		a = scan.nextInt();
		
		switch(a) {
		
		case 1 :
			E1.komposisi();
			break;
		case 2 :
			M1.komposisi();
			break;
		case 3 :
			C1.komposisi();
			break;
		case 4 :
			L1.komposisi();
			break;
		}
		
		scan.close();
	}

}
