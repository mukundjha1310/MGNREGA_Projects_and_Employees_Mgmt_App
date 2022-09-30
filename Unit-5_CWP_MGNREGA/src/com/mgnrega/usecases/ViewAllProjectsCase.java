package com.mgnrega.usecases;

import java.util.List;

import com.mgnrega.bean.Projects;
import com.mgnrega.dao.Project_DAO;
import com.mgnrega.dao.Project_DAOImpl;
import com.mgnrega.exceptions.UsersException;

public class ViewAllProjectsCase {

	public static void main(String[] args) {
		
		Project_DAO projects = new Project_DAOImpl();
		
		try {
			List<Projects> projectList = projects.viewAllProjects();
			
			if(projectList.isEmpty()) System.out.println("No Projects found...!");
			else projectList.forEach(p -> System.out.println(p));
			
		} catch (UsersException e) {
			System.out.println(e.getMessage());
		}

	}

}
