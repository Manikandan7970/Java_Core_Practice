package Arrays_04;

import java.util.Scanner;

public class Task08_SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Task 8 - Find Second Largest Number
//
//		Example
//
//		Input
//
//		10 25 5 40 30
//
//		Output
//
//		Second Largest = 30
		
		Scanner so=new Scanner(System.in);
		System.out.println("Enter 5 Elements To Find Second Largest Element.");
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=so.nextInt();
		}
		
		System.out.println("Array ");
		for(int n:arr)
			System.out.print(n+" ");
		
		int largest,secondLargest;
		if(arr[0]>arr[1])
		{
		    largest=arr[0];
			secondLargest=arr[1];
		}
		else {
			largest=arr[1];
			secondLargest=arr[0];
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				secondLargest=largest;
				largest=arr[i];
			}
			else if(arr[i]>secondLargest&&arr[i]!=largest){
				secondLargest=arr[i];
			}
		}
		
		System.out.println("\nSecond Largest Element : "+secondLargest);
		
		so.close();

	}

}
