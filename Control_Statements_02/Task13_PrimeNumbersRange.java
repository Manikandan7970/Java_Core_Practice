package Control_Statements_02;

import java.util.Scanner;

public class Task13_PrimeNumbersRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Task 13 – Print Prime Numbers Between Two Numbers
//		Objective
//
//		Input
//
//		10
//
//		100
//
//		Output
//
//		11
//
//		13
//
//		17
//
//		19
//
//		23
//
//		...
//
//		97
//		Constraint
//
//		Use
//
//		Nested loops.
		Scanner so=new Scanner(System.in);
		System.out.println("Print Prime Numbers Between Two Numbers");
		System.out.println("Enter a starting number.");
		int start=so.nextInt();
		System.out.println("Enter a ending number.");
		int end=so.nextInt();
		System.out.println(start+" to "+end+" in between prime numbers.");
		boolean isprime=true;
		for(int i=start;i<=end;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
					isprime=false;
		    }
			
			if(isprime)
				System.out.println(i+" Prime number.");
	
			isprime=true;
		}
		
		

	}

}
