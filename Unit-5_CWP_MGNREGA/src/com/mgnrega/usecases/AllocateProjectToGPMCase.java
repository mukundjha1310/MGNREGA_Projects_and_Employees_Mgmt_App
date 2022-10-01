package com.mgnrega.usecases;

import java.util.Scanner;
import com.mgnrega.dao.Project_DAO;
import com.mgnrega.dao.Project_DAOImpl;
import com.mgnrega.exceptions.UsersException;
import com.mgnrega.main.BDO_Main;

public class AllocateProjectToGPMCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("<=====  Project Allocation to GPM...  =====>");
		
		System.out.println("Enter GPM Id :");
		int GPMId = sc.nextInt();
		
		System.out.println("Enter Project Id :");
		int pId = sc.nextInt();
		
		Project_DAO projAllocate = new Project_DAOImpl();
		
		try {
			System.out.println(projAllocate.allocateProjectToGPM(pId, GPMId));

			System.out.println();
			System.out.println("Enter 1 to Allocate another more Projects...");
			System.out.println("Enter 2 to go to main page...");
			System.out.println("Enter 3 to Exit from Application...");
			System.out.println();

			int option = sc.nextInt();

			switch (option) {
			case 1:
				AllocateProjectToGPMCase.main(args);
				break;
			case 2:
				BDO_Main.main(args);
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
				AllocateProjectToGPMCase.main(args);
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

}
