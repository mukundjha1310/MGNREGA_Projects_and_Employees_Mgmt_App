package com.mgnrega.usecases;

import java.util.List;
import java.util.Scanner;
import com.mgnrega.bean.Projects;
import com.mgnrega.dao.Project_DAO;
import com.mgnrega.dao.Project_DAOImpl;
import com.mgnrega.exceptions.UsersException;
import com.mgnrega.main.BDO_Main;

public class ViewAllProjectsCase {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("<=======  List Of All Projects...  =======>");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		Project_DAO projects = new Project_DAOImpl();
		
		try {
			List<Projects> projectList = projects.viewAllProjects();
			
			if(projectList.isEmpty()) System.out.println("No Projects found...!");
			else projectList.forEach(p -> {
				System.out.println("Project_Id :   " + p.getProject_Id());
				System.out.println("Project_Name : " + p.getName());
				System.out.println("Start_Date :   " + p.getStart_Date());
				System.out.println("End_Date :     " + p.getEnd_Date());
				System.out.println("Status :       " + p.getStatus());
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
			BDO_Main.main(args);
			break;
		case 2:
			System.out.println("Thank you for using MGNREGA management system...");
			break;
		}
		
	}

}
