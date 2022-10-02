package com.mgnrega.usecases;

import java.util.Scanner;

import com.mgnrega.dao.GPM_DAO;
import com.mgnrega.dao.GPM_DAOImpl;
import com.mgnrega.exceptions.UsersException;
import com.mgnrega.main.GPM_Main;

public class ChangeGPMPassCase {

	public static void main(String[] args) {
		
		System.out.println();
		System.out.println("<=======  Change GPM Login Password  =======>");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your email Id :");
		String email = sc.next();
		
		System.out.println("Enter your old password :");
		String old_pass = sc.next();
		
		System.out.println("Enter your new password :");
		String new_pass = sc.next();
		
		GPM_DAO gpmdao = new GPM_DAOImpl();
		
		try {
			System.out.println(gpmdao.changeGPMPass(email, old_pass, new_pass));
		} catch (UsersException e) {
			e.printStackTrace();
		}

		System.out.println();
		System.out.println("Enter 1 to go to main page...");
		System.out.println("Enter 2 to Exit from Application...");
		System.out.println();

		int option = sc.nextInt();

		switch (option) {
		case 1:
			GPM_Main.main(args);
			break;
		case 2:
			System.out.println("Thank you for using MGNREGA management system...");
			break;
		}
	}

}
