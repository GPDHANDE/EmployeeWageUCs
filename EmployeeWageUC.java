package org.EmpWage;

public class EmployeeWageUC 
{
	static final int isFullTime = 2;
	static final int isPartTime= 1;
	static final int wagePerHr = 20 ;

	public static void main(String[] args) 
	{
		System.out.println("Welcome to EmployeeWage Computation Program");
		int dayHrFulltime =8 ,dayHrPartTime =4 , totalWage = 0,noOfDays=10;
		
		int empCheckAttendance = (int) (Math.floor(Math.random()*10)%3);
		switch(empCheckAttendance)
			
		{
			case 1:  int dailyWageOfEmp = wagePerHr*dayHrFulltime*noOfDays;
					 System.out.println("Daily Employee wage of an Full time Employee is "+dailyWageOfEmp+"");
					break;
				
			case 2: int dailyWageOfEmp1 = wagePerHr*dayHrPartTime*noOfDays;
					System.out.println("Daily Employee wage of an Full time Employee is "+dailyWageOfEmp1+"");
					break;
				
			default : System.out.println("Employee is absent");
		}
		 
	}

}
