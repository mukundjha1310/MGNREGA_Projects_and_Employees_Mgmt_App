package com.mgnrega.bean;

public class Projects {
	
	private int Project_Id;
	private String Name;
	private String Start_Date;
	private String End_Date;
	private String Status;
	
	public Projects() {
		// TODO Auto-generated constructor stub
	}

	public Projects(int project_Id, String name, String start_Date, String end_Date, String status) {
		super();
		Project_Id = project_Id;
		Name = name;
		Start_Date = start_Date;
		End_Date = end_Date;
		Status = status;
	}

	public int getProject_Id() {
		return Project_Id;
	}

	public void setProject_Id(int project_Id) {
		Project_Id = project_Id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
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

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}


	@Override
	public String toString() {
		return "Projects [Project_Id=" + Project_Id + ", Name=" + Name + ", Start_Date=" + Start_Date + ", End_Date="
				+ End_Date + ", Status=" + Status + "]";
	}
	
	
}
