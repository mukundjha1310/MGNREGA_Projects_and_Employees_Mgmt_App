package com.mgnrega.bean;

public class Employees_DTO {
	
	private String Emp_Name;
	private String Mobile;
	private int Wages;
	private String Proj_Name;
	private String Start_Date;
	private String End_Date;
	private String Proj_Status;
	
	public Employees_DTO() {
		// TODO Auto-generated constructor stub
	}

	public Employees_DTO(String emp_Name, String mobile, int wages, String proj_Name, String start_Date, String end_Date,
			String proj_Status) {
		super();
		Emp_Name = emp_Name;
		Mobile = mobile;
		Wages = wages;
		Proj_Name = proj_Name;
		Start_Date = start_Date;
		End_Date = end_Date;
		Proj_Status = proj_Status;
	}

	public String getEmp_Name() {
		return Emp_Name;
	}

	public void setEmp_Name(String emp_Name) {
		Emp_Name = emp_Name;
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

	public String getProj_Name() {
		return Proj_Name;
	}

	public void setProj_Name(String proj_Name) {
		Proj_Name = proj_Name;
	}

	public String getStart_Date() {
		return Start_Date;
	}

	public void setStart_Date(String start_Date) {
		Start_Date = start_Date;
	}

	public String getEnd_Date() {
		return End_Date;
	}

	public void setEnd_Date(String end_Date) {
		End_Date = end_Date;
	}

	public String getProj_Status() {
		return Proj_Status;
	}

	public void setProj_Status(String proj_Status) {
		Proj_Status = proj_Status;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [Emp_Name=" + Emp_Name + ", Mobile=" + Mobile + ", Wages=" + Wages + ", Proj_Name="
				+ Proj_Name + ", Start_Date=" + Start_Date + ", End_Date=" + End_Date + ", Proj_Status=" + Proj_Status
				+ "]";
	}
	
	
}
