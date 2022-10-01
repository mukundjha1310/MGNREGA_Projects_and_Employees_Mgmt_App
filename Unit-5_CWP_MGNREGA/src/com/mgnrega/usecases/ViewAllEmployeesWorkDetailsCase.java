package com.mgnrega.usecases;

import java.util.List;
import java.util.Scanner;
import com.mgnrega.bean.Employees_DTO2;
import com.mgnrega.dao.Empl_DAO;
import com.mgnrega.dao.Empl_DAOImpl;
import com.mgnrega.exceptions.UsersException;
import com.mgnrega.main.GPM_Main;

public class ViewAllEmployeesWorkDetailsCase {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("<=======  View all Employees work details and total wages...  =======>");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		Empl_DAO empls = new Empl_DAOImpl();

		try {

			List<Employees_DTO2> emplList = empls.viewAllEmployeesWorkDetails();

			if (emplList.isEmpty())
				System.out.println("No Employees found...!");
			else
				emplList.forEach(e -> {
					System.out.println("Employee_Id :                " + e.getEmployee_Id());
					System.out.println("Employee_Name :              " + e.getName());
					System.out.println("Employee_Mobile :            " + e.getMobile());
					System.out.println("Employee_Total_Days_Worked : " + e.getTotalDaysWorked());
					System.out.println("Employee_Total_Wages :       " + e.getTotalWages());
					System.out.println("Employee_Project_Name :      " + e.getProjectName());
					System.out.println("Employee_Project_Status :    " + e.getProjectStatus());
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
