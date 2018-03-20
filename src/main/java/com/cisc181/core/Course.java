package com.cisc181.core;

import java.util.UUID;
import com.cisc181.eNums.eMajor;
public class Course{
	private UUID CourseID;
	private int GradePoints;
	private String CourseName;
	private eMajor eMajor;
	
	
	public Course(UUID courseID, int gradePoints, String courseName, eMajor eMajor) {
		super();
		CourseID = courseID;
		GradePoints = gradePoints;
		CourseName = courseName;
		this.eMajor = eMajor;
	}
	public UUID getCourseID(){
		return CourseID;
	}
	private void setCourseID(UUID courseID) {
		CourseID = courseID;
	}
	public int getGradePoints() {
		return GradePoints;
	}
	private void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}
	public String getCourseName() {
		return CourseName;
	}
	private void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public eMajor geteMajor ( )
    {
        return this.eMajor;
    }
    public void setMajor (eMajor Major)
    {
        this.eMajor = eMajor;    
    }
	
}
