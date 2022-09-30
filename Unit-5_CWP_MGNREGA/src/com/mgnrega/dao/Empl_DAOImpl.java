package com.mgnrega.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mgnrega.bean.Employees;
import com.mgnrega.bean.Employees_DTO;
import com.mgnrega.bean.GPM;
import com.mgnrega.exceptions.UsersException;
import com.mgnrega.utility.DBConnection;

public class Empl_DAOImpl implements Empl_DAO{

	@Override
	public String createEmployee(Employees empl){
		
		String message = "Unable to create new Employee...";

		try (Connection conn = DBConnection.provideConnection()) {

			PreparedStatement ps = conn
					.prepareStatement("insert into Employees(Name,Mobile,Wages) values(?,?,?)");
			
			ps.setString(1, empl.getName());
			ps.setString(2, empl.getMobile());
			ps.setInt(3, empl.getWages());

			int eu = ps.executeUpdate();

			if (eu > 0) message = empl.getName() + " is registered successfully as Employee.";
				
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

	@Override
	public String assignEmployeesToProject(int projectId, int EmployeeId) throws UsersException {

		String message = "Not Allocated...!";
		String proj_name = "";
		String empl_name = "";
		
		try (Connection conn = DBConnection.provideConnection()) {

			PreparedStatement ps1 = conn.prepareStatement("select name from Employees where EMPLOYEE_ID=?");
			
			ps1.setInt(1, EmployeeId);
			
			ResultSet rs1 = ps1.executeQuery();
			
			if(rs1.next()) 
			{
				empl_name = rs1.getString("NAME");
				
				PreparedStatement ps2 = conn.prepareStatement("select name from projects where PROJECT_ID=?");
				ps2.setInt(1, projectId);
				
				ResultSet rs2 = ps2.executeQuery();
				
				if(rs2.next()) 
				{
					proj_name = rs2.getString("NAME");
					
					PreparedStatement ps3 = conn.prepareStatement("insert into PROJECT_EMPLOYEE values(?,?)");
					ps3.setInt(1, projectId);
					ps3.setInt(2, EmployeeId);
					
					int eu = ps3.executeUpdate();

					if (eu > 0) message = empl_name+" Employee assigned to "+proj_name+" Project Successfully...";
					else throw new UsersException("Something went wrong...!");
				}
				else
					throw new UsersException("Invalid Project Id...!");
			}
			else
				throw new UsersException("Invalid Employee Id...!");
			
		} catch (SQLException e) {
			message = e.getMessage();
		}
		
		return message;
	}

	@Override
	public List<Employees_DTO> viewEmployeesByProject(int projectId) throws UsersException {
		
		List<Employees_DTO> emplListByProj = new ArrayList<>();

		try (Connection conn = DBConnection.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select e.name Ename, e.mobile, e.wages, "
					+ "p.name Pname, p.start_date, p.end_date, p.status from employees e inner join projects p "
					+ "inner join project_employee pe on pe.project_id = p.project_id and pe.employee_id = e.employee_id "
					+ "and p.project_id=?");
			
			ps.setInt(1, projectId);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				
				emplListByProj.add(new Employees_DTO(rs.getString("Ename"), rs.getString("mobile"), rs.getInt("wages"),
						rs.getString("Pname"), rs.getString("start_date"), rs.getString("end_date"), rs.getString("status")));
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return emplListByProj;
	}

}
