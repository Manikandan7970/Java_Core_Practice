package Arrays_04;

import java.util.Scanner;

public class Task01_StoreDisplayMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Task 1 - Store and Display Student Marks
//
//		Concepts:
//
//		1D Array
//		Scanner
//		for loop
//
//		Requirements:
//
//		Store marks of 5 students.
//		Display all marks.
//		Display total students.
		String[] studentname=new String[5];
		short[] studentmark=new short[5];
		
		Scanner so=new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter Student "+(i+1)+" Name");
		    studentname[i]=so.next();
			System.out.println("Enter Student "+(i+1)+" Mark");
			studentmark[i]=so.nextShort();
		}
		System.out.println("Done.");
		
		for(int i=0;i<5;i++)
		{
			System.out.println(studentname[i]+" = "+studentmark[i]);
		}
		
		System.out.println("Total Students : " + studentname.length);

	}

}
