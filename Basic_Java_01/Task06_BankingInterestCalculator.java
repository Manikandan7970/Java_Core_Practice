package Basic_Java_01;

import java.util.Scanner;

public class Task06_BankingInterestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Task 6 - Banking Interest Calculator
//
//		Concepts:
//
//		Input
//		Variables
//		Formula
//
//		Input:
//
//		Principal
//		Rate
//		Time
//
//		Calculate:
//
//		Simple Interest
//		Total Amount
		
		int principal,time;
		double rate,simpleInterest,totalAmount;
		
		Scanner so=new Scanner(System.in);
		System.out.println("Banking Interest Calculator.");
		System.out.println("Enter Prinicipal Amount.");
		principal=so.nextInt();
		System.out.println("Enter Interest Rate.");
		rate=so.nextDouble();
		System.out.println("Enter Number Of Years.");
		time=so.nextInt();
		
		simpleInterest=(principal*rate*time)/100;//Intrest Calculator.
		
		totalAmount=principal+simpleInterest;
		
		System.out.println("Simple Interest : "+simpleInterest);
		System.out.println("Total Amount : "+totalAmount);

	}

}
