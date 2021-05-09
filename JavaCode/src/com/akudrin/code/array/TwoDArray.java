package com.akudrin.code.array;

public class TwoDArray {

	public static void main(String[] args) {

		int[][] arr1 = new int[10][20];
		arr1[0][0] = 1;

		System.out.println("arr[0][0] = " + arr1[0][0]);

		int[][] arr = { { 1, 2 }, { 3, 4 } };

		for (int i = 0; i < 2; i++)
			for (int j = 0; j < 2; j++)
				System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
	}

}
