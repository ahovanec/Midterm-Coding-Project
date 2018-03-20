package com.cisc181.core;

import static org.junit.Assert.*;
import java.lang.Math;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
import com.cisc181.eNums.eTitle;

public class Student_Test {
/*Add three Course records, add them to an ArrayList of Course
Add two Semesters, one for Fall, one for Spring.  Add them to an ArrayList of Semester
Add two Sections for each Course & Semester (total of six Sections).  Add them to an ArrayList of Section
Create ten Student records, add them to an ArrayList of Student.

Test Cases

Enroll the ten students you created in each of the Sections you created.  Grade each student (pick your own grade values).

Determine each student’s GPA, test it with an assertEquals.
Determine each course’s average grade, test it with an assertEqual.
*/
	
	static ArrayList<Course> CourseList= new ArrayList<Course>();
	static ArrayList<Semester> semesterList= new ArrayList<Semester>();
	static ArrayList<Section> sectionList= new ArrayList<Section>();
	static ArrayList<Student> studentList= new ArrayList<Student>();
	static ArrayList<Enrollment> enrollmentList= new ArrayList<Enrollment>();
	@BeforeClass
	public static void setup() throws PersonException {

		try {
		Course cA= new Course(UUID.randomUUID(), 3, "Science", eMajor.CHEM);
		Course cB= new Course(UUID.randomUUID(), 3, "English", eMajor.NURSING);
		Course cC= new Course(UUID.randomUUID(), 3, "Math", eMajor.BUSINESS);

						
		CourseList.add(cA);
		CourseList.add(cB);
		CourseList.add(cC);
		
		Semester fall = new Semester(UUID.randomUUID(), new Date(2017, 8, 29), new Date(2017, 12, 19));
		Semester spring = new Semester(UUID.randomUUID(), new Date(2018, 2, 1), new Date(2018, 5, 20));
		
		semesterList.add(fall);
		semesterList.add(spring);
		
		Section s1 = new Section(cA.getCourseID(), fall.getSemesterID(), UUID.randomUUID(), 1);
		Section s2 = new Section(cA.getCourseID(), fall.getSemesterID(), UUID.randomUUID(), 2);
		Section s3 = new Section(cB.getCourseID(), fall.getSemesterID(), UUID.randomUUID(), 3);
		Section s4 = new Section(cB.getCourseID(), spring.getSemesterID(), UUID.randomUUID(), 4);
		Section s5 = new Section(cC.getCourseID(), spring.getSemesterID(), UUID.randomUUID(), 5);
		Section s6 = new Section(cC.getCourseID(), spring.getSemesterID(), UUID.randomUUID(), 6);
		
		sectionList.add(s1);
		sectionList.add(s2);
		sectionList.add(s3);
		sectionList.add(s4);
		sectionList.add(s5);
		sectionList.add(s6);
		
		Student A= new Student("Anton", "Derek", "Hovanec", new Date(1999,3,25), eMajor.COMPSI,  "101 Panorama Drive Newark Delaware 19711", "302-740-1320", "ahovanec@udel.edu");
		Student B= new Student("Anton", "Derek", "Hovanec", new Date(1999,3,25), eMajor.COMPSI,  "101 Panorama Drive Newark Delaware 19711", "302-740-1320", "ahovanec@udel.edu");
		Student C= new Student("Anton", "Derek", "Hovanec", new Date(1999,3,25), eMajor.COMPSI,  "101 Panorama Drive Newark Delaware 19711", "302-740-1320", "ahovanec@udel.edu");
		Student D= new Student("Anton", "Derek", "Hovanec", new Date(1999,3,25), eMajor.COMPSI,  "101 Panorama Drive Newark Delaware 19711", "302-740-1320", "ahovanec@udel.edu");
		Student E= new Student("Anton", "Derek", "Hovanec", new Date(1999,3,25), eMajor.COMPSI,  "101 Panorama Drive Newark Delaware 19711", "302-740-1320", "ahovanec@udel.edu");
		Student F= new Student("Anton", "Derek", "Hovanec", new Date(1999,3,25), eMajor.COMPSI,  "101 Panorama Drive Newark Delaware 19711", "302-740-1320", "ahovanec@udel.edu");
		Student G= new Student("Anton", "Derek", "Hovanec", new Date(1999,3,25), eMajor.COMPSI,  "101 Panorama Drive Newark Delaware 19711", "302-740-1320", "ahovanec@udel.edu");
		Student H= new Student("Anton", "Derek", "Hovanec", new Date(1999,3,25), eMajor.COMPSI,  "101 Panorama Drive Newark Delaware 19711", "302-740-1320", "ahovanec@udel.edu");
		Student I= new Student("Anton", "Derek", "Hovanec", new Date(1999,3,25), eMajor.COMPSI,  "101 Panorama Drive Newark Delaware 19711", "302-740-1320", "ahovanec@udel.edu");
		Student J= new Student("Anton", "Derek", "Hovanec", new Date(1999,3,25), eMajor.COMPSI,  "101 Panorama Drive Newark Delaware 19711", "302-740-1320", "ahovanec@udel.edu");
		
		studentList.add(A);
		studentList.add(B);
		studentList.add(C);
		studentList.add(D);
		studentList.add(E);
		studentList.add(F);
		studentList.add(G);
		studentList.add(H);
		studentList.add(I);
		studentList.add(J);
		Enrollment enrollingAs1 = new Enrollment(s1.getSectionID(), A.getStudentID());
		enrollingAs1.setGrade(100);
		Enrollment enrollingAs2 = new Enrollment(s2.getSectionID(), A.getStudentID());
		enrollingAs2.setGrade(100);
		Enrollment enrollingAs3 = new Enrollment(s3.getSectionID(), A.getStudentID());
		enrollingAs3.setGrade(100);
		Enrollment enrollingAs4 = new Enrollment(s1.getSectionID(), A.getStudentID());
		enrollingAs4.setGrade(100);
		Enrollment enrollingAs5 = new Enrollment(s1.getSectionID(), A.getStudentID());
		enrollingAs5.setGrade(100);
		Enrollment enrollingAs6 = new Enrollment(s1.getSectionID(), A.getStudentID());
		enrollingAs6.setGrade(100);
		
		

		Enrollment enrollingBs1 = new Enrollment(s1.getSectionID(), B.getStudentID());
		enrollingBs1.setGrade(90);
		Enrollment enrollingBs2 = new Enrollment(s2.getSectionID(), B.getStudentID());
		enrollingBs2.setGrade(90);
		Enrollment enrollingBs3 = new Enrollment(s3.getSectionID(), B.getStudentID());
		enrollingBs3.setGrade(90);
		Enrollment enrollingBs4 = new Enrollment(s1.getSectionID(), B.getStudentID());
		enrollingBs4.setGrade(90);
		Enrollment enrollingBs5 = new Enrollment(s2.getSectionID(), B.getStudentID());
		enrollingBs5.setGrade(90);
		Enrollment enrollingBs6 = new Enrollment(s3.getSectionID(), B.getStudentID());
		enrollingBs6.setGrade(90);

		
		Enrollment enrollingCs1 = new Enrollment(s1.getSectionID(), C.getStudentID());
		enrollingCs1.setGrade(80);
		Enrollment enrollingCs2 = new Enrollment(s2.getSectionID(), C.getStudentID());
		enrollingCs2.setGrade(80);
		Enrollment enrollingCs3 = new Enrollment(s3.getSectionID(), C.getStudentID());
		enrollingCs3.setGrade(80);
		Enrollment enrollingCs4 = new Enrollment(s1.getSectionID(), C.getStudentID());
		enrollingCs4.setGrade(80);
		Enrollment enrollingCs5 = new Enrollment(s2.getSectionID(), C.getStudentID());
		enrollingCs5.setGrade(80);
		Enrollment enrollingCs6 = new Enrollment(s3.getSectionID(), C.getStudentID());
		enrollingCs6.setGrade(80);
		

		Enrollment enrollingDs1 = new Enrollment(s1.getSectionID(), D.getStudentID());
		enrollingDs1.setGrade(70);
		Enrollment enrollingDs2 = new Enrollment(s2.getSectionID(), D.getStudentID());
		enrollingDs2.setGrade(70);
		Enrollment enrollingDs3 = new Enrollment(s3.getSectionID(), D.getStudentID());
		enrollingDs3.setGrade(70);
		Enrollment enrollingDs4 = new Enrollment(s1.getSectionID(), D.getStudentID());
		enrollingDs4.setGrade(70);
		Enrollment enrollingDs5 = new Enrollment(s2.getSectionID(), D.getStudentID());
		enrollingDs5.setGrade(70);
		Enrollment enrollingDs6 = new Enrollment(s3.getSectionID(), D.getStudentID());
		enrollingDs6.setGrade(70);
		

		Enrollment enrollingEs1 = new Enrollment(s1.getSectionID(), E.getStudentID());
		enrollingEs1.setGrade(60);
		Enrollment enrollingEs2 = new Enrollment(s2.getSectionID(), E.getStudentID());
		enrollingEs2.setGrade(60);
		Enrollment enrollingEs3 = new Enrollment(s3.getSectionID(), E.getStudentID());
		enrollingEs3.setGrade(60);
		Enrollment enrollingEs4 = new Enrollment(s1.getSectionID(), E.getStudentID());
		enrollingEs4.setGrade(60);
		Enrollment enrollingEs5 = new Enrollment(s2.getSectionID(), E.getStudentID());
		enrollingEs5.setGrade(60);
		Enrollment enrollingEs6 = new Enrollment(s3.getSectionID(), E.getStudentID());
		enrollingEs6.setGrade(60);

		Enrollment enrollingFs1 = new Enrollment(s1.getSectionID(), E.getStudentID());
		enrollingFs1.setGrade(50);
		Enrollment enrollingFs2 = new Enrollment(s2.getSectionID(), E.getStudentID());
		enrollingFs2.setGrade(50);
		Enrollment enrollingFs3 = new Enrollment(s3.getSectionID(), E.getStudentID());
		enrollingFs3.setGrade(50);
		Enrollment enrollingFs4 = new Enrollment(s1.getSectionID(), E.getStudentID());
		enrollingFs4.setGrade(50);
		Enrollment enrollingFs5 = new Enrollment(s2.getSectionID(), E.getStudentID());
		enrollingFs5.setGrade(50);
		Enrollment enrollingFs6 = new Enrollment(s3.getSectionID(), E.getStudentID());
		enrollingEs6.setGrade(50);


		Enrollment enrollingGs1 = new Enrollment(s1.getSectionID(), E.getStudentID());
		enrollingGs1.setGrade(40);
		Enrollment enrollingGs2 = new Enrollment(s2.getSectionID(), E.getStudentID());
		enrollingGs2.setGrade(40);
		Enrollment enrollingGs3 = new Enrollment(s3.getSectionID(), E.getStudentID());
		enrollingGs3.setGrade(40);
		Enrollment enrollingGs4 = new Enrollment(s1.getSectionID(), E.getStudentID());
		enrollingGs4.setGrade(40);
		Enrollment enrollingGs5 = new Enrollment(s2.getSectionID(), E.getStudentID());
		enrollingGs5.setGrade(40);
		Enrollment enrollingGs6 = new Enrollment(s3.getSectionID(), E.getStudentID());
		enrollingGs6.setGrade(40);


		Enrollment enrollingHs1 = new Enrollment(s1.getSectionID(), E.getStudentID());
		enrollingHs1.setGrade(30);
		Enrollment enrollingHs2 = new Enrollment(s2.getSectionID(), E.getStudentID());
		enrollingHs2.setGrade(30);
		Enrollment enrollingHs3 = new Enrollment(s3.getSectionID(), E.getStudentID());
		enrollingHs3.setGrade(30);
		Enrollment enrollingHs4 = new Enrollment(s1.getSectionID(), E.getStudentID());
		enrollingHs4.setGrade(30);
		Enrollment enrollingHs5 = new Enrollment(s2.getSectionID(), E.getStudentID());
		enrollingHs5.setGrade(30);
		Enrollment enrollingHs6 = new Enrollment(s3.getSectionID(), E.getStudentID());
		enrollingHs6.setGrade(30);


		Enrollment enrollingIs1 = new Enrollment(s1.getSectionID(), E.getStudentID());
		enrollingIs1.setGrade(10);
		Enrollment enrollingIs2 = new Enrollment(s2.getSectionID(), E.getStudentID());
		enrollingIs2.setGrade(10);
		Enrollment enrollingIs3 = new Enrollment(s3.getSectionID(), E.getStudentID());
		enrollingIs3.setGrade(10);
		Enrollment enrollingIs4 = new Enrollment(s1.getSectionID(), E.getStudentID());
		enrollingIs4.setGrade(10);
		Enrollment enrollingIs5 = new Enrollment(s2.getSectionID(), E.getStudentID());
		enrollingIs5.setGrade(10);
		Enrollment enrollingIs6 = new Enrollment(s3.getSectionID(), E.getStudentID());
		enrollingIs6.setGrade(10);

		Enrollment enrollingJs1 = new Enrollment(s1.getSectionID(), E.getStudentID());
		enrollingJs1.setGrade(0);
		Enrollment enrollingJs2 = new Enrollment(s2.getSectionID(), E.getStudentID());
		enrollingJs2.setGrade(0);
		Enrollment enrollingJs3 = new Enrollment(s3.getSectionID(), E.getStudentID());
		enrollingJs3.setGrade(0);
		Enrollment enrollingJs4 = new Enrollment(s1.getSectionID(), E.getStudentID());
		enrollingJs4.setGrade(0);
		Enrollment enrollingJs5 = new Enrollment(s2.getSectionID(), E.getStudentID());
		enrollingJs5.setGrade(0);
		Enrollment enrollingJs6 = new Enrollment(s3.getSectionID(), E.getStudentID());
		enrollingJs6.setGrade(0);
		
		enrollmentList.add(enrollingJs6);
		enrollmentList.add(enrollingJs5);
		enrollmentList.add(enrollingJs4);
		enrollmentList.add(enrollingJs3);
		enrollmentList.add(enrollingJs2);
		enrollmentList.add(enrollingJs1);
		
		enrollmentList.add(enrollingIs6);
		enrollmentList.add(enrollingIs5);
		enrollmentList.add(enrollingIs4);
		enrollmentList.add(enrollingIs3);
		enrollmentList.add(enrollingIs2);
		enrollmentList.add(enrollingIs1);
		
		enrollmentList.add(enrollingHs6);
		enrollmentList.add(enrollingHs5);
		enrollmentList.add(enrollingHs4);
		enrollmentList.add(enrollingHs3);
		enrollmentList.add(enrollingHs2);
		enrollmentList.add(enrollingHs1);
		
		enrollmentList.add(enrollingGs6);
		enrollmentList.add(enrollingGs5);
		enrollmentList.add(enrollingGs4);
		enrollmentList.add(enrollingGs3);
		enrollmentList.add(enrollingGs2);
		enrollmentList.add(enrollingGs1);
		
		enrollmentList.add(enrollingFs6);
		enrollmentList.add(enrollingFs5);
		enrollmentList.add(enrollingFs4);
		enrollmentList.add(enrollingFs3);
		enrollmentList.add(enrollingFs2);
		enrollmentList.add(enrollingFs1);
		
		enrollmentList.add(enrollingEs6);
		enrollmentList.add(enrollingEs5);
		enrollmentList.add(enrollingEs4);
		enrollmentList.add(enrollingEs3);
		enrollmentList.add(enrollingEs2);
		enrollmentList.add(enrollingEs1);
		
		enrollmentList.add(enrollingDs6);
		enrollmentList.add(enrollingDs5);
		enrollmentList.add(enrollingDs4);
		enrollmentList.add(enrollingDs3);
		enrollmentList.add(enrollingDs2);
		enrollmentList.add(enrollingDs1);
		
		enrollmentList.add(enrollingCs6);
		enrollmentList.add(enrollingCs5);
		enrollmentList.add(enrollingCs4);
		enrollmentList.add(enrollingCs3);
		enrollmentList.add(enrollingCs2);
		enrollmentList.add(enrollingCs1);
		
		enrollmentList.add(enrollingBs6);
		enrollmentList.add(enrollingBs5);
		enrollmentList.add(enrollingBs4);
		enrollmentList.add(enrollingBs3);
		enrollmentList.add(enrollingBs2);
		enrollmentList.add(enrollingBs1);
		
		enrollmentList.add(enrollingAs6);
		enrollmentList.add(enrollingAs5);
		enrollmentList.add(enrollingAs4);
		enrollmentList.add(enrollingAs3);
		enrollmentList.add(enrollingAs2);
		enrollmentList.add(enrollingAs1);
		int totalGradePointsOfCourses = 2*(CourseList.get(0).getGradePoints() + CourseList.get(1).getGradePoints() + CourseList.get(2).getGradePoints());
		
		} catch (PersonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void testStudent10GPA() {
		//Student 1 GPA:
		double totalGradePointsStudent1 = ((enrollmentList.get(0).getGrade() + enrollmentList.get(1).getGrade() + enrollmentList.get(2).getGrade() + enrollmentList.get(3).getGrade() + enrollmentList.get(4).getGrade() + enrollmentList.get(5).getGrade())/100/6)*4;
		double ExpectedGPAStudent1 = 0.00;
		double CalculatedGPAStudent1 = (double) totalGradePointsStudent1 ;
		
		assertEquals(ExpectedGPAStudent1, CalculatedGPAStudent1, 0.01);
	}
	
	@Test 
	public void testStudent9GPA() {
		
		//Student 2 GPA:
		double totalGradePointsStudent2 = ((enrollmentList.get(6).getGrade() + enrollmentList.get(7).getGrade() + enrollmentList.get(8).getGrade() + enrollmentList.get(9).getGrade() + enrollmentList.get(10).getGrade() + enrollmentList.get(11).getGrade())/100/6)*4;
		double ExpectedGPAStudent2 = .4;
		double CalculatedGPAStudent2 = (double) totalGradePointsStudent2 ;
				
		assertEquals(ExpectedGPAStudent2, CalculatedGPAStudent2, 0.01); //Correct, expected GPA = calculated GPA for student 2.
		
	}
		
	@Test
	public void testStudent8GPA() {
		//Student 3 GPA:
		double totalGradePointsStudent3 = ((enrollmentList.get(12).getGrade() + enrollmentList.get(13).getGrade() + enrollmentList.get(14).getGrade() + enrollmentList.get(15).getGrade() + enrollmentList.get(17).getGrade() + enrollmentList.get(16).getGrade())/100/6)*4;
		double ExpectedGPAStudent3 = 1.2;
		double CalculatedGPAStudent3 = (double) totalGradePointsStudent3 ;
				
		assertEquals(ExpectedGPAStudent3, CalculatedGPAStudent3, 0.01); //Correct, expected GPA = calculated GPA for student 3.
	}
	
	@Test
	public void testStudent7GPA() {
		//Student 4 GPA:
		double totalGradePointsStudent4 = ((enrollmentList.get(23).getGrade() + enrollmentList.get(18).getGrade() + enrollmentList.get(19).getGrade() + enrollmentList.get(20).getGrade() + enrollmentList.get(21).getGrade() + enrollmentList.get(22).getGrade())/100/6)*4;
		double ExpectedGPAStudent4 = 1.6;
		double CalculatedGPAStudent4 = (double) totalGradePointsStudent4 ;
						
		assertEquals(ExpectedGPAStudent4, CalculatedGPAStudent4, 0.01); //Correct, expected GPA = calculated GPA for student 4.
	}
	
	@Test
	public void testStudent6GPA() {
		//Student 5 GPA:
		double totalGradePointsStudent5 = (((enrollmentList.get(28)).getGrade() + enrollmentList.get(29).getGrade() + enrollmentList.get(24).getGrade() + enrollmentList.get(25).getGrade() + enrollmentList.get(26).getGrade() + enrollmentList.get(27).getGrade())/100/6)*4;
		double ExpectedGPAStudent5 = 2;
		double CalculatedGPAStudent5 = (double) Math.round(totalGradePointsStudent5) ;
						
		assertEquals(ExpectedGPAStudent5, CalculatedGPAStudent5, 0.01); //Correct, expected GPA = calculated GPA for student 5.
	}
	
	@Test
	public void testStudent5GPA() {
		//Student 6 GPA:
		double totalGradePointsStudent6 = ((enrollmentList.get(34).getGrade() + enrollmentList.get(35).getGrade() + enrollmentList.get(30).getGrade() + enrollmentList.get(31).getGrade() + enrollmentList.get(32).getGrade() + enrollmentList.get(33).getGrade())/100/6)*4;
		double ExpectedGPAStudent6 = 2.3;
		double CalculatedGPAStudent6 = (double) Math.round(totalGradePointsStudent6*10)/10 ;
		
		assertEquals(ExpectedGPAStudent6, CalculatedGPAStudent6, 0.01); //Correct, expected GPA = calculated GPA for student 6.
	}
	
	@Test 
	public void testStudent4GPA() {
		
		//Student 7 GPA:
		double totalGradePointsStudent7 = ((enrollmentList.get(41).getGrade() + enrollmentList.get(36).getGrade() + enrollmentList.get(37).getGrade() + enrollmentList.get(38).getGrade() + enrollmentList.get(39).getGrade() + enrollmentList.get(40).getGrade())/100/6)*4;
		double ExpectedGPAStudent7 = 2.8;
		double CalculatedGPAStudent7 = (double) totalGradePointsStudent7 ;
				
		assertEquals(ExpectedGPAStudent7, CalculatedGPAStudent7, 0.01); //Correct, expected GPA = calculated GPA for student 7.
		
	}
		
	@Test
	public void testStudent3GPA() {
		//Student 8 GPA:
		double totalGradePointsStudent8 = ((enrollmentList.get(42).getGrade() + enrollmentList.get(47).getGrade() + enrollmentList.get(43).getGrade() + enrollmentList.get(44).getGrade() + enrollmentList.get(45).getGrade() + enrollmentList.get(46).getGrade())/100/6)*4;
		double ExpectedGPAStudent8 = 3.2;
		double CalculatedGPAStudent8 = (double) totalGradePointsStudent8;
				
		assertEquals(ExpectedGPAStudent8, CalculatedGPAStudent8, 0.01); //Correct, expected GPA = calculated GPA for student 8.
	}
	
	@Test
	public void testStudent2GPA() {
		//Student 9 GPA:
		double totalGradePointsStudent9 = ((enrollmentList.get(53).getGrade() + enrollmentList.get(48).getGrade() + enrollmentList.get(49).getGrade() + enrollmentList.get(50).getGrade() + enrollmentList.get(51).getGrade() + enrollmentList.get(52).getGrade())/100/6)*4;
		double ExpectedGPAStudent9 = 3.6;
		double CalculatedGPAStudent9 = (double) totalGradePointsStudent9 ;
						
		assertEquals(ExpectedGPAStudent9, CalculatedGPAStudent9, 0.01); //Correct, expected GPA = calculated GPA for student 9.
	}
	
	@Test
	public void testStudent1GPA() {
		//Student 10 GPA:
		double totalGradePointsStudent10 = ((enrollmentList.get(56).getGrade() + enrollmentList.get(54).getGrade() + enrollmentList.get(55).getGrade() + enrollmentList.get(57).getGrade() + enrollmentList.get(58).getGrade() + enrollmentList.get(59).getGrade())/100/6)*4;
		double ExpectedGPAStudent10 = 4.00;
		double CalculatedGPAStudent10 = (double) totalGradePointsStudent10 ;
						
		assertEquals(ExpectedGPAStudent10, CalculatedGPAStudent10, 0.01); //Correct, expected GPA = calculated GPA for student 10.
	}
	public void Course1AvgTest() {
		int avg = (int) (enrollmentList.get(0).getGrade() + enrollmentList.get(6).getGrade() + enrollmentList.get(12).getGrade() +
				enrollmentList.get(18).getGrade() + enrollmentList.get(24).getGrade() + enrollmentList.get(30).getGrade() +
				enrollmentList.get(36).getGrade() + enrollmentList.get(42).getGrade() + enrollmentList.get(48).getGrade() +
				enrollmentList.get(54).getGrade()+ enrollmentList.get(3).getGrade() + enrollmentList.get(9).getGrade() + enrollmentList.get(15).getGrade() +
				enrollmentList.get(21).getGrade() + enrollmentList.get(27).getGrade() + enrollmentList.get(23).getGrade() +
				enrollmentList.get(39).getGrade() + enrollmentList.get(45).getGrade() + enrollmentList.get(51).getGrade() +
				enrollmentList.get(57).getGrade());
	}
	public void Course2AvgTest() {
		int avg = (int) (enrollmentList.get(1).getGrade() + enrollmentList.get(4).getGrade() + enrollmentList.get(7).getGrade() +
				enrollmentList.get(10).getGrade() + enrollmentList.get(13).getGrade() + enrollmentList.get(16).getGrade() +
				enrollmentList.get(19).getGrade() + enrollmentList.get(22).getGrade() + enrollmentList.get(25).getGrade() +
				enrollmentList.get(28).getGrade()+ enrollmentList.get(31).getGrade() + enrollmentList.get(34).getGrade() + enrollmentList.get(37).getGrade() +
				enrollmentList.get(40).getGrade() + enrollmentList.get(43).getGrade() + enrollmentList.get(46).getGrade() +
				enrollmentList.get(49).getGrade() + enrollmentList.get(52).getGrade() + enrollmentList.get(55).getGrade() +
				enrollmentList.get(58).getGrade());
	}
	public void Course3AvgTest() {
		int avg = (int) (enrollmentList.get(2).getGrade() + enrollmentList.get(5).getGrade() + enrollmentList.get(8).getGrade() +
				enrollmentList.get(11).getGrade() + enrollmentList.get(14).getGrade() + enrollmentList.get(17).getGrade() +
				enrollmentList.get(20).getGrade() + enrollmentList.get(23).getGrade() + enrollmentList.get(27).getGrade() +
				enrollmentList.get(30).getGrade()+ enrollmentList.get(33).getGrade() + enrollmentList.get(36).getGrade() + enrollmentList.get(39).getGrade() +
				enrollmentList.get(41).getGrade() + enrollmentList.get(44).getGrade() + enrollmentList.get(47).getGrade() +
				enrollmentList.get(50).getGrade() + enrollmentList.get(53).getGrade() + enrollmentList.get(56).getGrade() +
				enrollmentList.get(59).getGrade());
	}
}