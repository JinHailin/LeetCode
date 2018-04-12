package com.company;

class Solution {
    public static int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        int n = s.length();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (s.charAt(i) - '0') == 1 ? 0 : 1;
        }
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += Math.pow(2, n - i - 1) * arr[i];

        return sum;
    }
}

public class No476 {
    public static void main(String[] args) {
        System.out.println(Solution.findComplement(2));
    }

}
