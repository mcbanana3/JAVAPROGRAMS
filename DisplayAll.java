package p1;

public class DisplayAll {
	static int num;
	public void DisplayPalindrome(int n) {
		System.out.println("The Numbers are : ");
		Checker ch = new Checker();
		for(int i = 0; i <= n; i++) {
			if(ch.isPalindrome(i) == true) {
				System.out.println(i);
			}
		}
	}
	
	public void displayArmstrong(int n) {
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
}
