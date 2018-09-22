public class No832 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int [][]arr=solution.flipAndInvertImage(new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}});
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.println(arr[i][j]);
            }
        }

    }
}

class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int n = A[0].length;
            for (int j = 0; j < n / 2; j++) {
                int temp;
                temp = A[i][j];
                A[i][j] = A[i][n - j - 1];
                A[i][n - j - 1] = temp;
            }
            for (int j = 0; j < n; j++) {
                if (A[i][j] == 0)
                    A[i][j] = 1;
                else
                    A[i][j] = 0;

            }

        }
        return A;
    }
}
