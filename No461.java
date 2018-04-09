package com.company;
/*
class Solution {
    public int hammingDistance(int x, int y) {
        String str=Integer.toBinaryString(x ^ y);
        int count=0;
        for(int i=0;i<str.length();i++) {
            if (str.charAt(i) == '1')
                count++;
        }
        return count;
    }
}
*/
class Solution {
    public static int hammingDistance(int x, int y) {
        int count = 0;
        int a = x ^ y;
        for (int i = 0; i < 32; i++) {
            count += (a >> i) & 1;
        }
        return count;
    }
}

public class No461 {


    public static void main(String[] args) {
        System.out.println(Solution.hammingDistance(4, 2));
    }

}
