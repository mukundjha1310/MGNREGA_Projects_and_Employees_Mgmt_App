package com.mgnrega.usecases;

import java.util.Scanner;
import com.mgnrega.dao.Empl_DAO;
import com.mgnrega.dao.Empl_DAOImpl;
import com.mgnrega.exceptions.UsersException;
import com.mgnrega.main.GPM_Main;

public class AssignEmployeesToProjectCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("<=====  Employees Allocation to Project...  =====>");
		System.out.println();
		
		System.out.println("Enter Employee Id :");
		int EmplId = sc.nextInt();
		
		System.out.println("Enter Project Id :");
		int projId = sc.nextInt();
		
		Empl_DAO emplAllocate = new Empl_DAOImpl();
		
		try {
			System.out.println(emplAllocate.assignEmployeesToProject(projId, EmplId));
			
			System.out.println();
			System.out.println("Enter 1 to assign another more employees...");
			System.out.println("Enter 2 to go to main page...");
			System.out.println("Enter 3 to Exit from Application...");
			System.out.println();

			int option = sc.nextInt();

			switch (option) {
			case 1:
				AssignEmployeesToProjectCase.main(args);
				break;
			case 2:
				GPM_Main.main(args);
				break;
			case 3:
				System.out.println("Thank you for using MGNREGA management system...");
				break;
			}
			
		} catch (UsersException e) {
			System.out.println(e.getMessage());

			System.out.println();
			System.out.println("Enter 1 to try Again...");
			System.out.println("Enter 2 to go to main page...");
			System.out.println("Enter 3 to Exit from Application...");
			System.out.println();

			int option = sc.nextInt();

			switch (option) {
			case 1:
				AssignEmployeesToProjectCase.main(args);
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

}
