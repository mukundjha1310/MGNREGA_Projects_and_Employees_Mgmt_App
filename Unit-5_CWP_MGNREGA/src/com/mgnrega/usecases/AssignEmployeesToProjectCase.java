package com.mgnrega.usecases;

import java.util.Scanner;
import com.mgnrega.dao.Empl_DAO;
import com.mgnrega.dao.Empl_DAOImpl;
import com.mgnrega.exceptions.UsersException;

public class AssignEmployeesToProjectCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Employee Allocation to Project...");
		
		System.out.println("Enter Employee Id :");
		int EmplId = sc.nextInt();
		
		System.out.println("Enter Project Id :");
		int projId = sc.nextInt();
		
		Empl_DAO emplAllocate = new Empl_DAOImpl();
		
		try {
			System.out.println(emplAllocate.assignEmployeesToProject(projId, EmplId));
		} catch (UsersException e) {
			System.out.println(e.getMessage());
		}

	}

}
