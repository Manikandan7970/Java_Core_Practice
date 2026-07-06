package Control_Statements_02;

import java.util.Scanner;

public class Task04_StudentGradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Task 4 – Student Grade Calculator
//		Objective
//
//		Display the student's grade.
//
//		Requirements
//
//		Input:
//
//		Marks (0–100)
//
//		Output
//
//		Marks	Grade
//		90-100	A+
//		80-89	A
//		70-79	B
//		60-69	C
//		50-59	D
//		Below 50	Fail
//		
//		Validation
//
//		If marks are below 0 or above 100
//
//		Display
//
//		Invalid Marks
//		Concepts
		Scanner so=new Scanner(System.in);
		System.out.println("Student Grade Calculator.");
		System.out.println("Enter Your Mark.");
		byte mark=so.nextByte();
		if(mark<=100 && mark>=90)
		{
			System.out.println("A+ Grade.");
		}
		else if(mark<=89 && mark>=80)
		{
			System.out.println("A Grade.");
		}
		else if(mark<=79 && mark>=70)
		{
			System.out.println("B Grade.");
		}
		else if(mark<=69 && mark>=60)
		{
			System.out.println("C Grade.");
		}
		else if(mark<=59 && mark>=50)
		{
			System.out.println("D Grade.");
		}
		else if(mark<50)
		{
			System.out.println("Fail.");
		}
		else if(mark<0 || mark>100){
			System.out.println("Invalid Mark.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
