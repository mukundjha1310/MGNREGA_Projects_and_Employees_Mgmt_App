package com.mgnrega.usecases;

import java.util.Scanner;
import com.mgnrega.bean.Employees;
import com.mgnrega.dao.Empl_DAO;
import com.mgnrega.dao.Empl_DAOImpl;
import com.mgnrega.main.GPM_Main;

public class CreateEmplCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("<=======  Create Employees...  ========>");
		
		System.out.println("Enter Employee Name :");
		String name = sc.next();
		System.out.println("Enter Employee's Mobile Number :");
		String mob = sc.next();
		System.out.println("Enter Employee's Wages :");
		int wages = sc.nextInt();
		
		Empl_DAO empl_reg = new Empl_DAOImpl();
		
		Employees empl = new Employees();
		empl.setName(name);
		empl.setMobile(mob);
		empl.setWages(wages);
		
		System.out.println(empl_reg.createEmployee(empl));

		System.out.println();
		System.out.println("Enter 1 to create more employees...");
		System.out.println("Enter 2 to go to main page...");
		System.out.println("Enter 3 to Exit from Application...");
		System.out.println();

		int option = sc.nextInt();

		switch (option) {
		case 1:
			CreateEmplCase.main(args);
			break;
		case 2:
			GPM_Main.main(args);
			break;
		case 3:
			System.out.println("Thank you for using MGNREGA management system...");
			break;
		}
	}

}
