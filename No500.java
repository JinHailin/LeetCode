package com.company;

import java.util.*;

class Solution {
    public static String[] findWords(String[] words) {
        // 用HashMap保存和比较
        Map<Character, Integer> map = new HashMap<>();
        for (char c : "qwertyuiopQWERTYUIOP".toCharArray())
            map.put(c, 1);
        for (char c : "asdfghjklASDFGHJKL".toCharArray())
            map.put(c, 2);
        for (char c : "zxcvbnmZXCVBNM".toCharArray())
            map.put(c, 3);

        ArrayList<String> arr = new ArrayList<>();
        for (String s : words) {
            char c = s.charAt(0);
            int line = map.get(c);
            boolean t = true;
            for (int i = 1; i < s.length(); i++) {
                if (map.get(s.charAt(i)) != line) {
                    t = false;
                    break;
                }
            }
            if (t) {
                arr.add(s);
            }
        }

        return (String[]) arr.toArray(new String[0]);
    }
}


public class No500 {


    public static void main(String[] args) {

        System.out.println(Solution.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"}));
    }

}
