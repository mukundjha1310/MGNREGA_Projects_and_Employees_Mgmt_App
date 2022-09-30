package com.mgnrega.usecases;

import java.util.Scanner;

import com.mgnrega.bean.Projects;
import com.mgnrega.dao.Project_DAO;
import com.mgnrega.dao.Project_DAOImpl;

public class CreateProjectCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Create Project...");
		
		System.out.println("Enter Project Name :");
		String name = sc.next();
		System.out.println("Enter Project Start_Date (yyyy-mm--dd) :");
		String s_date = sc.next();
		System.out.println("Enter Project End_Date (yyyy-mm--dd) :");
		String e_date = sc.next();
		System.out.println("Enter Project Status (Not_Started/WIP/Completed) :");
		String status = sc.next();
		
		Project_DAO proj_reg = new Project_DAOImpl();
		
		Projects project = new Projects();
		project.setName(name);
		project.setStart_Date(s_date);
		project.setEnd_Date(e_date);
		project.setStatus(status);
		
		System.out.println(proj_reg.createProject(project));
		
	}

}
