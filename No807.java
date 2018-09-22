public class No807 {
    public static void main(String[] args) {
        Solution.maxIncreaseKeepingSkyline(new int[][]{{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}});
    }
}

class Solution {
    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int row[] = new int[grid.length];
        int col[] = new int[grid[0].length];
        int count2 = 0;
        for (int i = 0; i < grid.length; i++) {
            int max = 0;
            for (int j = 0; j < grid[0].length; j++) {
                count2 += grid[i][j];
                if (grid[i][j] > max)
                    max = grid[i][j];
            }
            row[i] = max;
        }
        for (int i = 0; i < grid[0].length; i++) {
            int max = 0;
            for (int j = 0; j < grid.length; j++) {
                if (grid[j][i] > max)
                    max = grid[j][i];
            }
            col[i] = max;
        }

        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                count += (row[i] > col[j] ? col[j] : row[i]);
            }
        }
        return count - count2;
    }
}
