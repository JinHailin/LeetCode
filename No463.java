package com.company;

class Solution {
    public static int islandPerimeter(int[][] grid) {
        int sum = 0;
        int rows = grid.length;
        int columns = grid[0].length;
        int near;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (grid[i][j] == 1) {
                    near = 0;
                    if (i != 0 && grid[i - 1][j] == 1) {
                        near++;
                    }
                    if (i != rows - 1 && grid[i + 1][j] == 1) {
                        near++;
                    }
                    if (j != 0 && grid[i][j - 1] == 1) {
                        near++;
                    }
                    if (j != columns - 1 && grid[i][j + 1] == 1) {
                        near++;
                    }
                    sum += 4 - near;
                }
            }
        }
        return sum;
    }
}

public class No463 {

    public static void main(String[] args) {
        int a[][] = new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};

        System.out.println(Solution.islandPerimeter(a));
    }
}
