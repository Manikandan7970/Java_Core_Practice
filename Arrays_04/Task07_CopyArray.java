package Arrays_04;

public class Task07_CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Task 7 - Copy One Array to Another
//
//		Create a second array.
//
//		Copy all elements.
//
//		Display both arrays.
		
		int arr1[]= {10,20,30,40,50,60,70};
		int arr2[]=new int[arr1.length];
		for(int i=0;i<arr1.length;i++)
		{
			arr2[i]=arr1[i];
		}
		System.out.println("Original Array.");
		for(int n:arr1)
			System.out.print(n+" ");
		
		System.out.println();
		System.out.println("Copy Array.");
		for(int n:arr2)
			System.out.print(n+" ");
		

	}

}
