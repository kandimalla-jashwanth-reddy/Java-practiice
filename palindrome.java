package practice.test;
import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:- ");
		int a=sc.nextInt();
		int b=a;
		int x=0;
		while(a>0) {
			int r=a%10;
			x=(x*10+r);
			a=a/10;			
		}
		if(x==b) {
			System.out.println("Yes,It is a palindrome.");
		}else {
			System.out.println("No,It is not palindrome.");

		}
	

	}

}
