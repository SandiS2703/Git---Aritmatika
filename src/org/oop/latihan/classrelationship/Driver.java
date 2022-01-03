package org.oop.latihan.classrelationship;
import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		List<Mahasiswa> listMahasiswa = new ArrayList<Mahasiswa>();
		List<Mahasiswa> listMahasiswa2 = new ArrayList<Mahasiswa>();
		Mahasiswa mahasiswa1 = new Mahasiswa();
		mahasiswa1.setNrp("16202001");
		mahasiswa1.setNama("Farel");
		
		Mahasiswa mahasiswa2 = new Mahasiswa();
		mahasiswa2.setNrp("16202002");
		mahasiswa2.setNama("Usamah");
		
		listMahasiswa.add(mahasiswa1);
		listMahasiswa.add(mahasiswa2);
		
		Mahasiswa mahasiswa3 = new Mahasiswa();
		mahasiswa3.setNrp("16202003");
		mahasiswa3.setNama("Yazid");
		
		listMahasiswa2.add(mahasiswa2);
		listMahasiswa2.add(mahasiswa3);
		
		Dosen dosen1 = new Dosen("120160502", "Kurnia Ramadhan Putra", listMahasiswa);
		Dosen dosen2 = new Dosen("120160503", "Nur Fitrianti", listMahasiswa2);
		
		List<Dosen> listDosen = new ArrayList<Dosen>();
		listDosen.add(dosen1);
		listDosen.add(dosen2);
		
		mahasiswa1.setDosen(dosen1);
		mahasiswa2.setListDosen(listDosen);
		mahasiswa3.setDosen(dosen2);
		System.out.println("------------------------------------------");
		System.out.println("NIDN Dosen 1 : " + dosen1.getNidn());
		System.out.println("Nama Dosen 1 : " + dosen1.getNama());
		System.out.println("------------------------------------------");
		System.out.println("Mahasiswa Bimbingan : ");
		for(int i = 0; i < listMahasiswa.size(); i++) {
			System.out.println("Mahasiswa " + (i+1) + " : ");
			System.out.println(dosen1.getListMahasiswa().get(i).getNrp());
			System.out.println(dosen1.getListMahasiswa().get(i).getNama());
			System.out.println();
		}
		System.out.println("Jumlah Mahasiswa Bimbingan : " +dosen1.getListMahasiswa().size());
		System.out.println("------------------------------------------");
		System.out.println();
		System.out.println("------------------------------------------");
		System.out.println("NIDN Dosen 2 : " + dosen2.getNidn());
		System.out.println("Nama Dosen 2 : " + dosen2.getNama());
		System.out.println("------------------------------------------");
		System.out.println("Mahasiswa Bimbingan : ");
		for(int i = 0; i < listMahasiswa.size(); i++) {
			System.out.println("Mahasiswa " + (i+1) + " : ");
			System.out.println(dosen2.getListMahasiswa().get(i).getNrp());
			System.out.println(dosen2.getListMahasiswa().get(i).getNama());
			System.out.println();
		}
		System.out.println("Jumlah Mahasiswa Bimbingan : " +dosen2.getListMahasiswa().size());
		System.out.println("------------------------------------------");
		System.out.println();
		System.out.println("------------------------------------------");
		System.out.println("NRP Mahasiswa : " + mahasiswa2.getNrp());
		System.out.println("Nama Mahasiswa s : " + mahasiswa2.getNama());
		System.out.println("------------------------------------------");
		for(int i = 0; i < listDosen.size(); i++) {
			System.out.println("Dosen Pembimbing " + (i+1) + " : ");
			System.out.println(mahasiswa2.getListDosen().get(i).getNidn());
			System.out.println(mahasiswa2.getListDosen().get(i).getNama());
			System.out.println();
		}
		System.out.println("Jumlah Dosen Pembimbing : " +mahasiswa2.getListDosen().size());
	}

}
