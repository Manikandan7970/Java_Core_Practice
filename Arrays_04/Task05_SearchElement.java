package Arrays_04;

import java.util.Scanner;

public class Task05_SearchElement {
	
	public static void main(String[] args) {
		
//		Task 5 - Search an Element
//
//		Requirements
//		Input:
//
//		Array
//		Search value
//
//		Output:
//
//		Found
//		Not Found
		
		Scanner so=new Scanner(System.in);
		int arr[]= {10,20,30,40,50,100,33,47,55,21,11,15};
		
		System.out.println("Search values in an array.");
		int searchvalue=so.nextInt();
		boolean found=false;
		for(int num:arr)
		{
			if(searchvalue==num)
			{
				found=true;
				break;
			}	
		}	
		
		if(found)
		    System.out.println("Found.");
		else 
			System.out.println("Not Found.");
		
	    
	}

}
