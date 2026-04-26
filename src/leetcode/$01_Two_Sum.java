package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class $01_Two_Sum {

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>()	;
		for(int i=0; i<nums.length; i++) {
			int value = target - nums[i];
			if(map.containsKey(value)) {
				return new int[] {map.get(value), i};
			}
			map.put(nums[i], i);
		}
		return new int[] {0,0};
	}

	public static void main(String[] args) {
		int[] nums = {3,3};
		int target = 6;
		
		System.out.println(Arrays.toString(twoSum(nums, target)));
	}

}
