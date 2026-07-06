package Control_Statements_02;

import java.util.Scanner;

public class Task07_VotingEligibilityChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Task 7 – Voting Eligibility Checker
//		Objective
//
//		Check voting eligibility.
//
//		Input
//
//		Age
//
//		Output
//		Eligible to Vote
//
//		or
//
//		Not Eligible
//		Constraint
//
//		Use only
//
//		Ternary Operator
//
//		No if statement.
		
		Scanner so=new Scanner(System.in);
		System.out.println("Voting Eligibility Checker.");
		System.out.println("Enter Your Age To Check For Vote Eligible or Not.");
		int age=so.nextInt();
		System.out.println(age>=18?"You are eligible for vote":
			               "You are not eligible for vote.");
		
	}

}
