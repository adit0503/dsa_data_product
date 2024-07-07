package com.leetcode;

import java.util.Set;
import java.util.HashSet;


class LC1985_Solution1 {

    public static String main(String[] nums, int k) {
        Set<Integer> hs = new HashSet<>();
        
        for(String s: nums) {
            hs.add(Integer.parseInt(s));
        }

        int[] temp = new int[hs.size()];
        int i=0;
        for(int n: hs) {
            temp[i++] = n;
        }

        return String.valueOf(LC215.solution(temp, k));
        
    }
}

public class LC1985 {

    public static String solution(String[] nums, int k) {
        return LC1985_Solution1.main(nums, k);
    }

}
