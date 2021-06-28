package com.bl.employeewage;
import java.util.Scanner;
public class UserInterfaceImpl implements Demo_Interface {
	//private static final int WorkingHours = 0;
	Scanner scanner = new Scanner(System.in);

	@Override
	public void startingDisplay() {
		
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
	}
		public void UC1() {
		System.out.print("enter number to check ::");
		int Is_Present = scanner.nextInt();
		if (Is_Present == 1) {
			System.out.println("Employee is Present");
		}
		else {
			System.out.println("Employee is absent");
		}
		}
		
		public void UC2() {
			int WorkingHours=0;
			int salary=0;
			int WagePerHour=20;
			System.out.print("enter number to check ::");
			int Is_Present = scanner.nextInt();
			if (Is_Present == 1) {
				System.out.println("Employee is Present");
				WorkingHours=8;
			}
			else {
				System.out.println("Employee is absent");
				WorkingHours=0;
			}
			salary=WorkingHours*WagePerHour;
			System.out.println("Salary: " +salary);
		}
		public void UC3() {
			int WorkingHours=0;
			int salary=0;
			int WagePerHour=20;
			System.out.print("enter number to check ::");
			int Is_Present = scanner.nextInt();
			if (Is_Present == 1) {
				System.out.println("Employee is Present");
				WorkingHours=8;
			}
			else if (Is_Present == 2) {
				System.out.println("Employee is Part time Present");
				WorkingHours=4;
			}
			else {
				System.out.println("Employee is absent");
				WorkingHours=0;
			}
			salary=WorkingHours*WagePerHour;
			System.out.println("Salary: " +salary);
		}
		
		public void UC4() {
			int Is_PartTime_Present = 1;
			int Is_FullTime_Present=2;
			int Is_Absent=0;
			int EmpWagePerHours=20;
			int EmpWorkingHours=0;
			double i = Math.floor(Math.random() * 10) %3;
			int empCheck = (int) i;
				switch (empCheck)
				{
				case 1:
					System.out.println("Employee is Full time Present");
					EmpWorkingHours=8;
						break;
				case 2:
					System.out.println("Employee is Part time present");
					EmpWorkingHours=4;
						break;
				case 0:
					System.out.println("Employee is Absent");
					EmpWorkingHours=0;
						break;
				}
				int salary = EmpWagePerHours*EmpWorkingHours;
				System.out.println(salary);
		}
		public void UC5() {
			int days=1;
			int salary=0;
			int EmpWagePerHours=20;
			int WokringHours=0;
			int WorkingHours=8;
				while (days <= 20 && WorkingHours<=100)
				{
					salary += EmpWagePerHours*WorkingHours;
					days = days+1;
					WorkingHours=WorkingHours+8;
				}
				System.out.println("Salary Per Month");
				System.out.println(salary);
		}
		public void UC6() {
			int days=1;
			int salary=0;
			int EmpWagePerHours=20;
			int WokringHours=0;
			int WorkingHours=8;
				while (days <= 20 && WorkingHours<=100)
				{
					salary += EmpWagePerHours*WorkingHours;
					days = days+1;
					WorkingHours=WorkingHours+8;
				}
				System.out.println("Salary Per Month");
				System.out.println(salary);
		}
		public void UC7() {
			int days=1;
			int salary=0;
			int EmpWagePerHours=20;
			int WokringHours=0;
			int WorkingHours=8;
				while (days <= 20 && WorkingHours<=100)
				{
					salary += EmpWagePerHours*WorkingHours;
					days = days+1;
					WorkingHours=WorkingHours+8;
				}
				System.out.println("Salary Per Month");
				System.out.println(salary);
		}
}

	
	
