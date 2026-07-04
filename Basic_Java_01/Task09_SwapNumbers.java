package Basic_Java_01;

public class Task09_SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Task 9 - Swap Two Numbers
//
//		Concepts:
//
//		Variables
//		Operators
//
//		Implement:
//
//		Swap using third variable
//		Swap without third variable
//
//		Display the results for both methods.
		
		int a=10;
		int b=20;
		int c;
		System.out.println("a Value : "+a);
		System.out.println("b Value : "+b);
		System.out.println("Swap using third variable.");
		c=a;
		a=b;
		b=c;
		System.out.println("a Value : "+a);
		System.out.println("b Value : "+b);
		System.out.println();
		int x=40;
		int y=60;
		System.out.println("x Value : "+x);
		System.out.println("y Value : "+y);
		System.out.println("Swap without third variable.");
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("x Value : "+x);
		System.out.println("y Value : "+y);

	}

}
