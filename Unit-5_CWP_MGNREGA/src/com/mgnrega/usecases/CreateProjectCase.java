package com.mgnrega.usecases;

import java.util.Scanner;

import com.mgnrega.bean.Projects;
import com.mgnrega.dao.Project_DAO;
import com.mgnrega.dao.Project_DAOImpl;
import com.mgnrega.main.BDO_Main;

public class CreateProjectCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("<=======  Create Projects...  ========>");
		System.out.println();
		
		System.out.println("Enter Project Name :");
		String name = sc.next();
		System.out.println("Enter Project Start_Date (yyyy-mm--dd) :");
		String s_date = sc.next();
		System.out.println("Enter Project End_Date (yyyy-mm--dd) :");
		String e_date = sc.next();
		System.out.println("Enter Project Status (Not_Started/WIP/Completed) :");
		String status = sc.next();

		Project_DAO proj_reg = new Project_DAOImpl();

		Projects project = new Projects();
		project.setName(name);
		project.setStart_Date(s_date);
		project.setEnd_Date(e_date);
		project.setStatus(status);

		System.out.println(proj_reg.createProject(project));
		
		System.out.println();
		System.out.println("Enter 1 to create more projects...");
		System.out.println("Enter 2 to go to main page...");
		System.out.println("Enter 3 to Exit from Application...");
		System.out.println();

		int option = sc.nextInt();

		switch (option) {
		case 1:
			CreateProjectCase.main(args);
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
