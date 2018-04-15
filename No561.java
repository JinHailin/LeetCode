package com.company;

import java.util.Arrays;

class Solution {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += Math.min(nums[i], nums[i + 1]);
        }
        return sum;
    }
}

public class No561 {
    public static void main(String[] args) {
        System.out.println(Solution.arrayPairSum(new int[]{1, 4, 3, 2}));
    }
}
