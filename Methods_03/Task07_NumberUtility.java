package Methods_03;

public class Task07_NumberUtility {
	
	public boolean isEven(int number)
	{
		if(number%2==0)
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isPrime(int number)
	{
		boolean isPrime=true;
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}
	
	public int reverseNumber(int number)
	{
		int reverse=0;
		while(number!=0)
		{
			int digit=number%10;
			reverse=(reverse*10)+digit;
			number=number/10;
		}
		return reverse;
	}
	public boolean isPaindrome(int num)
	{
		if(num==reverseNumber(num))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Task 7 – Number Utility
//		Objective
//
//		Create utility methods.
//
//		Methods
//		isEven()
//		isPrime()
//		isPalindrome()
//		reverseNumber()
		
//		Concepts
//		Boolean return
//		Reusable methods
		Task07_NumberUtility o=new Task07_NumberUtility();
		System.out.println("The Number is Even : "+o.isEven(5));
		System.out.println("The Number is Prime : "+o.isPrime(6));
		System.out.println("Reverse The Number : "+o.reverseNumber(12223));
		System.out.println("The Number is Palindrome : "+o.isPaindrome(1231));

	}

}
