package com.mgnrega.usecases;

import java.util.List;
import com.mgnrega.bean.Employees;
import com.mgnrega.dao.Empl_DAO;
import com.mgnrega.dao.Empl_DAOImpl;
import com.mgnrega.exceptions.UsersException;

public class ViewAllEmplCase {

	public static void main(String[] args) {

		Empl_DAO empls = new Empl_DAOImpl();

		try {

			List<Employees> emplList = empls.viewAllEmployees();
			
			if(emplList.isEmpty()) System.out.println("No Employees found...!");
			else emplList.forEach(e -> System.out.println(e));

		} catch (UsersException e) {
			System.out.println(e.getMessage());
		}

	}

}
