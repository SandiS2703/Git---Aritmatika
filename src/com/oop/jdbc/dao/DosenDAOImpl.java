package com.oop.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.oop.jdbc.pojo.Dosen;
import org.oop.jdbc.utils.DatabaseUtil;

import com.oop.jdbc.daoimpl.DosenDAO;

public class DosenDAOImpl implements DosenDAO{

	@Override
	public void getDosenByEmail(String Email) {
		
	}

	@Override
	public List<Dosen> getAllDosen() {
		List<Dosen> listDosen = new ArrayList<Dosen>();
		DatabaseUtil db = new DatabaseUtil();
		try {
			db.connect();
			
			String query = "select * from dosen";
			
			ResultSet rs = db.readData(query);
			
			//proces query result
			while (rs.next()) {
				Dosen dosen = new Dosen();
				
				dosen.setNip(Integer.parseInt(rs.getObject(1).toString()));
				dosen.setNama(rs.getObject(2).toString());
				dosen.setEmail(rs.getObject(3).toString());
				
				listDosen.add(dosen);
				
			}
			//close db connection
			db.disconnect();
		}catch(SQLException ex){
			System.out.println("Terjadi Error : " +ex.getMessage());
		}
		return listDosen;
	}

	@Override
	public void saveDosen(Dosen dosen) {
		DatabaseUtil db = new DatabaseUtil();
		
		String query;
		try {
			db.connect();
			query = "INSERT INTO dosen (nip, nama, email)"
					+ " VALUES ('"+dosen.getNip()+"', '"
					+ dosen.getNama()+"', '"
					+ dosen.getEmail()+"')";
			db.executeQuery(query);
		}catch(Exception ex) {
			System.out.println("Terjadi Error : " +ex.getMessage());
		}
	}

	@Override
	public void updateDosen(Dosen dosen) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDosen(Dosen dosen) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Dosen login(String email, String password) {
		DatabaseUtil db = new DatabaseUtil();
		Dosen dosen = new Dosen();
		dosen = null;
		try {
			db.connect();
			
			String query = "select * from dosen where email = '" +email+ "' and password = '" +password+ "';";
			
			ResultSet rs = db.readData(query);
			
			List<Dosen> listDosen = new ArrayList<Dosen>();
			
			//proces query result
			while(rs.next()) {
				Dosen dsn = new Dosen();
				dsn.setNip(Integer.parseInt(rs.getObject(1).toString()));
				dsn.setNama(rs.getObject(2).toString());
				dsn.setEmail(rs.getObject(3).toString());
				dsn.setUsername(rs.getObject(4).toString());
				dsn.setPassword(rs.getObject(5).toString());
				
				listDosen.add(dsn);
				
				for(Dosen ds : listDosen) {
					if(email.equals(ds.getEmail()) && password.equals(ds.getPassword())) {
						dosen = ds;
					}
				}
				
			}
			
			//close
			db.disconnect();
			
		} catch (SQLException ex){
				System.out.println("Terjadi Error : " +ex.getMessage());
		}
		
		return dosen;
	}

}
