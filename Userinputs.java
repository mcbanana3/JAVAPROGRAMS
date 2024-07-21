package JAVACTOOOD;

import java.util.Scanner;

public class Userinputs {
	public static void main(String[] argv) {
		 float a,b;
		 System.out.println("Enter the Value 'A' : ");
		 Scanner r1 = new Scanner(System.in);
		 a = r1.nextFloat();
		 System.out.println("Enter the Value 'B' : ");
		 Scanner r2 = new Scanner(System.in);
		 b = r2.nextFloat();
		 System.out.println("The Value of A is : "+a + " and Value of B is : "+b);
	}
}
