package JAVACTOOOD;

import java.util.Scanner;

public class Exception {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter A and B : ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    try{
        System.out.println("Addition is : "+(a+b));
    }
    catch(ArithmeticException e){
    	System.out.println("EXception: "+e.getMessage());
    }
    System.out.println("Multiplication is : "+(a*b));
    System.out.println("Division is : ",+(a/b));
    System.out.println("Modulo is : "+(a%b));
    sc.close();
}