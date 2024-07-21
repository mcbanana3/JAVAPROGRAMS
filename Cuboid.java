package JAVACTOOOD;

import java.util.Scanner;
  
public class Cuboid {
	
	int len,br,he;
	
	public void area() {
		int ar = 2*(len*he + len*br + he*br);
		System.out.println("The Area of Cuboid is : "+ar);
	}
	
	public void perimeter() {
		int pr = 4*(len+br+he);
		System.out.println("The Perimeter is : "+pr);
	}
	
	public static void main(String[] argv) {
		System.out.println("Enter the Lenght, Breadth, Height : ");
		Scanner le = new Scanner(System.in);
		Cuboid cc = new Cuboid();
		cc.len = le.nextInt();
		cc.br = le.nextInt();
		cc.he = le.nextInt();
		cc.area();
		cc.perimeter();
	}
}
