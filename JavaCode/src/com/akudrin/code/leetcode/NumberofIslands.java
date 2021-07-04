package com.akudrin.code.leetcode;

public class NumberofIslands {

	public int numIslands(char[][] grid) {
		int count = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == '1') {
					count += 1;
					callBFS(grid, i, j);
				}

			}
		}
		return count;

	}

	public void callBFS(char[][] grid, int i, int j) {
		if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') {
			return;
		}
		grid[i][j] = '0';
		callBFS(grid, i + 1, j);// down
		callBFS(grid, i - 1, j);// up
		callBFS(grid, i, j - 1);// left
		callBFS(grid, i, j + 1);// right
	}

	public static void main(String[] args) {

	}

}
