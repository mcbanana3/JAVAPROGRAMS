package p1;

public class Checker {
	static int num;
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
	
	public boolean isPalindrome(int num) {
		Utility rev = new Utility();
		if(rev.Reverse(num) == num) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
