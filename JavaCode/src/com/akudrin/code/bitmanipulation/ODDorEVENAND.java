package com.akudrin.code.bitmanipulation;

//Java program to check for even or odd
//using Bitwise AND operator
class ODDorEVENAND {

//Returns true if n is even, else odd
	static boolean isEven(int n) {
		// n&1 is 1, then odd, else even
		return ((n & 1) != 1);
	}

	public static void main(String[] args) {
		int n = 101;
		System.out.print(isEven(n) == true ? "Even" : "Odd");
	}
}
