package Control_Statements_02;

import java.util.Scanner;

public class Task05_SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Task 5 – Simple Calculator
//		Objective
//
//		Perform arithmetic operations.
//
//		Input
//		First Number
//
//		Operator
//
//		Second Number
//
//		Supported Operators
//
//		+
//		-
//		*
//		/
//		%
//		Output
//		Result : xx
//		
//		Validation
//
//		If operator is invalid
//
//		Invalid Operator
//		
//		Concepts
//		switch
//		Arithmetic Operators
		Scanner so=new Scanner(System.in);
		System.out.println("Simple Calculator");
		System.out.println("Enter first number.");
		int num1=so.nextInt();
		System.out.println("Enter Operator.");
		char operator=so.next().charAt(0);
		System.out.println("Enter second number.");
		int num2=so.nextInt();
		switch(operator)
		{
		case '+':int add=num1+num2;
			System.out.println("Addition : "+add);
		break;
		case '-':int sub=num1-num2;
		    System.out.println("Subtraction : "+sub);
		break;
		case '*':int mul=num1*num2;
			System.out.println("Multiplication : "+mul);
		break;
		case '/':double div=(double)num1/(double)num2;
			System.out.println("Division : "+div);
		break;
		case '%':int mod=num1%num2;
			System.out.println("Modulation : "+mod);
		break;
		default :System.out.println("Invalid Operator.");
		}

	}

}
