package com.mgnrega.usecases;

import java.util.Scanner;
import com.mgnrega.bean.GPM;
import com.mgnrega.dao.GPM_DAO;
import com.mgnrega.dao.GPM_DAOImpl;
import com.mgnrega.main.BDO_Main;

public class CreateGPMCase {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("<======  Create Gram Panchayat Members(GPM)...  =======>");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter GPM Name :");
		String name = sc.next();
		System.out.println("Enter GPM Email :");
		String email = sc.next();
		System.out.println("Enter GPM Mobile :");
		String mob = sc.next();
		System.out.println("Enter GPM Password :");
		String pass = sc.next();

		GPM_DAO gpm_reg = new GPM_DAOImpl();

		GPM gpm = new GPM();
		gpm.setName(name);
		gpm.setEmail(email);
		gpm.setMobile(mob);
		gpm.setPassword(pass);

		System.out.println(gpm_reg.createGPM(gpm));

		System.out.println();
		System.out.println("Enter 1 to add more GPM...");
		System.out.println("Enter 2 to go to main page...");
		System.out.println("Enter 3 to Exit from Application...");
		System.out.println();

		int option = sc.nextInt();

		switch (option) {
		case 1:
			CreateGPMCase.main(args);
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
