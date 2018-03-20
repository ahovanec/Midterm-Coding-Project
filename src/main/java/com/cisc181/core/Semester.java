package com.cisc181.core;

import java.util.UUID;
import java.util.Date;
public class Semester {
	private UUID SemesterID;
	private Date StartDate; 
	private Date EndDate;
	public Semester(UUID semesterID, Date startDate, Date endDate) {
		super();
		SemesterID = semesterID;
		StartDate = startDate;
		EndDate = endDate;
	}
	public UUID getSemesterID() {
		return SemesterID;
	}
	private void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}
	public Date getStartDate() {
		return StartDate;
	}
	private void setStartDate(Date startDate) {
		StartDate = startDate;
	}
	public Date getEndDate() {
		return EndDate;
	}
	private void setEndDate(Date endDate) {
		EndDate = endDate;
	}
	
}
