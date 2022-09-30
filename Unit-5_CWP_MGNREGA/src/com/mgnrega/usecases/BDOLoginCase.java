package com.mgnrega.usecases;

import java.util.Scanner;
import com.mgnrega.dao.BDO_DAO;
import com.mgnrega.dao.BDO_DAOImpl;
import com.mgnrega.exceptions.UsersException;

public class BDOLoginCase {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("<=== BDO Login Page===>");
		
		System.out.println("Enter Email:");
		String email = sc.next();
		
		System.out.println("Enter Password:");
		String pass = sc.next();
		
		BDO_DAO bdo_log = new BDO_DAOImpl();
		
		try {
			String name = bdo_log.loginBDO(email, pass);
			System.out.println("Welcome "+name);
		} catch (UsersException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
