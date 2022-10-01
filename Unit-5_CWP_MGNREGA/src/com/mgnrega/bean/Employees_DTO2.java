package com.mgnrega.bean;

public class Employees_DTO2 {
	
	private int Employee_Id;
	private String Name;
	private String Mobile;
	private int TotalDaysWorked;
	private int TotalWages;
	private String ProjectName;
	private String ProjectStatus;
	
	public Employees_DTO2() {
		// TODO Auto-generated constructor stub
	}

	public Employees_DTO2(int employee_Id, String name, String mobile, int totalDaysWorked, int totalWages,
			String projectName, String projectStatus) {
		super();
		Employee_Id = employee_Id;
		Name = name;
		Mobile = mobile;
		TotalDaysWorked = totalDaysWorked;
		TotalWages = totalWages;
		ProjectName = projectName;
		ProjectStatus = projectStatus;
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

	public int getTotalDaysWorked() {
		return TotalDaysWorked;
	}

	public void setTotalDaysWorked(int totalDaysWorked) {
		TotalDaysWorked = totalDaysWorked;
	}

	public int getTotalWages() {
		return TotalWages;
	}

	public void setTotalWages(int totalWages) {
		TotalWages = totalWages;
	}

	public String getProjectName() {
		return ProjectName;
	}

	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}

	public String getProjectStatus() {
		return ProjectStatus;
	}

	public void setProjectStatus(String projectStatus) {
		ProjectStatus = projectStatus;
	}

	@Override
	public String toString() {
		return "Employees_DTO2 [Employee_Id=" + Employee_Id + ", Name=" + Name + ", Mobile=" + Mobile
				+ ", TotalDaysWorked=" + TotalDaysWorked + ", TotalWages=" + TotalWages + ", ProjectName=" + ProjectName
				+ ", ProjectStatus=" + ProjectStatus + "]";
	}

	
	
	
}
