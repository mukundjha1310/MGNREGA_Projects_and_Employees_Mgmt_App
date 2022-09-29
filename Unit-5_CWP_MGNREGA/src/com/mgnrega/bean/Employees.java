package com.mgnrega.bean;

public class Employees {
	
	private int Employee_Id;
	private String Name;
	private String Mobile;
	private int Wages;
	private int Project_Id;
	
	public Employees() {
		// TODO Auto-generated constructor stub
	}

	public Employees(int employee_Id, String name, String mobile, int wages, int project_Id) {
		super();
		Employee_Id = employee_Id;
		Name = name;
		Mobile = mobile;
		Wages = wages;
		Project_Id = project_Id;
	}

	public int getEmployee_Id() {
		return Employee_Id;
	}

	public void setEmployee_Id(int employee_Id) {
		Employee_Id = employee_Id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getMobile() {
		return Mobile;
	}

	public void setMobile(String mobile) {
		Mobile = mobile;
	}

	public int getWages() {
		return Wages;
	}

	public void setWages(int wages) {
		Wages = wages;
	}

	public int getProject_Id() {
		return Project_Id;
	}

	public void setProject_Id(int project_Id) {
		Project_Id = project_Id;
	}

	@Override
	public String toString() {
		return "Employees [Employee_Id=" + Employee_Id + ", Name=" + Name + ", Mobile=" + Mobile + ", Wages=" + Wages
				+ ", Project_Id=" + Project_Id + "]";
	}
	
	
}
