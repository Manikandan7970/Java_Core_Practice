package Methods_03;

public class Task05_BankingSystem {
	double bankBalance=50000;
	
	public void deposit(double depAmount)
	{
		bankBalance+=depAmount;
		if(bankBalance>50000)
		{
			System.out.println("Deposited Amount "+depAmount+"Rs."); 
		}
		else {
			System.out.println("Not Successfully Desposited.");
		}
	}
	
	public void withdraw(double withAmount) {
		bankBalance-=withAmount;
		if(bankBalance<50000)
		{
			System.out.println("Withdraw Amount "+withAmount+"Rs."); 
		}
		else {
			System.out.println("Not Successfully Withdraw.");
		}
	}
	
	public double checkBalance()
	{
		return this.bankBalance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		Task 5 – Banking System
//		Objective
//
//		Build a simple banking program.
//
//		Methods
//		deposit()
//		withdraw()
//		checkBalance()
//		
//		Concepts
//		Parameters
//		Void methods
//		Return methods
		
		Task05_BankingSystem o=new Task05_BankingSystem();
		o.deposit(2300);
		o.withdraw(4500);
		System.out.println("Account Balance : "+o.checkBalance());

	}

}
