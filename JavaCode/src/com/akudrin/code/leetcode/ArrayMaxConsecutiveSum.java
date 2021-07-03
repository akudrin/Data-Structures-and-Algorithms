package com.akudrin.code.leetcode;

public class ArrayMaxConsecutiveSum {

	public static int arrayMaxConsecutiveSum(int[] inputArray) {
		int max_sum = inputArray[0];
		int current_sum = max_sum;

		for (int i = 0; i < inputArray.length; i++) {
			current_sum = Math.max(inputArray[i] + current_sum, inputArray[i]);
			max_sum = Math.max(current_sum, max_sum);
		}
		return max_sum;
	}

	public static void main(String[] args) {
		int sum = arrayMaxConsecutiveSum(new int[] { -2, 2, 5, -11, 6 });
		System.out.println(sum);
	}

}
