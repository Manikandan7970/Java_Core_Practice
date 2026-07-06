package Control_Statements_02;

import java.util.Scanner;

public class Task01_EvenOddChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Task 1 – Even or Odd Checker
//		Objective
//
//		Create a program to determine whether a given integer is even or odd.
//
//		Requirements
//		Accept an integer from the user.
//		Check whether the number is divisible by 2.
//		Print:
//		"Even Number"
//		"Odd Number"
//		Concepts
//		Scanner
//		Variables
//		if-else
//		Arithmetic Operator (%)
		
		Scanner so=new Scanner(System.in);
		System.out.println("Enter a number to check even or odd.");
		int num=so.nextInt();
		if(num%2==0)
			System.out.println("Even Number.");
		else System.out.println("Odd Number.");
			
		

	}

}
