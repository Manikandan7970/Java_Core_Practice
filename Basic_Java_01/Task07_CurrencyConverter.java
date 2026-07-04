package Basic_Java_01;

import java.util.Scanner;

public class Task07_CurrencyConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Task 7 - Currency Converter
//
//		Concepts:
//
//		Scanner
//		Arithmetic Operators
//
//		Convert:
//
//		INR → USD
//		INR → EUR
//		INR → GBP
//
//		(Use fixed exchange rates stored in variables.)
		
		Scanner so=new Scanner(System.in);
		System.out.println("Currency Converter.");
		System.out.println("Enter Amount INR.");
		int INR=so.nextInt();
		
		double usdRate = 83.0;
		double eurRate = 90.0;
		double gbpRate = 105.0;
		
		usdRate=INR/usdRate;
		eurRate=INR/eurRate;
		gbpRate=INR/gbpRate;
		
		System.out.println("INR to USD : "+usdRate+" US Dollar.");
		System.out.println("INR to EURO : "+eurRate+" Euro.");
		System.out.println("INR to GBP : "+gbpRate+" British Pound.");

	}

}
