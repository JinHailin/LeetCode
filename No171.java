package com.company;

class Solution {
    public static int titleToNumber(String s) {
        int n = s.length();
        int sum = 0;
        char[] c = s.toCharArray();
        for (int i = 0; i < s.length() - 1; i++) {
            sum += (c[i] - 'A' + 1) * Math.pow(26, --n);
        }
        return sum + c[s.length() - 1] - 'A' + 1;
    }
}

public class No171 {
    public static void main(String[] args) {
        System.out.println(Solution.titleToNumber("AB"));
    }
}
