package JAVACTOOOD;

import java.util.Scanner;

public class Cuboiddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuboid1 cub = new Cuboid1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter L, B, H : ");
		double l = sc.nextDouble();
		double b = sc.nextDouble();
		double h = sc.nextDouble();
		System.out.println("The Volume is : "+cub.volume(l, h, b));
		sc.close();
	}
}