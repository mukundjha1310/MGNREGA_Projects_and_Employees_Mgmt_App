package com.mgnrega.bean;

public class GPM {
	
	private int GPM_Id;
	private String Name;
	private String Email;
	private String Mobile;
	private String Password;
	private int BDO_Id;
	
	public GPM() {
		// TODO Auto-generated constructor stub
	}
	
	public GPM(int gPM_Id, String name, String email, String mobile, String password, int bDO_Id) {
		super();
		GPM_Id = gPM_Id;
		Name = name;
		Email = email;
		Mobile = mobile;
		Password = password;
		BDO_Id = bDO_Id;
	}

	public int getGPM_Id() {
		return GPM_Id;
	}

	public void setGPM_Id(int gPM_Id) {
		GPM_Id = gPM_Id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getMobile() {
		return Mobile;
	}

	public void setMobile(String mobile) {
		Mobile = mobile;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public int getBDO_Id() {
		return BDO_Id;
	}

	public void setBDO_Id(int bDO_Id) {
		BDO_Id = bDO_Id;
	}

	@Override
	public String toString() {
		return "GPM [GPM_Id=" + GPM_Id + ", Name=" + Name + ", Email=" + Email + ", Mobile=" + Mobile + ", Password="
				+ Password + ", BDO_Id=" + BDO_Id + "]";
	}
	
	
}
