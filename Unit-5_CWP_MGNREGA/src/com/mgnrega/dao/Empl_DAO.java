package com.mgnrega.dao;

import java.util.List;
import com.mgnrega.bean.Employees;
import com.mgnrega.exceptions.UsersException;

public interface Empl_DAO {
	
	public String createEmployee(Employees empl);
	
	public List<Employees> viewAllEmployees()throws UsersException;
}
