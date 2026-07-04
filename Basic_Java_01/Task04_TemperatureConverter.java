package Basic_Java_01;

import java.util.Scanner;

public class Task04_TemperatureConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Task 4 - Temperature Converter
//
//		Concepts:
//
//		Scanner
//		Formula
//		Type Casting
//
//		Create:
//
//		Celsius → Fahrenheit
//		Fahrenheit → Celsius
		
		Scanner so=new Scanner(System.in);
		System.out.println("Enter Celsuis to convert Fahrenheit.");
		double celsius=so.nextDouble();
		System.out.println("Enter Fahrenheit to convert Celsuis");
		double fahrenheit=so.nextDouble();
		
		double fahrenconvert=(celsius * 9.0 / 5.0) + 32;
		double celsiusconvert=(fahrenheit - 32) * 5.0 / 9.0;
		
		System.out.println("Celsius -> Fahrenheit : "+celsius+"°C = "+fahrenconvert+"°F");
		System.out.println("Fahrenheit -> Celsius : "+fahrenheit+"°F = "+celsiusconvert+"°C");
		

	}

}
