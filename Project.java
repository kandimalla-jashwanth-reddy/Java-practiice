package OwnProject;
import java.util.Scanner;

public class Project {
	static int amount=0;
	 
	public static void Emiamount(double loanAmount, double interestRate, int timePeriod) { 
		double interest = (timePeriod * interestRate * loanAmount) / 100;

        // Calculate the total amount to be paid
        double totalAmount = interest + loanAmount;

        // Calculate the EMI (monthly installment)
        double emi = totalAmount / (timePeriod * 12); // Assuming timePeriod is in years

        System.out.printf("The EMI amount per month is: %.2f\n", emi);
	}
	
	 
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
//		Project b=new Project();
		System.out.println("1.If are the farmer.");
		System.out.println("2.If are the  private employe.");
		System.out.println("3.If are the  government employe.");
		System.out.println("4.If are the  self employe.");
		System.out.println("5.If are the student.");
		System.out.println("Please Enter the number to choose your category:-");

	
		int  a=sc.nextInt();
		double interest;
		System.out.println("Enter the amount the of loan required:-");
		double amount=sc.nextDouble();
		System.out.println("Enter the time of loan:-");
		int time=sc.nextInt();
		
		switch(a) {
		
		case 1:
			System.out.println("Your are the farmer.");
			interest=4.0;
			Emiamount(amount,interest,time);
			break;
		case 2:
			System.out.println("Your are the  private employe.");
			 interest=8.0;
			 Emiamount(amount,interest,time);
			break;
		case 3:
			System.out.println("Your are the  government employe.");
			interest=15.0;
			Emiamount(amount,interest,time);
			break;
		case 4:
			System.out.println("Your are the  self employe.");
			 interest=10.0;
			 Emiamount(amount,interest,time);
			break;
		case 5:
			System.out.println("Your are the student.");
			 interest=5.;
			 Emiamount(amount,interest,time);
			 
			break;
		default:
			System.out.println("there no other chance.");
		}
		
	}
		
	}
