package Methods_03;

import java.util.Scanner;

public class Task03_EmployeeSalaryCalculator {
	
	public double calculateGrossSalary(double basicSalary,double allownces)
	{
		return basicSalary+allownces;
	}
	
	public double calculateNetSalary(double grossSalary)
	{
		double detection=grossSalary*15/100;
		double netSalary=grossSalary-detection;
		return netSalary;
	}
	public void displaySalarySlip(String empName,double basicSalary,double grossSalary,double netSalary)
	{
		System.out.println("= = = = = Employee Pay Slip = = = = = ");
		System.out.println("= = = = = = = = = = = = = = = = = = = \n");
		System.out.println("Employee Name : "+empName);
		System.out.println("Basic Salary : "+basicSalary);
		System.out.println("Gross Salary : "+grossSalary);
		System.out.println("Net Salary : "+netSalary+"\n");
		System.out.println("= = = = = = = = = = = = = = = = = = = ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task03_EmployeeSalaryCalculator o=new Task03_EmployeeSalaryCalculator();
		Scanner so=new Scanner(System.in);
		System.out.println("Enter Employee Name.");
		String empName=so.nextLine();
		System.out.println("Enter Basic Salary.");
		double baseSalary=so.nextDouble();
		System.out.println("Enter Allownce Amount.");
		double allownce=so.nextDouble();
		double grossSalary=o.calculateGrossSalary(baseSalary, allownce);
		double netSalary=o.calculateNetSalary(grossSalary);
		o.displaySalarySlip(empName, baseSalary, grossSalary, netSalary);
		so.close();
	}

}
