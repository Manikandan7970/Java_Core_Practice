package Arrays_04;

public class Task04_CountEvenOddNumbers {
	
	public static void main(String[] args) {
		
//		Task 4 - Count Even and Odd Numbers
//
//		Requirements
//		Display:
//
//		Total Even Numbers
//		Total Odd Numbers
		
		int arr[]= {34,21,3,5,7,6,88,90,17,29,33,40,35,57};
		int even=0;
		int odd=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			    even++;
			else
				odd++;
		}
		
		System.out.println("Total Even Number : "+even);
		System.out.println("Total Odd Number : "+odd);
	}

}
