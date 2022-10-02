package com.mgnrega.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mgnrega.bean.GPM;
import com.mgnrega.bean.Projects;
import com.mgnrega.exceptions.UsersException;
import com.mgnrega.utility.DBConnection;

public class GPM_DAOImpl implements GPM_DAO {

	@Override
	public String createGPM(GPM gpm) {

		String message = "Unable to create new Gram Panchayat Member(GPM)...";

		try (Connection conn = DBConnection.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("insert into GPM(Name,Email,Mobile,Password) values(?,?,?,?)");

			ps.setString(1, gpm.getName());
			ps.setString(2, gpm.getEmail());
			ps.setString(3, gpm.getMobile());
			ps.setString(4, gpm.getPassword());

			int eu = ps.executeUpdate();

			if (eu > 0)
				message = gpm.getName() + " is registered successfully as GPM.";

		} catch (SQLException e) {
			message = e.getMessage();
		}

		return message;
	}

	@Override
	public String loginGPM(String email, String pass) throws UsersException {

		String name = null;

		try (Connection conn = DBConnection.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from GPM where email=? and password=?");

			ps.setString(1, email);
			ps.setString(2, pass);

			ResultSet rs = ps.executeQuery();

			if (rs.next())
				name = rs.getString("Name");
			else
				throw new UsersException("Invalid Email or Password..");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return name;
	}

	@Override
	public String changeGPMPass(String email, String old_pass, String new_pass) throws UsersException {

		String message = "Invalid Email or Password...!";

		try (Connection conn = DBConnection.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("update gpm set password=? where email=? and password=?");

			ps.setString(1, new_pass);
			ps.setString(2, email);
			ps.setString(3, old_pass);

			int eq = ps.executeUpdate();

			if (eq > 0)
				message = "Password updated successfully...";
			else
				throw new UsersException("Invalid Email or Password...!");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return message;
	}

}
