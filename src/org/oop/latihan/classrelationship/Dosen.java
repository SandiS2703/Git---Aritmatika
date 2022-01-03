package org.oop.latihan.classrelationship;
import java.util.List;

public class Dosen {
	private String nidn;
	private String nama;
	private List<Mahasiswa> listMahasiswa;
	
	public Dosen(String nidn, String nama, List<Mahasiswa> listMahasiswa) {
		this.nidn = nidn;
		this.nama = nama;
		this.listMahasiswa = listMahasiswa;
	}

	public String getNidn() {
		return nidn;
	}

	public void setNidn(String nidn) {
		this.nidn = nidn;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public List<Mahasiswa> getListMahasiswa() {
		return listMahasiswa;
	}

	public void setListMahasiswa(List<Mahasiswa> listMahasiswa) {
		this.listMahasiswa = listMahasiswa;
	}
	
	
	
	
}
