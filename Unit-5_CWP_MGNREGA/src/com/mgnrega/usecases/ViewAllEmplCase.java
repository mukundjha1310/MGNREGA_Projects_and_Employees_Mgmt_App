package com.mgnrega.usecases;

import java.util.List;
import java.util.Scanner;

import com.mgnrega.bean.Employees;
import com.mgnrega.dao.Empl_DAO;
import com.mgnrega.dao.Empl_DAOImpl;
import com.mgnrega.exceptions.UsersException;
import com.mgnrega.main.GPM_Main;

public class ViewAllEmplCase {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("<=======  List Of All Employees...  =======>");
		System.out.println();
		Scanner sc = new Scanner(System.in);

		Empl_DAO empls = new Empl_DAOImpl();

		try {

			List<Employees> emplList = empls.viewAllEmployees();

			if (emplList.isEmpty())
				System.out.println("No Employees found...!");
			else
				emplList.forEach(e -> {
					System.out.println("Employee_Id :     " + e.getEmployee_Id());
					System.out.println("Employee_Name :   " + e.getName());
					System.out.println("Employee_Mobile : " + e.getMobile());
					System.out.println("Employee_Wages :  " + e.getWages());
					System.out.println("============================================");
					System.out.println();
				});

		} catch (UsersException e) {
			System.out.println(e.getMessage());
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
