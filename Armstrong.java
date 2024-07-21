package JAVACTOOOD;

import java.util.Scanner;

public class Armstrong {
	
	public void displayAll(int n) {
		System.out.println("The Numbers are : ");
		for(int i = 0; i <= n; i++) {
			int count = 0;
			int sum = 0;
			int temp = i;
			while(temp > 0) {
				temp = temp / 10;
				count++;
			}
			if(count >= 2) {
				temp = i;
				while(temp > 0) {
					int r = temp % 10;
					sum = sum + (r*r*r);
				}
				if(sum == i) {
					System.out.println(i);
				}
			}
			else {
				System.out.println(i);
			}
		}
	}
	
	public void checkArmstrong(int num) {
		int sum = 0, temp = num;
		while(temp > 0) {
			int r = temp % 10;
			temp = temp / 10;
			sum = sum + (r * r * r);
		}
		
		if(sum == num) {
			System.out.println("True");
		}
		
		else {
			System.out.println("False");
		}
	}
	
	public static void main(String[] argv) {
		System.out.println("Enter the Value to Check : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Enter the number to print the values till a Number : ");
		int display = sc.nextInt();
		Armstrong sr = new Armstrong();
		sr.checkArmstrong(num);
		sr.displayAll(display);
	}
}
