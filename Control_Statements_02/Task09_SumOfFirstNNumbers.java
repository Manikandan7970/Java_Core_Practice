package Control_Statements_02;

import java.util.Scanner;

public class Task09_SumOfFirstNNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Task 9 – Sum of First N Numbers
//		Objective
//
//		Find sum from
//
//		1 to N
//		Example
//
//		Input
//
//		10
//
//		Output
//
//		55
//		Constraint
//
//		Use only
//
//		while loop
		Scanner so=new Scanner(System.in);
		System.out.println("Sum of First N Numbers.");
		System.out.println("Enter a number to find sum of number.");
		int num=so.nextInt();
		int sum=0;
		int i=1;
		while(i<=num)
		{
			sum+=i;
			i++;
		}
		System.out.println("Sum of "+num+" value is "+sum);
		
	}

}
