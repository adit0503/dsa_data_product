package com.leetcode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LC_Tests {

    @Test
    public void lc88_test() {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = new int[]{2,5,6};
        int n = 3;
        LC88_Solution1.main(nums1,m,nums2,n);
        assertArrayEquals(nums1, new int[]{1,2,2,3,5,6});

        nums1 = new int[]{1};
        m = 1;
        nums2 = new int[]{};
        n = 0;
        LC88_Solution1.main(nums1, m, nums2, n);
        assertArrayEquals(nums1, new int[]{1});
    }

    @Test
    public void lc1768_test() {
        assertEquals(LC1768.solution("null","null"), "nnuullll");
        assertEquals(LC1768.solution("abc","pqr"), "apbqcr");
        assertEquals(LC1768.solution("ab","pqrs"), "apbqrs");
        assertEquals(LC1768.solution("abcd","pq"), "apbqcd");
    }

    @Test
    public void lc215_test() {
        assertEquals(LC215.solution(new int[]{3,2,1,5,6,4}, 2), 5);
        assertEquals(LC215.solution(new int[]{3,2,3,1,2,4,5,5,6}, 4), 4);
    }

    @Test
    public void lc1985_test() {
        assertEquals(LC1985.solution(new String[]{"3","6","7","10"}, 4), "3");
    }

}
