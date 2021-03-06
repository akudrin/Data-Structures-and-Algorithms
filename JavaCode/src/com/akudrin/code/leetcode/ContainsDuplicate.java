package com.akudrin.code.leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {

	public boolean containsDuplicateHashSet(int[] nums) {
		HashSet<Integer> numbers = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (numbers.contains(nums[i])) {
				return true;
			}
			numbers.add(nums[i]);

		}
		return false;

	}

	public boolean containsDuplicateSorting(int[] nums) {
		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

	}

}
