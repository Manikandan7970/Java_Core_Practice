package Control_Statements_02;

import java.util.Scanner;

public class Task03_LargestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Task 3 – Largest of Three Numbers
//		Objective
//
//		Find the largest among three integers.
//
//		Requirements
//
//		Input:
//
//		Number1
//		Number2
//		Number3
//
//		Output:
//
//		Largest Number
//		Constraints
//
//		Use only Nested if statements.
//
//		Concepts
//		Nested if
//		Comparison Operators
		
		Scanner so=new Scanner(System.in);
		System.out.println("Find the largest among three integers.");
		System.out.println("Enter Number1.");
		int num1=so.nextInt();
		System.out.println("Enter Number2.");
		int num2=so.nextInt();
		System.out.println("Enter Number3.");
		int num3=so.nextInt();
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println("Number1 : "+num1+" is largest integer.");
			}
		
			else 
			{
				System.out.println("Number3 : "+num3+" is largest ineger.");
			}
		}
		else if(num2>num3)
		{
			System.out.println("Number2 : "+num2+" is largest integer.");
		}

		else 
		{
			System.out.println("Number3 : "+num3+" is largest integer.");
		}


	}

}
