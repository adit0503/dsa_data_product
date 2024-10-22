package com.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LC_Tests {

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
