package com.akudrin.code.array;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[10];
		Arrays.fill(arr1, 20);

		int[] arr2 = new int[10];
		Arrays.fill(arr2, 20);

		System.out.println("Compare two arrays as objects " + arr1.equals(arr2));

		System.out.println("Compare arrays for content " + Arrays.equals(arr1, arr2));

		System.out.println("Array completely filled" + " with 20\n" + Arrays.toString(arr1));

		// initializing an array original
		int[] org = new int[] { 1, 2, 3 };

		System.out.println("Original Array");
		for (int i = 0; i < org.length; i++)
			System.out.print(org[i] + " ");

		// copying array org to copy
		int[] copy = Arrays.copyOf(org, 5);

		// Changing some elements of copy
		// copy[3] = 11;
		// copy[4] = 55;

		System.out.println("\nNew array copy after modifications:");
		for (int i = 0; i < copy.length; i++)
			System.out.print(copy[i] + " ");

		// intializing an array arr1
		short[] arrA = new short[] { 15, 10, 45 };

		// printing the array
		System.out.println("Printing 1st array:");
		for (int i = 0; i < arrA.length; i++) {
			System.out.println(arrA[i]);
		}

		// copying array arr1 to arr2 with range of index from 1 to 3
		short[] arrB = Arrays.copyOfRange(arrA, 1, 3);

		// printing the array arr2
		System.out.println("Printing new array:");
		for (int i = 0; i < arrB.length; i++) {
			System.out.println(arrB[i]);
		}

	}

}
