package com.akudrin.code.testing;

import java.util.Random;

public class TestClass {

	private static int getPivot(int low, int high) {
		Random rand = new Random();
		return rand.nextInt((high - low) + 1) + low;
	}

	public static void main(String[] args) {

		Random rand = new Random();
		// System.out.println(rand.nextInt(2));

		int border = 1;
		// System.out.println(border++);

		System.out.println(getPivot(4, 4));

	}

}
