package com.mgnrega.dao;

import com.mgnrega.exceptions.UsersException;

public interface BDO_DAO {
	
	public String loginBDO(String email, String pass)throws UsersException;
}
