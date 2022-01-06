package org.oop.jdbc.test;

import java.util.Scanner;

//import javax.xml.validation.Validator;

import org.oop.jdbc.pojo.Dosen;
import org.oop.jdbc.utils.DatabaseUtil;
//import org.oop.jdbc.utils.DatabaseUtil;
//import org.oop.jdbc.utils.Validator;
import org.oop.jdbc.utils.Validator;

import com.oop.jdbc.dao.DosenDAOImpl;
import com.oop.jdbc.daoimpl.DosenDAO;

public class MainTest {
	public static void main(String[] args) {
		DatabaseUtil db = new DatabaseUtil();
		
		db.connect();
		
		DosenDAO operation = new DosenDAOImpl();
		Dosen ds = new Dosen();
		
		
		for(Dosen dosen : operation.getAllDosen()) {
			System.out.println("NIP : " +dosen.getNip());
			System.out.println("Nama : "+dosen.getNama());
			System.out.println("Email : "+dosen.getEmail());
		}
		
		ds.setNip(162020035);
		ds.setNama("Yusup");
		ds.setEmail("syalala@gmail.com");
		
		operation.saveDosen(ds);
		
		Scanner scanner = new Scanner(System.in);
		Validator val = new Validator();
		//DosenDAO operation = new DosenDAOImpl();
		Dosen dosen;
		String email,password;
		boolean login = false;
		
		do {
			System.out.print("Email : "); email = scanner.nextLine();
			email = val.validateInput(scanner, "masukkan email :", "email");
			System.out.print("Password : "); password = scanner.nextLine();
			System.out.println();
			dosen = operation.login(email, password);
			if (dosen != null) {
				login = true;
				System.out.println("Login Berhasil...");
			}else {
				System.out.println("Email atau Password anda salah, coba lagi.....");
			}
		}while(!login);
		scanner.close();
	}
}
