package com.mgnrega.usecases;

import java.util.Scanner;
import com.mgnrega.dao.GPM_DAO;
import com.mgnrega.dao.GPM_DAOImpl;
import com.mgnrega.exceptions.UsersException;
import com.mgnrega.main.GPM_Main;
import com.mgnrega.main.Welcome_Page;

public class GPMLoginCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("<=== GPM Login Page===>");

		System.out.println("Enter Email:");
		String email = sc.next();

		System.out.println("Enter Password:");
		String pass = sc.next();

		GPM_DAO bdo_log = new GPM_DAOImpl();

		try {
			String name = bdo_log.loginGPM(email, pass);
			System.out.println("Welcome " + name);
			
			GPM_Main.main(args);
			
		} catch (UsersException e) {
			System.out.println(e.getMessage());
			
			System.out.println();
			System.out.println("Enter 1 to go on previous page...");
			System.out.println("Enter 2 to Exit from Application...");
			System.out.println();

			int option = sc.nextInt();

			switch (option) {
			case 1:
				Welcome_Page.main(args);
				break;
			case 2:
				System.out.println("Thank you for using MGNREGA management system...");
				break;
			}
		}

	}

}
