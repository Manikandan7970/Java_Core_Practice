package Control_Statements_02;

import java.util.Scanner;

public class Task08_MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Task 8 – Multiplication Table Generator
//		Objective
//
//		Generate multiplication table.
//
//		Input
//		Number
//		Output
//		7 x 1 = 7
//
//		7 x 2 = 14
//
//		...
//
//		7 x 10 = 70
//		Constraint
//
//		Use only
//
//		for loop
		Scanner so=new Scanner(System.in);
		System.out.println("Multiplication Table Generator");
		System.out.println("Enter a table number.");
		int tablenum=so.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(tablenum+" x "+i+" = "+(tablenum*i));
		}
	}

}
