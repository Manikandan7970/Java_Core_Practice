package Arrays_04;

import java.util.Scanner;

public class Task02_SumAverageArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Task 2 - Sum and Average of Array
//
//		Requirements
//
//		Read N integers.
//		Calculate:
//		Sum
//		Average
		
		Scanner so=new Scanner(System.in);
		System.out.println("Enter 10 Numbers To Find Sum and Average.");
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter number "+(i+1)+".");
			arr[i]=so.nextInt();
		}
		
		int sum=0;
		int n=arr.length;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		
		 double average=(double)sum/n;
		 
		 System.out.println("Sum Of Array : "+sum);
		 System.out.println("Average Of Array : "+average);
		

	}

}
