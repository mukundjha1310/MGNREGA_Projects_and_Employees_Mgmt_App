package com.mgnrega.usecases;

import java.util.List;
import java.util.Scanner;
import com.mgnrega.bean.Employees_DTO;
import com.mgnrega.dao.Empl_DAO;
import com.mgnrega.dao.Empl_DAOImpl;
import com.mgnrega.exceptions.UsersException;
import com.mgnrega.main.BDO_Main;

public class ViewAllEmplByProjectCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.println("<========  View List Of Employees By Project Id...  =======>");
		System.out.println();

		System.out.println("Enter Project Id :");
		int proj_Id = sc.nextInt();

		Empl_DAO empls = new Empl_DAOImpl();

		try {

			List<Employees_DTO> emplList = empls.viewEmployeesByProject(proj_Id);

			if (emplList.isEmpty())
				System.out.println("No Employees found...!");
			else
				System.out.println();
			emplList.forEach(e -> {
				System.out.println("Employee_Id :     " + e.getEmployee_Id());
				System.out.println("Employee_Name :   " + e.getEmp_Name());
				System.out.println("Employee_Mobile : " + e.getMobile());
				System.out.println("Employee_Wages :  " + e.getWages());
				System.out.println("Project_Name :    " + e.getProj_Name());
				System.out.println("Start_Date :      " + e.getStart_Date());
				System.out.println("End_Date :        " + e.getEnd_Date());
				System.out.println("Project_Status :  " + e.getProj_Status());
				System.out.println("============================================");
				System.out.println();
			});

		} catch (UsersException e) {
			System.out.println(e.getMessage());
		}

		System.out.println();
		System.out.println("Enter 1 to View more list of Employees...");
		System.out.println("Enter 2 to go to main page...");
		System.out.println("Enter 3 to Exit from Application...");
		System.out.println();

		int option = sc.nextInt();

		switch (option) {
		case 1:
			ViewAllEmplByProjectCase.main(args);
			break;
		case 2:
			BDO_Main.main(args);
			break;
		case 3:
			System.out.println("Thank you for using MGNREGA management system...");
			break;
		}
	}

}
