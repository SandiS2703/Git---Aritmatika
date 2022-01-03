package org.oop.latihan.Iterable;
import java.util.List;

public class MainImmutableList {

	public static void main(String[] args) {
		Dosen dosen = new Dosen("120160502");
		dosen.addHobi("Gaming");
		dosen.addHobi("Teaching");
		dosen.addHobi("Programing");
		hacker(dosen.getDaftarHobi());
		
		System.out.println("NIP : " + dosen.getNip());
		System.out.println("Daftar Hobi : ");
		for(String hobi : dosen.daftarHobi) {
			System.out.print(hobi + ", ");
		}
	}
	
	public static void hacker(List<String> daftarHobi) {
		daftarHobi.add("Unwanted Hobi");
		
	}

}
