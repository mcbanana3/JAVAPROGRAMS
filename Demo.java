package p2;

import p1.Checker;
import p1.DisplayAll;
import p1.Utility;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		boolean shouldRun = true;
		Checker check = new Checker();
		DisplayAll all = new DisplayAll();
		Utility utili = new Utility();
		Scanner refchoice = new Scanner(System.in);
		
		while(shouldRun) {
			System.out.println("[1]Check Armstrong [2]Check Palindrome [3]Print Reverse [4]Display Palindrome [5]Display Armstrong [6]Exit");
			System.out.println("Enter your Choice : ");
			int choice = refchoice.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Enter the Num : ");
					Scanner Armref = new Scanner(System.in);
					int checkarm = Armref.nextInt();
					check.checkArmstrong(checkarm);
					break;
					
				case 2:
					System.out.println("Enter the Num : ");
					Scanner palref = new Scanner(System.in);
					int checkpal = palref.nextInt();
					System.out.println(check.isPalindrome(checkpal));
					break;
					
				case 3:
					System.out.println("Enter the Num : ");
					Scanner palrev = new Scanner(System.in);
					int palreve = palrev.nextInt();
					System.out.println(utili.Reverse(palreve));
					break;
					
				case 4:
					System.out.println("Enter the Num : ");
					Scanner revpal = new Scanner(System.in);
					int pal = revpal.nextInt();
					all.DisplayPalindrome(pal);
					break;
					
				case 5:
					System.out.println("Enter the Num : ");
					Scanner armall = new Scanner(System.in);
					int allarm = armall.nextInt();
					all.DisplayPalindrome(allarm);
					break;
					
				case 6:
					System.out.println("Thank You");
					shouldRun=false;
					break;
					
				default:
					System.out.println("Enter the correct Value : ");
					break;
			}
			
		}
		
		refchoice.close();
	}
}
