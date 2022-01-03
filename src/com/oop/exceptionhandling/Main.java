package com.oop.exceptionhandling;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Panjang : " +handlingNullPointerException("Pemrograman"));
		System.out.println("Hasil bagi : " +handlingArithmeticException(10));
		System.out.println("Bilangan : " +handlingNumberFormatException("Sandi"));
		System.out.println("Panjang Array : " +handlingArrayIndexOutOfBoundsException(5));
	}
	
	static int handlingNullPointerException(String teks) {
		int panjangTeks = 0;
		
		try {
			System.out.println("Length : " +teks.length());
		} catch (NullPointerException e) {
			System.out.println("Error : " +e.getMessage());
		} 
		
		return panjangTeks; 
	}
	
	static double handlingArithmeticException(int bilangan) {
		double hasil = 0;
		
		try {
			hasil = (double)bilangan/3;
		} catch (ArithmeticException e) {
			System.out.println("Error : " +e.getMessage());
		}
		
		return hasil;
	}
	
	static int handlingNumberFormatException(String teks) {
		int bilangan = 0;
		
		try {
			bilangan = Integer.parseInt(teks);
		} catch (NumberFormatException e) {
			System.out.println("Error : " +e.getMessage());
		}
		
		return bilangan;
	}
	
	static int handlingArrayIndexOutOfBoundsException(int panjangArray) {
		int element = 0;
		int[] arrInt = new int[panjangArray];
		
		try {
			arrInt[0] = 1;
			arrInt[1] = 2;
			arrInt[2] = 3;
			arrInt[3] = 4;
			arrInt[4] = 5;
			arrInt[5] = 6;
			
			element = arrInt[5];
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error : " +e.getMessage());
		}
		
		return element;
	}
}
