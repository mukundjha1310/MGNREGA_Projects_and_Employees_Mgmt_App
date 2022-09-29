package com.mgnrega.bean;

public class GPM_DTO {
	
	private String GPM_Name;
	private String Email;
	private String Mobile;
	private String Project_Name;
	private String Start_Date;
	private String End_Date;
	private String Status;
	
	public GPM_DTO() {
		// TODO Auto-generated constructor stub
	}
	
	public GPM_DTO(String gPM_Name, String email, String mobile, String project_Name, String start_Date,
			String end_Date, String status) {
		super();
		GPM_Name = gPM_Name;
		Email = email;
		Mobile = mobile;
		Project_Name = project_Name;
		Start_Date = start_Date;
		End_Date = end_Date;
		Status = status;
	}

	public String getGPM_Name() {
		return GPM_Name;
	}

	public void setGPM_Name(String gPM_Name) {
		GPM_Name = gPM_Name;
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

	public String getProject_Name() {
		return Project_Name;
	}

	public void setProject_Name(String project_Name) {
		Project_Name = project_Name;
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
		return "GPM_DTO [GPM_Name=" + GPM_Name + ", Email=" + Email + ", Mobile=" + Mobile + ", Project_Name="
				+ Project_Name + ", Start_Date=" + Start_Date + ", End_Date=" + End_Date + ", Status=" + Status + "]";
	}
	
	
	
}
