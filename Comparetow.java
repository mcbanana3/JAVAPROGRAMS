package JAVACTOOOD;

import java.util.Scanner;

public class Comparetow {
	
	public static void main(String[] argv) {
		 int a,b;
		 System.out.println("Enter the Value 'A' : ");
		 Scanner r1 = new Scanner(System.in);
		 a = r1.nextInt();
		 System.out.println("Enter the Value 'B' : ");
		 Scanner r2 = new Scanner(System.in);
		 b = r2.nextInt();
		 System.out.println("The Value of A is : "+a + " and Value of B is : "+b);
		 if(a > b) {
			 System.out.println("A is big and value is : "+a);
		 }
		 
		 else {
			 System.out.println("B is big and value is : "+b);
		 }
	}
}
