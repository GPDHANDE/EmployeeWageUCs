package org.EmpWage;

import java.util.Scanner;

public class EmployeeWageUC 
{
	static final int isFullTime = 2;
	static final int isPartTime= 1;
	static final int wagePerHr = 20 ;
	
	public static void ComputeWage(int noOfDays,int noOfHrs)
	{
		int dayHrFulltime =8 ,dayHrPartTime =4 , totalWage = 0;
		
		int empCheckAttendance = (int) (Math.floor(Math.random()*10)%3);
		
		if(noOfDays<=20 && noOfHrs <=100)
		{
			switch(empCheckAttendance)	
			{
				case 1:  int TotaldailyWageOfEmp = wagePerHr*dayHrFulltime*noOfDays;
						 System.out.println("Daily Employee wage of an Full time Employee is "+TotaldailyWageOfEmp+"");
						break;
					
				case 2: int TotaldailyWageOfEmp1 = wagePerHr*dayHrPartTime*noOfDays;
						System.out.println("Daily Employee wage of an Full time Employee is "+TotaldailyWageOfEmp1+"");
						break;
					
				default : System.out.println("Employee is absent");
			}
			 
		}
		else
		{
			System.out.println("please enter valid  no of days and hours");
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("Welcome to EmployeeWage Computation Program");
	//	int dayHrFulltime =8 ,dayHrPartTime =4 , totalWage = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of days for calculating wage");
		int noOfDays= sc.nextInt();
		System.out.println("Enter No of hours for calculating wage");
		int noOfHrs = sc.nextInt();
		
		ComputeWage(noOfDays, noOfHrs);
	}

}
