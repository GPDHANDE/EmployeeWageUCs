package org.EmpWage;

public class EmployeeWageUC {

	public static void main(String[] args) 
	{
		System.out.println("Welcome to EmployeeWage Computation Program");
		int isFullTime = 2;
		int isPartTime= 1;
		int wagePerHr = 20 ;
		int dayHrFulltime =8;
		int dayHrPartTime =4;
		
		double empCheckAttendance = Math.floor(Math.random()*10)%3;
		if(empCheckAttendance==isFullTime)
		{
			int dailyWageOfEmp = wagePerHr*dayHrFulltime;
			System.out.println("Daily Employee wage of an Full time Employee is "+dailyWageOfEmp+"");
		}
		else if(empCheckAttendance== isPartTime)
		{
			int dailyWageOfEmp = wagePerHr*dayHrPartTime;
			System.out.println("Daily Employee wage of an part time Employee is "+dailyWageOfEmp+"");
		}
		else
		{
			System.out.println("Employee is not present");
		}

	}

}
