package Control_Statements_02;

import java.util.Scanner;

public class Task14_SkipMultiplesOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Task 14 – Skip Multiples of 3
//		Objective
//
//		Print numbers
//
//		1-100
//
//		Skip
//
//		3
//
//		6
//
//		9
//
//		12
//
//		...
//		Constraint
//
//		Must use
//
//		continue
		Scanner so=new Scanner(System.in);
		System.out.println("Skip Multiples of 3");
		System.out.println("Enter starting number.");
		int start=so.nextInt();
		System.out.println("Enter ending number.");
		int end=so.nextInt();
		int skip=start+2;
		for(int i=start;i<=end;i++)
		{
			  if(i!=skip)
				  continue;
			  else 
			  {
				  System.out.println(i);
				  skip+=2;
			  }
		}

	}

}
