public class No867 {
    public static void main(String [] args){

    }
}
class Solution {
    public static int[][] transpose(int[][] A) {
        int [][]arr=new int[A[0].length][A.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=A[j][i];
            }
        }
        return arr;
    }
}
