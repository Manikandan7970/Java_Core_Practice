package Basic_Java_01;

import java.util.Scanner;

public class Task03_MarksPercentageCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Task 3 - Marks Percentage Calculator
//
//		Concepts:
//		Scanner
//		Arithmetic Operators
//
//		Input marks for:
//		5 subjects
//
//		Calculate:
//		Total
//		Average
//		Percentage
//
//		Display the results.
		
		Scanner so=new Scanner(System.in);
		System.out.println("Marks Percentage Calculator.");
		System.out.println("10th Subjects Marks.");
		System.out.println("Enter Tamil Mark.");
		byte tamil=so.nextByte();
		System.out.println("Enter English Mark.");
		byte english=so.nextByte();
		System.out.println("Enter Maths Mark.");
		byte maths=so.nextByte();
		System.out.println("Enter Social Science Mark.");
		byte socialscience=so.nextByte();
		System.out.println("Enter Science Mark.");
		byte science=so.nextByte();
		
		int totalmarks=tamil+english+maths+socialscience+science;
		int average=totalmarks/5;
		float percentage=((totalmarks/500.0f)*100);
		
		System.out.println("Total Marks : "+totalmarks);
		System.out.println("Average : "+average);
		System.out.println("Percentage : "+percentage+"%");
		
		

	}

}
