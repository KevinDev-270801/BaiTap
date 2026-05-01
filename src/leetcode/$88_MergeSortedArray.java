package leetcode;

import java.util.Arrays;

public class $88_MergeSortedArray {

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int m1 = m -1 ;
		int n1 = n -1;
		int c = m1 + n1 + 1;
		while(m1 >=0 && n1 >= 0) {
			if(nums1[m1] >= nums2[n1]) {
				nums1[c] = nums1[m1];
				c--;
				m1--;
			}else {
				nums1[c] = nums2[n1];
				c--;
				n1--;
			}
		}
		while(n1 >= 0) {
			nums1[c--] = nums2[n1--];
		}
	}

	public static void main(String[] args) {
		int[] nums1 = {4,5,6,0,0,0};
		int[] nums2 = {1,2,3};
		int n = 3, m =3;
		merge(nums1, m, nums2, n);
		System.out.println(Arrays.toString(nums1));
	}

}
