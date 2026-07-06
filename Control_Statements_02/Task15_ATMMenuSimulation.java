package Control_Statements_02;

import java.util.Scanner;

public class Task15_ATMMenuSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Task 15 – ATM Menu Simulation
//		Objective
//
//		Build a menu-driven ATM console.
//
//		Menu
//
//		1. Balance
//
//		2. Deposit
//
//		3. Withdraw
//
//		4. Exit
//
//		Features
//
//		Initial balance = 5000
//		Deposit amount
//		Withdraw amount
//		Check insufficient balance
//		Display updated balance
//		Repeat menu until Exit
//		Constraint
//
//		Use
//
//		switch
//		do-while
//		break
		
		Scanner so=new Scanner(System.in);
		int accountBalance=5000;
		System.out.println("ATM Menu Simulation");
		do {
			System.out.println("Menu\n1.Balance\n2.Deposite\n3.Withdraw\n4.Exit");
			int choice=so.nextInt();
			switch(choice)
			{
			case 1:System.out.println("Account Balance : "+accountBalance);
			break;
			case 2:System.out.println("Enter Your Depsoite Amount.");
			int depAmount=so.nextInt();
			accountBalance+=depAmount;
			System.out.println("Deposited Amount In Your Acccount "+depAmount+"Rs.");
			break;
			case 3:System.out.println("Enter Your Withdraw Amount.");
			int withAmount=so.nextInt();
			accountBalance-=withAmount;
			System.out.println("Withdraw Amount In Your Acccount "+withAmount+"Rs.");
			break;
			case 4:System.out.println("Exit...");
			so.close();
			return;
			}
		}while(true);
		

	}

}
