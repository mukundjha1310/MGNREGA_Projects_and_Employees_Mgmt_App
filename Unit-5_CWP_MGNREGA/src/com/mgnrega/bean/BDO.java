package com.mgnrega.bean;

public class BDO {
	
	private int BDO_Id;
	private String Name;
	private String Email;
	private String Mobile;
	private String Password;
	private String State;
	private String District;
	private String Block;
	
	public BDO() {
		// TODO Auto-generated constructor stub
	}
	
	public BDO(int bDO_Id, String name, String email, String mobile, String password, String state, String district,
			String block) {
		super();
		BDO_Id = bDO_Id;
		Name = name;
		Email = email;
		Mobile = mobile;
		Password = password;
		State = state;
		District = district;
		Block = block;
	}

	public int getBDO_Id() {
		return BDO_Id;
	}

	public void setBDO_Id(int bDO_Id) {
		BDO_Id = bDO_Id;
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

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getDistrict() {
		return District;
	}

	public void setDistrict(String district) {
		District = district;
	}

	public String getBlock() {
		return Block;
	}

	public void setBlock(String block) {
		Block = block;
	}

	@Override
	public String toString() {
		return "BDO [BDO_Id=" + BDO_Id + ", Name=" + Name + ", Email=" + Email + ", Mobile=" + Mobile + ", Password="
				+ Password + ", State=" + State + ", District=" + District + ", Block=" + Block + "]";
	}
	
	
}
