package Basic_Java_01;

import java.util.Scanner;

public class Task08_TypeCastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Task 8 - Type Casting Demonstration
//
//		Concepts:
//
//		Implicit Casting
//		Explicit Casting
//
//		Demonstrate conversions between:
//
//		int → long
//		int → double
//		double → int
//		float → int
//		char → int
//
//		Display the before and after values.
		
		Scanner so=new Scanner(System.in);
		System.out.println("Type Casting Implicit Explicit.");
		System.out.println("Enter 4 values integer double float char.");
		int num1=so.nextInt();
		double num2=so.nextDouble();
		float num3=so.nextFloat();
		char c=so.next().charAt(0);
		
		int n=(int) num2;
		int n1=(int) num3;
		int n2=c;
		int n3=(int)c;
		double d=num1;
		float f=num1;
		long l=num1;
		
		System.out.println("Implicit Convertion.");
		System.out.println("int → long : "+l);
		System.out.println("int → double : "+d);
		System.out.println("int → float : "+f);
		System.out.println("char → int : "+n2);
		System.out.println("Explicit Conversion.");
		System.out.println("double → int : "+n);
		System.out.println("float → int : "+n1);
		System.out.println("char → int : "+n3);
		
		
		
		
		

	}

}
