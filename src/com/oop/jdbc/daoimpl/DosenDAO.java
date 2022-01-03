package com.oop.jdbc.daoimpl;
import java.util.List;
import org.oop.jdbc.pojo.Dosen;

public interface DosenDAO {
	public void getDosenByEmail(String Email);
	public List<Dosen> getAllDosen();
	public void saveDosen(Dosen dosen);
	public void updateDosen(Dosen dosen);
	public void deleteDosen(Dosen dosen);
	public Dosen login(String email, String password);
}
