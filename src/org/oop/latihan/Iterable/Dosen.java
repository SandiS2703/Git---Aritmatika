package org.oop.latihan.Iterable;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Dosen {
	String nip;
	List<String> daftarHobi;
	
	
	
	public Dosen(String nip) {
		this.nip = nip;
		daftarHobi = new ArrayList<String>();
	}
	
	public String getNip() {
		return nip;
	}
	
	public void addHobi(String hobi) {
		daftarHobi.add(hobi);
	}
	
	public List<String> getDaftarHobi(){
		return Collections.unmodifiableList(daftarHobi);
	}
}
