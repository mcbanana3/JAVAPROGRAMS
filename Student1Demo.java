package JAVACTOOOD;

import java.util.Scanner;

public class Student1Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.print("Enter your Choice : ");
			choice = sc.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Enter NAME : ");
					String name = sc.nextLine();
					System.out.println("Enter your ID : ");
					int id = sc.nextInt();
					Student1 s = new Student1(name, id);
					break;
					
				case 2:
					Student1 s1 = new Student1();
					System.out.println(s.toString());
					break;
					
				case 3:
					System.out.println("Exiting the Program!!:))");
					break;
					
				default:
					System.out.println("Enter Correct Option!");
			}
		}while(choice != 4);
		sc.close();
	}
}
