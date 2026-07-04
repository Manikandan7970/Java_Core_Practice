package Basic_Java_01;

public class Task02_EmployeeSalaryCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Task 2 - Employee Salary Calculator
//
//		Concepts:
//
//		Variables
//		Arithmetic Operators
//
//		Input:
//
//		Basic Salary
//		HRA
//		DA
//
//		Calculate:
//
//		Gross Salary
//
//		Display all values.
		
		double salary=30000;
		double HRA=(salary*20/100);
		double DA=(salary*15/100);
		double grossSalary=salary+HRA+DA;
		System.out.println("Base Salary : "+salary);
		System.out.println("HRA (House Rent Allowance) : "+HRA);
		System.out.println("DA (Dearness Allowance) : "+DA);
		System.out.println("Calcluation : Salary + HRA + DA - "+salary+"+"+HRA+"+"+DA);
		System.out.println("Gross Salary : "+grossSalary);
		
	}

}
