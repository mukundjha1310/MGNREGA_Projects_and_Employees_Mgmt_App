package com.mgnrega.usecases;

import java.util.List;
import java.util.Scanner;

import com.mgnrega.bean.GPM;
import com.mgnrega.dao.BDO_DAO;
import com.mgnrega.dao.BDO_DAOImpl;
import com.mgnrega.exceptions.UsersException;
import com.mgnrega.main.BDO_Main;

public class ViewAllGPMCase {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("<=======  List Of All GPMs...  =======>");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		BDO_DAO gpms = new BDO_DAOImpl();
		
		try {
			
			List<GPM> gpmList = gpms.viewAllGPM();
			
			if(gpmList.isEmpty()) System.out.println("No GPMs found...!");
			else gpmList.forEach(g -> {
				System.out.println("GPM_Id :   " + g.getGPM_Id());
				System.out.println("Name :     " + g.getName());
				System.out.println("Email :    " + g.getEmail());
				System.out.println("Mobile :   " + g.getMobile());
				System.out.println("Password : " + g.getPassword());
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
