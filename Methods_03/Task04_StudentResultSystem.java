package Methods_03;

import java.util.Scanner;

public class Task04_StudentResultSystem {
	
	public int calculateTotal(int tamil,int english,int maths,
			int science,int socialScience)
	{
		return tamil+english+maths+science+socialScience;
	}
	
	public int calculateAverage(int totalMarks)
	{
		int averageMark=totalMarks/5;
		return averageMark;
	}
	
	public double calculatePercentage(double totalMarks)
	{
		double percentage=((totalMarks/500.0f)*100);
		return percentage;
	}
	public void displayGrade(double percentage)
	{
		if(percentage>=90 && percentage<=100)
		{
			System.out.println("A+ Grade.");
		}
		else if(percentage>=80 && percentage<=89)
		{
			System.out.println("A Grade.");
		}
		else if(percentage>=70 && percentage<=79)
		{
			System.out.println("B Grade.");
		}
		else if(percentage>=60 && percentage<=69)
		{
			System.out.println("C Grade.");
		}
		else if(percentage>=50 && percentage<=59)
		{
			System.out.println("D Grade.");
		}
		else if(percentage<50)
		{
			System.out.println("E Grade.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Task 4 – Student Result System
//		Objective
//
//		Create a result processing system.
//
//		Methods
//		
//		calculateTotal()
//		calculateAverage()
//		calculatePercentage()
//		displayGrade()
//		
//		Concepts
//		Method chaining
//		Return values
		Scanner so=new Scanner(System.in);
		System.out.println("Student Result System.");
		System.out.println("Enter 5 Subject Marks"
				+ "\n1.Tamil\n2.English\n3.MatheMatics\n4.Science\n5.Social Science");
		System.out.println("Enter your Tamil subject mark.");
		int tamil=so.nextInt();
		System.out.println("Enter your English subject mark.");
		int english=so.nextInt();
		System.out.println("Enter your MatheMatics subject mark.");
		int maths=so.nextInt();
		System.out.println("Enter your Science subject mark.");
		int science=so.nextInt();
		System.out.println("Enter your Social Science subject mark.");
		int socialScience=so.nextInt();
		Task04_StudentResultSystem o=new Task04_StudentResultSystem();
		System.out.println("Total Mark : "+o.calculateTotal
				(tamil, english, maths, science, socialScience));
		System.out.println("Average Mark : "+o.calculateAverage(o.calculateTotal
				(tamil, english, maths, science, socialScience)));
		System.out.println("Percentage : "+o.calculatePercentage(o.calculateTotal
				(tamil, english, maths, science, socialScience)));
		o.displayGrade(o.calculatePercentage(o.calculateTotal
				(tamil, english, maths, science, socialScience)));
		
		
		
		

	}

}
