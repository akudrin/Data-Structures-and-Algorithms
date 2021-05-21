package com.akudrin.code.introtodt;

public class NumericFunctions {
	public static long factorial(long n) {
		long result = 1;
		for (int i = 2; i <= n; i++) {
			result *= i;
		}
		return result;
	}

	public static long pow(long m, long n) {
		long result = 1;

		for (; n != 0; --n) {
			result = result * m;
		}
		return result;

	}

	public static void main(String[] args) {

		System.out.println();

		for (int m = 1; m < 10; m++) {
			System.out.println();
			for (int n = 1; n < 10; n++) {
				System.out.print(pow(m, n));

			}

		}

// for (int n = 0; n <= 20; n++) {
//			System.out.print(n);
//			System.out.print(" ");
//			System.out.println(factorial(n));
//		}

//		for (int i = 1; i <= 100; i++) {
//			System.out.print(i);
//		}
//		System.out.println();
//		for (int i = 0; i < 10; i++) {
//			System.out.print(i);
//		}
//		System.out.println();
//		for (int i = 0; i <= 100; i++) {
//			if (i % 2 == 0)
//				System.out.print(i);
//		}
//		System.out.println();
//		for (int i = 1; i < 1024; i *= 2) {
//			if (i == 1) {
//				System.out.print(1);
//			}
//			System.out.print(i * 2);
//		}
//		System.out.println();
//		for (int i = 1; i < 10; i++) {
//			System.out.print(i);
//		}
//		System.out.println();
//		for (int i = 10; i > 0; i--) {
//			System.out.print(i);
//		}
//
//		System.out.println();
//		for (int i = 2; i <= 1024; i *= 2) {
//			System.out.print(i);
//		}

	}
}