package Methods_03;

public class Task06_AreaCalculatorOverloading {
	
	public void calculateArea(int side)
	{
		int squareArea=side*side;
		System.out.println("Area Of Square : "+squareArea);
	}
	public void calculateArea(int length, int width)
	{
		int rectangleArea=length*width;
		System.out.println("Area Of Rectangle : "+rectangleArea);
	}
	
	public void calculateArea(double radius)
	{
		double circleArea=Math.PI*radius*radius;
		System.out.println("Area Of Circle : "+circleArea);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Task 6 – Area Calculator (Method Overloading)
//		Objective
//
//		Calculate different shapes using overloaded methods.
//
//		Methods
//		calculateArea(int side)
//		calculateArea(int length, int width)
//		calculateArea(double radius)
//		
//		Concepts
//		Method Overloading
		
		Task06_AreaCalculatorOverloading o=new Task06_AreaCalculatorOverloading();
		o.calculateArea(10);
		o.calculateArea(10, 12);
		o.calculateArea(8);

	}

}
