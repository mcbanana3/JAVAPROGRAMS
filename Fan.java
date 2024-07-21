package JAVACTOOOD;

import java.util.Scanner;

public class Fan {
	
	int speed;
	boolean state;
	double rad;
	
	public int increaseSpeed(int speed, boolean state) {
		if(state) {
			speed++;
			return speed;
		}
		
		else {
			return 0;
		}
	}
	
	public static void main(String[] argv) {
		Fan sw = new Fan();
		System.out.println("Enter the Speed of the Fan : ");
		Scanner speedref = new Scanner(System.in);
		sw.speed = speedref.nextInt();
		System.out.println("Enter the current Status of the Fan : ");
		Scanner boolref = new Scanner(System.in);
		sw.state = boolref.hasNext();
		System.out.println("Enter the radius of fan : ");
		Scanner radref = new Scanner(System.in);
		sw.rad = radref.nextDouble();
		sw.speed = sw.increaseSpeed(sw.speed, sw.state);
		System.out.println("The Increased Speed of Fan is : "+sw.speed);
	}
}
