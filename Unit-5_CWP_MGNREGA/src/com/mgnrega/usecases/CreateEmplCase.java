package com.mgnrega.usecases;

import java.util.Scanner;
import com.mgnrega.bean.Employees;
import com.mgnrega.dao.Empl_DAO;
import com.mgnrega.dao.Empl_DAOImpl;

public class CreateEmplCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Create Employees...");
		
		System.out.println("Enter Employee Name :");
		String name = sc.next();
		System.out.println("Enter GPM Mobile :");
		String mob = sc.next();
		System.out.println("Enter Employee's Wages :");
		int wages = sc.nextInt();
		
		Empl_DAO empl_reg = new Empl_DAOImpl();
		
		Employees empl = new Employees();
		empl.setName(name);
		empl.setMobile(mob);
		empl.setWages(wages);
		
		System.out.println(empl_reg.createEmployee(empl));


	}

}
