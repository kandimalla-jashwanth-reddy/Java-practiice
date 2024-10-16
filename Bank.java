package Jashwanth.Methods;
import java.util.Scanner;

public class Bank {
	static  int currentBalance=0;
	public static void greetCustomer() {
//		System.out.println("Hello,Welcome to the our bank");
	}
	public  void deposit(int amount) {
		currentBalance=currentBalance +amount;
		System.out.println("Amount is deposited successfully.");
	}
	public static void withdrawal(int amount) {
		currentBalance=currentBalance-amount;
		System.out.println("Amount is withdrawn successfully.");
	}
	public int getCurrentBalance() {
		 return currentBalance;
		
	}
	public static  void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter depositing  amount:-");
		int a=sc.nextInt();
		Bank bank= new Bank();
		greetCustomer();
		bank.deposit(a);
		System.out.println("Remaing balance:"+currentBalance);
		
		System.out.println("enter amount of withdrawal:-");
		int b=sc.nextInt();
		bank.withdrawal(b);
		System.out.println("Remaining balance is:"+currentBalance);
		bank.getCurrentBalance();
		System.out.println("'Thank You for choosing  the our Bank.'");
		

	}

}
