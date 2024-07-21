package PACKAGEJAVA;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		Studentdemo student = new Studentdemo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name : ");
		student.setName(sc.nextLine());
		System.out.println("Enter your ID : ");
		student.setid(sc.nextInt());
		System.out.println("The Name is : "+student.getName());
		System.out.println("The ID is : "+student.getid());
		sc.close();
	}
}