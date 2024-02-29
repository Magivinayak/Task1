package tasktwo;
import java.util.Scanner;

class Account{
	
	//instance variable
	double balance = 0 ,depositAmount , withdrawAmount ; 
	
	//no argument constructor
	Account(){
		System.out.println("**No-Argumented Constructor**");
	}
	
	//two Arguments Constructor
	Account(String name,long accountNumber ,double depositAmount,double withdrawnAmount ){	
		this.depositAmount = depositAmount;
		this .withdrawAmount = withdrawnAmount;
		System.out.println();
		System.out.println("**Two Argumented Constructor **\n" );
		System.out.println("NAME : "+name+"  Account Number : "+accountNumber+"  Deposited Amount : " +depositAmount+"  Withdrawn Amount : " +withdrawAmount);
		
	}		
	//instance method for deposit amount
	void deposit() {
		balance = depositAmount;
		
	}
	
	//instance method for withdraw
	void withdraw() {
		balance = balance - withdrawAmount;
	}
	
	//instance method to display balance
	double display() {
		return balance;	//returning balance amount
	}
}


public class Question3 {

	public static void main(String[] args) {
		
		double userBalance;
		//object creation
		Account obj = new Account();// no arguments constructor
		userBalance=obj.display();		
		System.out.println();
		//Scanner class declaration for input 
		Scanner input = new Scanner(System.in);
		System.out.println("Type your Name ");
		String name = input.nextLine();
		System.out.println("Type your Account number ");
		long accountNumber = input.nextLong();	
		System.out.println("Enter Amount to be Deposited ");
		double userAmount = input.nextDouble();//input 
		System.out.println("Enter the Amount to be withdrawn");
    	double userWithdraw = input.nextDouble();//input	
    	input.close();
    	
		Account objCons = new Account(name ,accountNumber,userAmount,userWithdraw);//two arguments constructor creation
		
		objCons.deposit();//calling deposit instance method by object reference
		objCons.withdraw();//calling withdraw instance method by object reference
		userBalance = objCons.display();//getting balance amount
		System.out.println("Balance Amount is : " + userBalance);	

		
	}

}
