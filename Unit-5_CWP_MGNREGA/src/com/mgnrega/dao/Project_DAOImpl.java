package com.mgnrega.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.mgnrega.bean.Projects;
import com.mgnrega.exceptions.UsersException;
import com.mgnrega.utility.DBConnection;

public class Project_DAOImpl implements Project_DAO {

	@Override
	public String createProject(Projects project) {
		
		String message = "Unable to create project...";

		try (Connection conn = DBConnection.provideConnection()) {

			PreparedStatement ps = conn
					.prepareStatement("insert into projects(Name,Start_date,End_date,Status) values(?,?,?,?)");
			
			ps.setString(1, project.getName());
			ps.setString(2, project.getStart_Date());
			ps.setString(3, project.getEnd_Date());
			ps.setString(4, project.getStatus());

			int eu = ps.executeUpdate();

			if (eu > 0)
				message = project.getName() + " project Created Successfully...";

		} catch (SQLException e) {
			message = e.getMessage();
		}

		return message;
	}

	@Override
	public List<Projects> viewAllProjects() throws UsersException {

		List<Projects> projectList = new ArrayList<>();

		try (Connection conn = DBConnection.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from projects");

			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				projectList.add(new Projects(rs.getInt("PROJECT_ID"), rs.getString("NAME"), rs.getString("START_DATE"), 
						rs.getString("END_DATE"), rs.getString("STATUS")));
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return projectList;
	}

}
