package org.EmpWage;

public class EmployeeWageUC {

	public static void main(String[] args) 
	{
		System.out.println("Welcome to EmployeeWage Computation Program on Master Branch");
		int present = 1;
		double empCheckAttendance = Math.floor(Math.random()*10)%2;
		if(empCheckAttendance==present)
		{
			System.out.println("Employee is present");
		}
		else
		{
			System.out.println("Employee is not present");
		}

	}

}
