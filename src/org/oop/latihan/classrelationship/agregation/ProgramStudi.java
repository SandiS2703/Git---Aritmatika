package org.oop.latihan.classrelationship.agregation;
import java.util.List;

public class ProgramStudi {
	private int kodeProdi;
	private String nama;
	
	List<Dosen> listDosen;
	
	public ProgramStudi() {
		
	}

	public ProgramStudi(int kodeProdi, String nama, List<Dosen> listDosen) {
		super();
		this.kodeProdi = kodeProdi;
		this.nama = nama;
		this.listDosen = listDosen;
	}

	public int getKodeProdi() {
		return kodeProdi;
	}

	public void setKodeProdi(int kodeProdi) {
		this.kodeProdi = kodeProdi;
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
	
	
}
