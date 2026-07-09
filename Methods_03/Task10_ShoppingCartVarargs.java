package Methods_03;

import java.util.Scanner;

public class Task10_ShoppingCartVarargs {
	
	public static double calculateTotal(double prodPrice[])
	{
		double total=0;
		for(int i=0;i<prodPrice.length;i++)
		{
			total+=prodPrice[i];
		}
		return total;
	}
	public void displayBill(double prodPrice[],String prodName[])
	{
		System.out.println("Product Bill.");
		for(int i=0;i<prodPrice.length;i++)
		{
			System.out.println("Product "+(i+1)+" Name : "+prodName[i]);
			System.out.println("Product "+(i+1)+" Price : "+prodPrice[i]+"Rs.");
		}
		System.out.println("Total Amount : "+calculateTotal(prodPrice)+"Rs.");
		
	}
	

	public static void main(String[] args) {
//		// TODO Auto-generated method stub		
//		Task 10 – Shopping Cart System (Varargs)
//		Objective
//
//		Calculate total bill using variable arguments.
//
//		Methods
//		calculateTotal(double... prices)
//		displayBill()
//		Example
//
//		Input
//
//		100
//		250
//		300
//		150
//
//		Output
//
//		Total : 800
		
//		Concepts
//		Varargs (...)
//		Loops
//		Return value
		Scanner so=new Scanner(System.in);
		Task10_ShoppingCartVarargs o=new Task10_ShoppingCartVarargs();
		System.out.println("How many product will to clalculate.");
		int prodCount=so.nextInt();
		String prodName[]=new String[prodCount];
		double prodPrice[]=new double[prodCount];
		for(int i=0;i<prodCount;i++)
		{
			System.out.println("Enter Product "+(i+1)+" Name.");
			so.nextLine();
			prodName[i]=so.nextLine();
			System.out.println("Enter Product "+(i+1)+" Price.");
			prodPrice[i]=so.nextDouble();
		}
		o.displayBill(prodPrice, prodName);
		so.close();
		
		
		
		
	}

}
