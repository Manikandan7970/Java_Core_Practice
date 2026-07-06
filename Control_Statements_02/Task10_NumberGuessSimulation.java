package Control_Statements_02;

import java.util.Scanner;

public class Task10_NumberGuessSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Task 10 – Number Guess Simulation
//		Objective
//
//		Simulate guessing game.
//
//		Requirements
//
//		Store secret number
//
//		25
//
//		Ask user repeatedly
//
//		Enter Guess
//
//		Until correct.
//
//		If wrong
//
//		Try Again
//
//		If correct
//
//		Congratulations
//		Constraint
//
//		Use only
//
//		do-while loop
		Scanner so=new Scanner(System.in);
		System.out.println("Number Guess Simulation");
		int secretnum=70;
		int guessnum;
		int i=0;
		do {
			System.out.println("Enter Guess");
			guessnum=so.nextInt();
			if(guessnum==secretnum)
			{
				System.out.println("Congratulations.");
				break;
			}
			else {
				System.out.println("Try Again.");
			}
			i++;
		}while(i<=secretnum);
		
		so.close();
	}

}
