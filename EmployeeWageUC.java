package org.EmpWage;

public class EmployeeWageUC {

	public static void main(String[] args) 
	{
		System.out.println("Welcome to EmployeeWage Computation Program");
		int present = 1;
		int wagePerHr = 20 ;
		int dayHr =8;
		
		double empCheckAttendance = Math.floor(Math.random()*10)%2;
		if(empCheckAttendance==present)
		{
			int dailyWageOfEmp = wagePerHr*dayHr;
			System.out.println("Daily Employee wage of an Employee is "+dailyWageOfEmp+"");
		}
		else
		{
			System.out.println("Employee is not present");
		}

	}

}
