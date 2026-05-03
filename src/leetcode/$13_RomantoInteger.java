package leetcode;

import java.util.HashMap;
import java.util.Map;

public class $13_RomantoInteger {
	public static int getValue(char c) {
		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0;
		}
	}
	
	public static int romanToInt(String s) {
		int sum = 0;
		int prev = 0;
		
		for (int i=s.length()-1; i>=0; i--) {
			int curr = getValue(s.charAt(i));
			
			if(curr < prev) sum -= curr;
			else sum += curr;
			
			prev = curr;
		}
		return sum;
	}

//	public static int romanToInt(String s) {
//		if (s.length() == 0)
//			return 0;
//		Map<Character, Integer> map = new HashMap<>();
//		map.put('I', 1);
//		map.put('V', 5);
//		map.put('X', 10);
//		map.put('L', 50);
//		map.put('C', 100);
//		map.put('D', 500);
//		map.put('M', 1000);
//
//		int sum = 0;
//		int prev = 0;
//
//		for (int i = s.length() - 1; i >= 0; i--) {
//			int curr = map.get(s.charAt(i));
//			if (curr < prev) {
//				sum -= curr;
//			} else
//				sum += curr;
//
//			prev = curr;
//		}
//
//		return sum;
//	}

	public static void main(String[] args) {
		String s = "MCMXCIV";
		System.out.println(romanToInt(s));

	}

}
