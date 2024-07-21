package JAVACTOOOD;

import java.util.Scanner;

public class Stringinput {
	
	public static void main(String[] argv) {
		 String name;
		 System.out.println("Enter your Name : ");
		 Scanner r1 = new Scanner(System.in);
		 name = r1.nextLine();
		 System.out.println("The Name is : "+name);
	}
}
