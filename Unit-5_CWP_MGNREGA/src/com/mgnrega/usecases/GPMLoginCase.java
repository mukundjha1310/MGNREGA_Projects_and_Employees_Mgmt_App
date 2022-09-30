package com.mgnrega.usecases;

import java.util.Scanner;
import com.mgnrega.dao.GPM_DAO;
import com.mgnrega.dao.GPM_DAOImpl;
import com.mgnrega.exceptions.UsersException;

public class GPMLoginCase {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("<=== GPM Login Page===>");
		
		System.out.println("Enter Email:");
		String email = sc.next();
		
		System.out.println("Enter Password:");
		String pass = sc.next();
		
		GPM_DAO bdo_log = new GPM_DAOImpl();
		
		try {
			String name = bdo_log.loginGPM(email, pass);
			System.out.println("Welcome "+name);
		} catch (UsersException e) {
			System.out.println(e.getMessage());
		}

	}

}
