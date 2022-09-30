package com.mgnrega.usecases;

import java.util.Scanner;
import com.mgnrega.bean.GPM;
import com.mgnrega.dao.GPM_DAO;
import com.mgnrega.dao.GPM_DAOImpl;

public class CreateGPMCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Create GPM...");
		
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

	}

}
