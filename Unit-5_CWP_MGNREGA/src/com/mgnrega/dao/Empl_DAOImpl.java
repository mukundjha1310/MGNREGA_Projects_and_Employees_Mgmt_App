package com.mgnrega.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mgnrega.bean.Employees;
import com.mgnrega.bean.GPM;
import com.mgnrega.exceptions.UsersException;
import com.mgnrega.utility.DBConnection;

public class Empl_DAOImpl implements Empl_DAO{

	@Override
	public String createEmployee(Employees empl) {
		
		String message = "Unable to create new Employee...";

		try (Connection conn = DBConnection.provideConnection()) {

			PreparedStatement ps = conn
					.prepareStatement("insert into Employees(Name,Mobile,Wages) values(?,?,?)");
			
			ps.setString(1, empl.getName());
			ps.setString(2, empl.getMobile());
			ps.setInt(3, empl.getWages());

			int eu = ps.executeUpdate();

			if (eu > 0)
				message = empl.getName() + " is registered successfully as Employee.";

		} catch (SQLException e) {
			message = e.getMessage();
		}

		return message;
	}

	@Override
	public List<Employees> viewAllEmployees() throws UsersException {

		List<Employees> emplList = new ArrayList<>();

		try (Connection conn = DBConnection.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from Employees");

			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				emplList.add(new Employees(rs.getInt("Employee_ID"), rs.getString("NAME"), 
						rs.getString("MOBILE"), rs.getInt("WAGES")));
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return emplList;
	}

}
