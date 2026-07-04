package Arrays_04;

import java.util.Scanner;

public class Task06_ReverseArray {
	
	public static void main(String[] args) {
		
//		Task 6 - Reverse an Array
//
//		Requirements
//		Input:
//
//		1 2 3 4 5
//
//		Output:
//
//		5 4 3 2 1
		
		Scanner so=new Scanner(System.in);
		System.out.println("Enter 5 values.");	
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=so.nextInt();
		}
		int end=arr.length-1;
		for(int i=0;i<arr.length;i++)
		{
			if(i!=end)
			{
				int temp=arr[i];
				arr[i]=arr[end];
				arr[end]=temp;
				end--;
			}
			if(i==end)
				break;
		}
		
		for(int num : arr)
		{
			System.out.print(num+" ");
		}
		
		
		
	}

}
