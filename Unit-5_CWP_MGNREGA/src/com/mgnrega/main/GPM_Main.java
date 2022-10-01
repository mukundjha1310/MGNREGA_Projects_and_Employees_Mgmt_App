package com.mgnrega.main;

import java.util.Scanner;
import com.mgnrega.usecases.AssignEmployeesToProjectCase;
import com.mgnrega.usecases.CreateEmplCase;
import com.mgnrega.usecases.ViewAllEmplCase;
import com.mgnrega.usecases.ViewAllEmployeesWorkDetailsCase;

public class GPM_Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.println("Enter 1 to Create a Employee...");
		System.out.println("Enter 2 to View Details Of Employees...");
		System.out.println("Enter 3 to Assign Employee to a Project....");
		System.out.println("Enter 4 to View total number of days Employee worked in a project and also their wages...");
		System.out.println();
		System.out.println("Enter 5 to LogOut from Main page...");
		System.out.println("Enter 6 to Exit from Application...");
		System.out.println();

		System.out.println("Select an option to continue:");

		int GPM_Opt = sc.nextInt();

		switch (GPM_Opt) {
		case 1:
			CreateEmplCase.main(args);
			break;
		case 2:
			ViewAllEmplCase.main(args);
			break;
		case 3:
			AssignEmployeesToProjectCase.main(args);
			break;
		case 4:
			ViewAllEmployeesWorkDetailsCase.main(args);
			break;
		case 5:
			Welcome_Page.main(args);
			break;
		case 6:
			System.out.println("Thank you for using MGNREGA management system...");
			break;

		}

	}

}
