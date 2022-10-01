package com.mgnrega.dao;

import java.util.List;
import com.mgnrega.bean.Employees;
import com.mgnrega.bean.Employees_DTO;
import com.mgnrega.bean.Employees_DTO2;
import com.mgnrega.exceptions.UsersException;

public interface Empl_DAO {
	
	public String createEmployee(Employees empl);
	
	public List<Employees> viewAllEmployees()throws UsersException;
	
	public String assignEmployeesToProject(int projectId, int EmployeeId) throws UsersException;
	
	public List<Employees_DTO> viewEmployeesByProject(int projectId)throws UsersException;
	
	public List<Employees_DTO2> viewAllEmployeesWorkDetails()throws UsersException;
}
