package com.akudrin.code.testing;

public class TestClass {

	public static void main(String[] args) {
		String s = "Hello";
		s = "Bye";
		System.out.println(s);

		String NewString = "Hello";
		NewString.concat("World");
		System.out.println(NewString);

		char a = 'Z';
		char c = 'A';
		System.out.println(a - c);

		System.out.println('T' - 'A');

		System.out.println(23 % 26);
	}

}
