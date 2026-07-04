package Basic_Java_01;

import java.util.Scanner;

public class Task05_RectangleCircleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Task 5 - Rectangle & Circle Calculator
//
//		Concepts:
//
//		Variables
//		Arithmetic Operators
//
//		Calculate:
//
//		Rectangle Area
//		Rectangle Perimeter
//		Circle Area
//		Circle Circumference
		
		int length,width,rectangleArea,rectanglePerimeter;//Rectangle Properties
		double circleArea,circleCircumference;//Circle Properties
		Scanner so=new Scanner(System.in);
		System.out.println("Which You Want Calculate\n1.Circle\n2.Rectangle");
		int choose=so.nextInt();
		if(choose==1)
		{
			System.out.println("Choose:\n1.Area\n2.Circumference");
			int choice=so.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter Radius");
				int areaRadius=so.nextInt();
				circleArea=(Math.PI*(areaRadius*areaRadius));
				System.out.println("Circle Area : "+circleArea);
				break;
			case 2:
				System.out.println("Enter Radius");
				int circumferenceRadius=so.nextInt();
				circleCircumference=2*Math.PI*circumferenceRadius;
				System.out.println("Circle Circumference : "+circleCircumference);
				break;
			}
		}
		else if(choose==2)
		{
			System.out.println("Choose:\n1.Area\n2.Perimeter");
			int choice=so.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter Length");
				length=so.nextInt();
				System.out.println("Enter Width");
				width=so.nextInt();
				rectangleArea=length*width;
				System.out.println("Rectangle Area : "+rectangleArea);
				break;
			case 2:
				System.out.println("Enter Length");
				length=so.nextInt();
				System.out.println("Enter Width");
				width=so.nextInt();
				rectanglePerimeter=2*(length+width);
				System.out.println("Rectangle Perimeter : "+rectanglePerimeter);
				break;
			}
		}
		else {
			System.out.println("Invalid Option.");
		}
		so.close();

	}

}
