package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test() throws PersonException {
		ArrayList<Staff> staffList= new ArrayList<Staff>();
		Staff A= new Staff("Anton", "Derek", "Hovanec", new Date(1999,3,25), "101 Panorama Drive Newark Delaware 19711", "302-740-1320", "ahovanec@udel.edu", "1-5pm", 1, 50000.00, new Date(2017,7,29), eTitle.MR);
		Staff B= new Staff("Anton", "Derek", "Hovanec", new Date(1999,3,25), "101 Panorama Drive Newark Delaware 19711", "302-740-1320", "ahovanec@udel.edu", "1-5pm", 2, 1000.00, new Date(2017,7,29), eTitle.MR);
		Staff C= new Staff("Anton", "Derek", "Hovanec", new Date(1999,3,25), "101 Panorama Drive Newark Delaware 19711", "302-740-1320", "ahovanec@udel.edu", "1-5pm", 3, 700000.00, new Date(2017,7,29), eTitle.MR);
		Staff D= new Staff("Anton", "Derek", "Hovanec", new Date(1999,3,25), "101 Panorama Drive Newark Delaware 19711", "302-740-1320", "ahovanec@udel.edu", "1-5pm", 4, 500.00, new Date(2017,7,29), eTitle.MR);
		Staff E= new Staff("Anton", "Derek", "Hovanec", new Date(1999,3,25), "101 Panorama Drive Newark Delaware 19711", "302-740-1320", "ahovanec@udel.edu", "1-5pm", 5, 60.00, new Date(2017,7,29), eTitle.MR);
		staffList.add(A);
		staffList.add(B);
		staffList.add(C);
		staffList.add(D);
		staffList.add(E);
		double totalSalary = 0;
		for (Staff s : staffList) {
			totalSalary += s.getSalary();
		}
		double averageSalary=totalSalary/5;
		int sal=(int) averageSalary;
		assertEquals(sal,150312);
	}	
	@Test(expected = PersonException.class)
	public void testAgeException() throws PersonException {
		Staff A= new Staff("Anton", "Derek", "Hovanec", new Date(1800,3,25), "101 Panorama Drive Newark Delaware 19711", "302-740-1320", "ahovanec@udel.edu", "1-5pm", 1, 50000.00, new Date(2017,7,29), eTitle.MS);
	}

	@Test(expected = PersonException.class)
	public void testPhoneNumException() throws PersonException {
		Staff A= new Staff("Anton", "Derek", "Hovanec", new Date(1999,3,25), "101 Panorama Drive Newark Delaware 19711", "302-40-1320", "ahovanec@udel.edu", "1-5pm", 1, 50000.00, new Date(2017,7,29), eTitle.MS);
	}
}
/*Create an ArrayList of Staff class.  Add five sample Staff instances to the ArrayList with different salaries. 
 *  Compute an average of the salaries and prove it with an assertEquals method.
5 points.

Write a test for Staff with an invalid phone number and invalid DOB.  Make sure you’re testing whether the exception was thrown.*/
