package Control_Statements_02;

import java.util.Scanner;

public class Task12_PrimeNumberChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Task 12 – Prime Number Checker
//		Objective
//
//		Determine whether given number is prime.
//
//		Input
//		29
//		Output
//		Prime Number
//
//		or
//
//		Not Prime
//		Constraint
//
//		Use
//
//		for loop
//
//		if
		Scanner so=new Scanner(System.in);
		System.out.println("Prime Number Checker");
		System.out.println("Enter a number to find prime or not.");
		int num=so.nextInt();
		boolean isPrime=true;
		for(int i=2;i<num;i++)
			if(num%i==0)
				isPrime=false;
		if(isPrime==false)
			System.out.println("Not a Prime Number.");
		else 
			System.out.println("Prime Number.");
		

	}

}
