package org.oop.latihan.classrelationship;
import java.util.List;

public class Mahasiswa {
	private String nrp;
	private String nama;
	private List<Dosen> listDosen;
	private Dosen dosen;
	
	public Mahasiswa() {
		
	}

	public Mahasiswa(String nrp, String nama, List<Dosen> listDosen) {
		this.nrp = nrp;
		this.nama = nama;
		this.listDosen = listDosen;
	}

	public Mahasiswa(String nrp, String nama, Dosen dosen) {
		this.nrp = nrp;
		this.nama = nama;
		this.dosen = dosen;
	}

	public String getNrp() {
		return nrp;
	}

	public void setNrp(String nrp) {
		this.nrp = nrp;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public List<Dosen> getListDosen() {
		return listDosen;
	}

	public void setListDosen(List<Dosen> listDosen) {
		this.listDosen = listDosen;
	}

	public Dosen getDosen() {
		return dosen;
	}

	public void setDosen(Dosen dosen) {
		this.dosen = dosen;
	}
	
	
}
