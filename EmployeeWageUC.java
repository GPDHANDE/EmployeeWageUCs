package org.EmpWage;

import java.util.Scanner;

public class EmployeeWageUC 
{
	public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int MAX_HRS_IN_MONTH = 100;
    public static void computeEmpWage(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHourPerMonth)
    {
        int empHrs = 0;
        int totalEmpHours = 0;
        int totalWorkingDays = 0;
        while (totalEmpHours <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) 
        {
	        while (totalEmpHours <= maxHourPerMonth && totalWorkingDays < numOfWorkingDays) 
	        {
	            totalWorkingDays++;
	            int check = (int) ((Math.random() * 10) % 3);
	            switch (check) 
	            {
	                case IS_PART_TIME:
	                    empHrs = 4;
	                    break;
	                case IS_FULL_TIME:
	                    empHrs = 8;
	                    break;
	                default:
	                    empHrs = 0;
	            }
	            totalEmpHours += empHrs;
	            System.out.println("Day " + totalWorkingDays + " Employee hours : " + empHrs);
	        }
	        int totalEmpWage = totalEmpHours * EMP_RATE_PER_HOUR;
	        System.out.println("Total Employee wage: " + totalEmpWage);
	        int totalEmpWage1 = totalEmpHours * empRatePerHour;
	        System.out.println("Total Employee wage for "+companyName+" company is " + totalEmpWage1);
        }
        
    }
    public static void main(String[] args) 
    {
        System.out.println("Welcome to Employee Wage Computation problem.");
        computeEmpWage("In&Out",20, 20, 100);
        computeEmpWage("Adani", 10, 25, 150);
    }

}
