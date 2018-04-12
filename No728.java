package com.company;

import java.util.ArrayList;
import java.util.*;

/*
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            List<Integer> list2 = count(i);
            Iterator it = list2.iterator();
            boolean t = true;
            // 每一位进行判断
            while (it.hasNext()) {
                int num = (int) it.next();
                if (num == 0 || i % num != 0) {
                    t = false;
                    break;
                }
            }
            if (t) {
                list.add(i);
            }
        }
        return list;
    }
    // 获取每一位保存在list
    public List<Integer> count(int num) {
        List<Integer> list = new ArrayList<Integer>();
        while (num != 0) {
            list.add(num % 10);
            num /= 10;
        }
        return list;
    }
}*/
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        //给定边界值包括边界值，返回其中所有元素是否满足自除数（即其对其的每一位都能整除）
        List<Integer> list = new ArrayList<Integer>();
        for (int i = left; i <= right; i++) {
            if (isSelfDivid(i)) {
                list.add(i);
            }
        }
        return list;
    }

    //判断该数是否满足自除数(该数各个位不包含任何0)
    public boolean isSelfDivid(int num) {
        int temp = num;

        while (temp > 0) {
            //任何位数位0或者判断该除数不为0，即返回false
            if (temp % 10 == 0 || num % (temp % 10) > 0) return false;
            temp /= 10;
        }

        return true;
    }
}

public class No728 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.selfDividingNumbers(1, 22));
    }
}
