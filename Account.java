package PACKAGEJAVA;

import java.util.Scanner;

public class Account {
	static String Name;
	static long cardno;
	static int pin;
	
	public static void accountDetails() {
		System.out.println("The Name is : "+Name);
		System.out.println("The Card No is : "+cardno);
		System.out.println("The Pin is : "+pin);
	}
	
	public static void main(String[] args) {
		System.out.print("Enter the Name : ");
		Scanner sw = new Scanner(System.in);
		Name = sw.nextLine();
		System.out.print("Enter the Card No : ");
		cardno = sw.nextLong();
		System.out.print("Enter your Pin : ");
		pin = sw.nextInt();
		accountDetails();
		sw.close();
	}
}
