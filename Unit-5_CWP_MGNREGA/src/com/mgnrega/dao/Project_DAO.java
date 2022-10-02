package com.mgnrega.dao;

import java.util.List;

import com.mgnrega.bean.Projects;
import com.mgnrega.exceptions.UsersException;

public interface Project_DAO {
	
	public String createProject(Projects project);
	
	public List<Projects> viewAllProjects() throws UsersException;
	
	public String allocateProjectToGPM(int projectId, int GPMId) throws UsersException;
	
	public String removeGPMfromProject(int projectId, int GPMId) throws UsersException;
	
	public String updateProjectStatus(int proj_id, String new_status)throws UsersException;
}
