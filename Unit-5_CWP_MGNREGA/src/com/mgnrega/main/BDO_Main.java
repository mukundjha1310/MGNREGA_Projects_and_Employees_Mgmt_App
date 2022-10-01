package com.mgnrega.main;

import java.util.Scanner;
import com.mgnrega.usecases.AllocateProjectToGPMCase;
import com.mgnrega.usecases.CreateGPMCase;
import com.mgnrega.usecases.CreateProjectCase;
import com.mgnrega.usecases.ViewAllEmplByProjectCase;
import com.mgnrega.usecases.ViewAllGPMCase;
import com.mgnrega.usecases.ViewAllProjectsCase;

public class BDO_Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.println("Enter 1 to Create a Project...");
		System.out.println("Enter 2 to View List Of Projects...");
		System.out.println("Enter 3 to Create new Gram Panchayat Members(GPMs)...");
		System.out.println("Enter 4 to View all the GPMs...");
		System.out.println("Enter 5 to Allocate  Project to GPM...");
		System.out.println("Enter 6 to See List of Employee working on that Project and their wages...");
		System.out.println();
		System.out.println("Enter 7 to LogOut from Main page...");
		System.out.println("Enter 8 to Exit from Application...");
		System.out.println();

		System.out.println("Select an option to continue:");

		int BDO_Opt = sc.nextInt();
		switch (BDO_Opt) {
		case 1:
			CreateProjectCase.main(args);
			break;
		case 2:
			ViewAllProjectsCase.main(args);
			break;
		case 3:
			CreateGPMCase.main(args);
			break;
		case 4:
			ViewAllGPMCase.main(args);
			break;
		case 5:
			AllocateProjectToGPMCase.main(args);
			break;
		case 6:
			ViewAllEmplByProjectCase.main(args);
			break;
		case 7:
			Welcome_Page.main(args);
			break;
		case 8:
			System.out.println("Thank you for using MGNREGA management system...");
			break;
		}

	}
}
