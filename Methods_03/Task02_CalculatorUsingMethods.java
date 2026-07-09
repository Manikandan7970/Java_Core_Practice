package Methods_03;

public class Task02_CalculatorUsingMethods {
	
	public int add(int a,int b)
	{
		return a+b;
	}
	public int sub(int a,int b)
	{
		if(a>b)
		{
			return a-b;
		}
		else if(b>a)
		{
			return b-a;
		}
		return a-b;
	}
	
	public int multiply(int a,int b)
	{
		return a*b;
	}
	
	public double divide(int a,int b)
	{
		if(a>b)
		{
			return a/b;
		}
		else if(b>a)
		{
			return b/a;
		}
		return a/b;
	}
	
	public int modulus(int a,int b)
	{
		return a%b;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Task 2 – Calculator Using Methods
//		Objective
//
//		Perform arithmetic operations using separate methods.
//
//		Methods
//		add(int a, int b)
//		subtract(int a, int b)
//		multiply(int a, int b)
//		divide(int a, int b)
//		modulus(int a, int b)
//		
//		Concepts
//		Return methods
//		Parameters
//		Method calls
		
		Task02_CalculatorUsingMethods o=new Task02_CalculatorUsingMethods();
		System.out.println("Addition : "+o.add(45, 56));
		System.out.println("Subtraction : "+o.sub(33, 14));
		System.out.println("Multplication : "+o.multiply(170, 12));
		System.out.println("Division : "+o.divide(125, 7));
		System.out.println("Modulation : "+o.modulus(14, 56));
		
		

	}

}
