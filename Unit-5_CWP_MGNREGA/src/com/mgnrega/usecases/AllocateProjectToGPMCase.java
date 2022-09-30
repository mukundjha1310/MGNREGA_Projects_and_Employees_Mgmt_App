package com.mgnrega.usecases;

import java.util.Scanner;
import com.mgnrega.dao.Project_DAO;
import com.mgnrega.dao.Project_DAOImpl;
import com.mgnrega.exceptions.UsersException;

public class AllocateProjectToGPMCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Project Allocation to GPM...");
		
		System.out.println("Enter GPM Id :");
		int GPMId = sc.nextInt();
		
		System.out.println("Enter Project Id :");
		int pId = sc.nextInt();
		
		Project_DAO projAllocate = new Project_DAOImpl();
		
		try {
			System.out.println(projAllocate.allocateProjectToGPM(pId, GPMId));
		} catch (UsersException e) {
			System.out.println(e.getMessage());
		}
	}

}
