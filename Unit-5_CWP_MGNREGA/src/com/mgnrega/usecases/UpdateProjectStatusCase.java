package com.mgnrega.usecases;

import java.util.Scanner;
import com.mgnrega.dao.Project_DAO;
import com.mgnrega.dao.Project_DAOImpl;
import com.mgnrega.exceptions.UsersException;
import com.mgnrega.main.GPM_Main;

public class UpdateProjectStatusCase {

	public static void main(String[] args) {

		System.out.println();
		System.out.println("<=======  Update Project Status  =======>");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Project Id :");
		int proj_id = sc.nextInt();
		
		System.out.println("Enter New Status (Not_Started/WIP/Completed) :");
		String new_status = sc.next();
		
		Project_DAO proj_dao = new Project_DAOImpl();
		
		try {
			System.out.println();
			System.out.println(proj_dao.updateProjectStatus(proj_id, new_status));
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
