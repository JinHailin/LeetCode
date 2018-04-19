package com.company;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int sum = 0;
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (i == ch.length - 1) {
                return sum + map.get(ch[i]);
            } else if (map.get(ch[i]) >= map.get(ch[i + 1])) {
                sum += map.get(ch[i]);
            } else {
                sum -= map.get(ch[i]);
            }
        }
        return -1;
    }
}

public class No13 {
    public static void main(String[] args) {
        System.out.println(Solution.romanToInt("III"));
    }
}
