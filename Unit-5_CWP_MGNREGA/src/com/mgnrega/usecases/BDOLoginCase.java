package com.mgnrega.usecases;

import java.util.Scanner;
import com.mgnrega.dao.BDO_DAO;
import com.mgnrega.dao.BDO_DAOImpl;
import com.mgnrega.exceptions.UsersException;
import com.mgnrega.main.BDO_Main;
import com.mgnrega.main.Welcome_Page;

public class BDOLoginCase {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("<==== Welcome to BDO Login page ====>");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Email:");
		String email = sc.next();

		System.out.println("Enter Password:");
		String pass = sc.next();

		BDO_DAO bdo_log = new BDO_DAOImpl();

		try {
			String name = bdo_log.loginBDO(email, pass);

			System.out.println();
			System.out.println("Welcome " + name);

			BDO_Main.main(args);

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
