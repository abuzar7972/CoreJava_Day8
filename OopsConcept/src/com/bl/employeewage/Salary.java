package com.bl.employeewage;

public static int Salary(int EmpWagePerHours,int WorkingHours, int salary) {
	salary += EmpWagePerHours*WorkingHours;
	return salary;
}
