package com.mgnrega.dao;

import com.mgnrega.bean.GPM;
import com.mgnrega.exceptions.UsersException;

public interface GPM_DAO {
	
	public String createGPM(GPM gpm);
	
	public String loginGPM(String email, String pass)throws UsersException;
	
	public String changeGPMPass(String email, String pass, String new_pass)throws UsersException;
	
}
