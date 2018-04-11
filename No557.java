package com.company;

class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuffer temp = new StringBuffer();
        for (int i = 0; i < str.length; i++)
            temp.append(reverse(str[i]) + " ");
        return temp.substring(0, temp.length() - 1);
    }

    public String reverse(String s) {
        StringBuffer buffer = new StringBuffer();
        for (int i = s.length() - 1; i >= 0; i--)
            buffer.append(s.charAt(i));
        return buffer.toString();
    }
}

public class No557 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseWords("Let's take LeetCode contest"));
    }

}
