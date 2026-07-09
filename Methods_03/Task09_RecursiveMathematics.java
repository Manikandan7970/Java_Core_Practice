package Methods_03;

public class Task09_RecursiveMathematics {
	public int factorial(int n)
	{
	    if(n == 0 || n == 1)
	        return 1;
	    return n * factorial(n - 1);
	}
	
	public int fibonacci(int n)
	{
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	public int sumOfNumbers(int n)
	{
		if(n==0)
			return 0;
		return n + sumOfNumbers(n-1);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Task 9 – Recursive Mathematics
//		Objective
//
//		Solve problems using recursion.
//
//		Methods
//		factorial()
//		fibonacci()
//		sumOfNumbers()
//		Concepts
//		Recursion
//		Base condition
		Task09_RecursiveMathematics o=new Task09_RecursiveMathematics();
		System.out.println(o.factorial(5));
		System.out.println(o.fibonacci(10));
		System.out.println(o.sumOfNumbers(10));
	}

}
