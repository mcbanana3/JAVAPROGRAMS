package p1;

public class Utility {
	static int num;
	public int Reverse(int num) {
		int temp = num, rev = 0;
		while(temp > 0) {
			int r = temp % 10;
			temp = temp / 10;
			rev = rev * 10 + r;
		}
		return rev;
	}
}
