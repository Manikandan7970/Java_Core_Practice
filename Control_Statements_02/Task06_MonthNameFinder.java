package Control_Statements_02;

import java.util.Scanner;

public class Task06_MonthNameFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Task 6 – Month Name Finder
//		Objective
//
//		Display month name based on month number.
//
//		Input
//		1-12
//		Output
//		January
//		February
//		...
//		December
//		Validation
//
//		If number is outside 1-12
//
//		Invalid Month
//		Concepts
//		switch
		Scanner so=new Scanner(System.in);
		System.out.println("Month Name Finder.");
		System.out.println("Enter a number 1 to 12 to display month.");
		int month=so.nextInt();
		switch(month)
		{
		case 1:System.out.println("January.");
		break;
		case 2:System.out.println("Febraury.");
		break;
		case 3:System.out.println("March.");
		break;
		case 4:System.out.println("April.");
		break;
		case 5:System.out.println("May.");
		break;
		case 6:System.out.println("June.");
		break;
		case 7:System.out.println("July.");
		break;
		case 8:System.out.println("August.");
		break;
		case 9:System.out.println("September.");
		break;
		case 10:System.out.println("October.");
		break;
		case 11:System.out.println("November.");
		break;
		case 12:System.out.println("December.");
		break;
		default : System.out.println("Invalid Month Number.");
		}
		

	}

}
