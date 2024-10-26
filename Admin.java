package Jashwanth.Inheritance;

public class Admin extends Developer{
	
	//adding or deleting the product 
	public void manage() {
		read();
		write();
		System.out.println("Manage code");
	}
	public void read() {
		System.out.println("admin read code.");
	}
}
