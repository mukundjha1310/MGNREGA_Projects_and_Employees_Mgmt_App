package com.mgnrega.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mgnrega.exceptions.UsersException;
import com.mgnrega.utility.DBConnection;

public class BDO_DAOImpl implements BDO_DAO{

	@Override
	public String loginBDO(String email, String pass) throws UsersException {
		String name = null;

		try (Connection conn = DBConnection.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from BDO where email=? and password=?");
			
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
