package Control_Statements_02;

import java.util.Scanner;

public class Task02_PositiveNegativeZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Task 2 – Positive, Negative or Zero
//		Objective
//
//		Determine the type of the entered number.
//
//		Requirements
//
//		Input:
//
//		Integer
//
//		Output:
//
//		Positive Number
//		Negative Number
//		Zero
		
//		Concepts
//		if
//		else if
//		else
		
		Scanner so=new Scanner(System.in);
		System.out.println("Enter a number to find positive or negative or zero.");
		int num=so.nextInt();
		if(num>0)
			System.out.println("Positive Number.");
		else if(num<0)
			System.out.println("Negative Number.");
		else System.out.println("Zero.");

	}

}
