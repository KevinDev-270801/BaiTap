package leetcode;

public class $9_PalindromeNumber {

	public static boolean isPalindrome(int x) {
		if(x < 0 )	return false;
		int pre = x;
		int sum = 0;
		while(x > 0) {
			int unit = x % 10;
			sum = sum * 10 + unit;
			x /= 10; 
		}
		return sum == pre;
	}

	public static void main(String[] args) {
		int x = -121;
		System.out.println(isPalindrome(x));
	}

}
