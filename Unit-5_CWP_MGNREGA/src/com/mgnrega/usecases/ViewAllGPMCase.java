package com.mgnrega.usecases;

import java.util.List;

import com.mgnrega.bean.GPM;
import com.mgnrega.dao.GPM_DAO;
import com.mgnrega.dao.GPM_DAOImpl;
import com.mgnrega.exceptions.UsersException;

public class ViewAllGPMCase {

	public static void main(String[] args) {

		GPM_DAO gpms = new GPM_DAOImpl();
		
		try {
			
			List<GPM> gpmList = gpms.viewAllGPM();
			
			if(gpmList.isEmpty()) System.out.println("No GPMs found...!");
			else gpmList.forEach(g -> System.out.println(g));
			
		} catch (UsersException e) {
			System.out.println(e.getMessage());
		}

	}

}
