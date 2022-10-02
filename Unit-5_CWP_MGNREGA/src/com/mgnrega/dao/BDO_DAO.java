package com.mgnrega.dao;

import java.util.List;

import com.mgnrega.bean.GPM;
import com.mgnrega.exceptions.UsersException;

public interface BDO_DAO {
	
	public String loginBDO(String email, String pass)throws UsersException;
	
	public List<GPM> viewAllGPM()throws UsersException;
	
	
}
