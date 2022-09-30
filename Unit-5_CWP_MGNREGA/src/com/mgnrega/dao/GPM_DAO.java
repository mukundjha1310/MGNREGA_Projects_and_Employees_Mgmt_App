package com.mgnrega.dao;

import java.util.List;

import com.mgnrega.bean.GPM;
import com.mgnrega.exceptions.UsersException;

public interface GPM_DAO {
	
	public String createGPM(GPM gpm);
	
	public List<GPM> viewAllGPM()throws UsersException;
	
	public String loginGPM(String email, String pass)throws UsersException;
	
}
