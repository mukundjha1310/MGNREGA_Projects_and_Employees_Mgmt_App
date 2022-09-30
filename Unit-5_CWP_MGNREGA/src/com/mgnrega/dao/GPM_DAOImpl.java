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

public class GPM_DAOImpl implements GPM_DAO{
	
	@Override
	public String createGPM(GPM gpm) {
		
		String message = "Unable to create new Gram Panchayat Member(GPM)...";

		try (Connection conn = DBConnection.provideConnection()) {

			PreparedStatement ps = conn
					.prepareStatement("insert into GPM(Name,Email,Mobile,Password) values(?,?,?,?)");
			
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
	public List<GPM> viewAllGPM() throws UsersException {
		
		List<GPM> gpmList = new ArrayList<>();

		try (Connection conn = DBConnection.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from GPM");

			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				gpmList.add(new GPM(rs.getInt("GPM_ID"), rs.getString("NAME"), rs.getString("EMAIL"), 
						rs.getString("MOBILE"), rs.getString("PASSWORD")));
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return gpmList;
	}
	
	@Override
	public String loginGPM(String email, String pass) throws UsersException {
		
		String name = null;

		try (Connection conn = DBConnection.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from GPM where email=? and password=?");
			
			ps.setString(1, email);
			ps.setString(2, pass);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) name = rs.getString("Name");
			else throw new UsersException("Invalid Email or Password..");
			
		} catch (SQLException e) {
			throw new UsersException(e.getMessage());
		}
		return name;
	}

	

	

}
