package Arrays_04;

import java.util.Scanner;

public class Task03_LargestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Task 3 - Find Largest,Socond Largest and Smallest,Second Smallest Element
//
//		Requirements
//		Input:
//
//		Integer array
//
//		Output:
//
//		Largest number
//		Smallest number
		
		Scanner so=new Scanner(System.in);
//		System.out.println("Enter 5 Numbers.");
//		int arr[]=new int[5];
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=so.nextInt();
//		}
		
		int a[]= {30,10,5,85,4,230,11};
		int largestnum, secondlargestnum, smallestnum, secondsmallestnum;
		 if (a[0] > a[1]) {
	            largestnum = a[0];
	            secondlargestnum = a[1];

	            smallestnum = a[1];
	            secondsmallestnum = a[0];
	        } else {
	            largestnum = a[1];
	            secondlargestnum = a[0];

	            smallestnum = a[0];
	            secondsmallestnum = a[1];
	        }
		for(int i=2;i<a.length;i++)
		{
			if(a[i]>largestnum)
			{
				secondlargestnum=largestnum;
				largestnum=a[i];
			} 
			else if(a[i]>secondlargestnum && a[i]!=largestnum)
			{
				secondlargestnum=a[i];
			}
			if(a[i]<smallestnum)
			{
				secondsmallestnum=smallestnum;
				smallestnum=a[i];
			}
			else if(a[i]<secondsmallestnum && a[i]!=smallestnum)
			{
				secondsmallestnum=a[i];
			}
		}
		
		System.out.println("Largest Number : "+largestnum);
		System.out.println("Smallest Number : "+smallestnum);
		System.out.println("Second Largest Number : "+secondlargestnum);
		System.out.println("Second Smallest Number : "+secondsmallestnum);
		
		

	}

}
