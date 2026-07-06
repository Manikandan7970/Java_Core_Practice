package Control_Statements_02;

public class Task11_StarPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Task 11 – Star Pattern Collection
//		Objective
//
//		Print multiple patterns.
//
//		Pattern 1
//
//		*****
//		*****
//		*****
//		*****
//		*****
//
//		Pattern 2
//
//		*
//		**
//		***
//		****
//		*****
//
//		Pattern 3
//
//		    *
//		   ***
//		  *****
//		 *******
//		*********
//		Constraint
//
//		Use Nested loops only.
		
		System.out.println("Pattern 1.");
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Pattern 2.");
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Pattern 3.");
		int x=0;
		for(int i=4;i>=0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=x;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			x+=2;
		}
	}

}
