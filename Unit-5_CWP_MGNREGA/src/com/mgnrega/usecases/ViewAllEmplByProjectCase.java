package com.mgnrega.usecases;

import java.util.List;
import java.util.Scanner;
import com.mgnrega.bean.Employees_DTO;
import com.mgnrega.dao.Empl_DAO;
import com.mgnrega.dao.Empl_DAOImpl;
import com.mgnrega.exceptions.UsersException;

public class ViewAllEmplByProjectCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("View list of employees by Project Id...");
		System.out.println("Enter Project Id :");
		int proj_Id = sc.nextInt();
		
		Empl_DAO empls = new Empl_DAOImpl();

		try {

			List<Employees_DTO> emplList = empls.viewEmployeesByProject(proj_Id);
			
			if(emplList.isEmpty()) System.out.println("No Employees found...!");
			else emplList.forEach(e -> System.out.println(e));

		} catch (UsersException e) {
			System.out.println(e.getMessage());
		}

	}

}
