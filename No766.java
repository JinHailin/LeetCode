package com.company;

public class No766 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2},{2,2}};
        System.out.println(Solution.isToeplitzMatrix(arr));
    }
}

class Solution {
    public static boolean isToeplitzMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int min = rows > columns ? columns : rows;
        int current = matrix[0][0];
        int x = 0;
        int y = 0;

        for (int i = 0; i < columns; i++) {
            current = matrix[0][i];
            x = 0;
            y = i;
            while (x < rows - 1 && y < columns - 1) {
                if (matrix[++x][++y] != current) {
                    return false;
                }
            }
        }
        for(int j=0;j<rows;j++){
            current=matrix[j][0];
            x=j;
            y=0;
            while (x < rows - 1 && y < columns - 1){
                if (matrix[++x][++y] != current) {
                    return false;
                }
            }
        }
        return true;
    }
}
