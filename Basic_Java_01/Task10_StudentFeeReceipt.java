package Basic_Java_01;

import java.util.Scanner;

public class Task10_StudentFeeReceipt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
//		Task 10 - Mini Student Fee Receipt
//
//		Concepts:
//
//		Variables
//		Scanner
//		Arithmetic Operators
//		Formatted Output
//
//		Input:
//
//		Student Name
//		Roll Number
//		Course Fee
//		Lab Fee
//		Exam Fee
//
//		Calculate:
//
//		Total Fee
//
//		Print a professional fee receipt.
		Scanner so=new Scanner(System.in);
		System.out.println("Mini Student Fee Receipt.");
		System.out.println("Enter Student Name.");
		String name=so.nextLine();
		System.out.println("Enter Roll No.");
		int rollNo=so.nextInt();
		System.out.println("Enter Course Fee.");
		double courseFee=so.nextDouble();
		System.out.println("Enter Lab Fee.");
		double labFee=so.nextDouble();
		System.out.println("Enter Exam Fee.");
		double examFee=so.nextDouble();
		System.out.println(" Student Fee Receipt ");
		System.out.println("=========================");
		System.out.println("Student Name : "+name);
		System.out.println("Roll No      : "+rollNo);
		System.out.println("Course Fee   : "+courseFee);
		System.out.println("Lab Fee      : "+labFee);
		System.out.println("Exam Fee     : "+examFee);
		System.out.println("Total Fee    : "+(courseFee+labFee+examFee));
		System.out.println("==========================");
		
		
		
		
		
		
		
	}

}
