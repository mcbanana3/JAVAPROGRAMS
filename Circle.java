package JAVACTOOOD;

import java.util.Scanner;
  
public class Circle {
	
	int rad;
	
	public void area() {
		double ar = 3.142 * (rad * rad);
		System.out.println("The Area of Circle is : "+ar);
	}
	
	public void perimeter() {
		double pr = 2 * 3.142 * rad;
		System.out.println("The Perimeter of Circle is : "+pr);
	}
	
	public static void main(String[] argv) {
		System.out.println("Enter the Radius : ");
		Scanner le = new Scanner(System.in);
		Circle cc = new Circle();
		cc.rad = le.nextInt();
		cc.area();
		cc.perimeter();
	}
}
