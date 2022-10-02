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

			while (rs.next()) {
				projectList.add(new Projects(rs.getInt("PROJECT_ID"), rs.getString("NAME"), rs.getString("START_DATE"),
						rs.getString("END_DATE"), rs.getString("STATUS")));
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return projectList;
	}

	@Override
	public String allocateProjectToGPM(int projectId, int GPMId) throws UsersException {

		String message = "Not Allocated...!";
		String proj_name = "";
		String gpm_name = "";

		try (Connection conn = DBConnection.provideConnection()) {

			PreparedStatement ps1 = conn.prepareStatement("select name from GPM where GPM_ID=?");

			ps1.setInt(1, GPMId);

			ResultSet rs1 = ps1.executeQuery();

			if (rs1.next()) {
				gpm_name = rs1.getString("NAME");

				PreparedStatement ps2 = conn.prepareStatement("select name from projects where PROJECT_ID=?");
				ps2.setInt(1, projectId);

				ResultSet rs2 = ps2.executeQuery();

				if (rs2.next()) {
					proj_name = rs2.getString("NAME");

					PreparedStatement ps3 = conn.prepareStatement("insert into GPM_PROJECT values(?,?)");
					ps3.setInt(1, GPMId);
					ps3.setInt(2, projectId);

					int eu = ps3.executeUpdate();

					if (eu > 0)
						message = proj_name + " Project allocated to " + gpm_name + " GPM Successfully...";
					else
						throw new UsersException("Something went wrong...!");
				} else
					throw new UsersException("Invalid Project Id...!");
			} else
				throw new UsersException("Invalid GPM Id...!");

		} catch (SQLException e) {
			message = e.getMessage();
		}

		return message;
	}

	@Override
	public String removeGPMfromProject(int projectId, int GPMId) throws UsersException {

		String message = "Not Removed...!";
		String proj_name = "";
		String gpm_name = "";

		try (Connection conn = DBConnection.provideConnection()) {

			PreparedStatement ps1 = conn.prepareStatement("select name from GPM where GPM_ID=?");

			ps1.setInt(1, GPMId);

			ResultSet rs1 = ps1.executeQuery();

			if (rs1.next()) {
				gpm_name = rs1.getString("NAME");

				PreparedStatement ps2 = conn.prepareStatement("select name from projects where PROJECT_ID=?");
				ps2.setInt(1, projectId);

				ResultSet rs2 = ps2.executeQuery();

				if (rs2.next()) {
					proj_name = rs2.getString("NAME");

					PreparedStatement ps3 = conn
							.prepareStatement("DELETE from GPM_PROJECT where GPM_ID=? and PROJECT_ID=?");
					ps3.setInt(1, GPMId);
					ps3.setInt(2, projectId);

					int eu = ps3.executeUpdate();

					if (eu > 0)
						message = gpm_name + " GPM is successfully removed from " + proj_name + " Project...";
					else
						throw new UsersException("Something went wrong...!");
				} else
					throw new UsersException("Invalid Project Id...!");
			} else
				throw new UsersException("Invalid GPM Id...!");

		} catch (SQLException e) {
			message = e.getMessage();
		}

		return message;
	}

	@Override
	public String updateProjectStatus(int proj_id, String new_status) throws UsersException {

		String message = "Invalid Project_Id...!";
		String proj_name = "";
		String old_status = "";

		try (Connection conn = DBConnection.provideConnection()) {

			PreparedStatement ps1 = conn.prepareStatement("select name, status from projects where project_id=?");
			ps1.setInt(1, proj_id);

			ResultSet rs1 = ps1.executeQuery();

			if (rs1.next()) {
				proj_name = rs1.getString("name");
				old_status = rs1.getString("status");
			}

			PreparedStatement ps = conn.prepareStatement("update projects set status=? where project_id=?");

			ps.setString(1, new_status);
			ps.setInt(2, proj_id);

			int eq = ps.executeUpdate();

			if (eq > 0)
				message = proj_name+" Project status updated successfully from "+old_status+" to "+new_status+"...";
			else
				throw new UsersException("Invalid Project_Id...!");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return message;
	}

}
