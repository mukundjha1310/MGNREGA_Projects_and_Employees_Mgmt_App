package com.mgnrega.main;

import java.util.Scanner;
import com.mgnrega.usecases.BDOLoginCase;
import com.mgnrega.usecases.GPMLoginCase;

public class Welcome_Page {

	public static void main(String[] args) {

		System.out.println();
		System.out.println("<===================  WELCOME TO MGNREGA MANAGEMENT SYSTEM  ===================> ");
		System.out.println("	The Mahatama Gandhi National Rural Employment Guarantee Act 2005 ");
		System.out.println("	----- Ministry Of Rural Development, Government Of India ------ ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();

		System.out.println("➲ Select Option From Below ⟱");
		System.out.println("```````````````````````````");

		System.out.println("Enter 1 for login as BDO(Block Development Officer)");
		System.out.println("Enter 2 for login as GPM(Gram Panchayat Member)");
		System.out.println("Enter 3 to Exit from Application...");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		int loginOpt = sc.nextInt();

		switch (loginOpt) {
		case 1:
			BDOLoginCase.main(args);
			break;
		case 2:
			GPMLoginCase.main(args);
			break;
		case 3:
			System.out.println("Thank you for using MGNREGA management system...");
			break;
		}

	}

}
