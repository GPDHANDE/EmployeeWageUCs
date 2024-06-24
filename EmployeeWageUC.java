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
		
		int empCheckAttendance = (int) (Math.floor(Math.random()*10)%3);
		
		switch(empCheckAttendance)
		{
			case 1:  int dailyWageOfEmp = wagePerHr*dayHrFulltime;
			System.out.println("Daily Employee wage of an Full time Employee is "+dailyWageOfEmp+"");
			break;
			
			case 2: int dailyWageOfEmp1 = wagePerHr*dayHrPartTime;
			System.out.println("Daily Employee wage of an Full time Employee is "+dailyWageOfEmp1+"");
			break;
			
			default : System.out.println("Employee is absent");
		}
		 
	}

}
