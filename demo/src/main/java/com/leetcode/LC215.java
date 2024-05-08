package com.leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;


// O
class LC215_Solution2 {

    public static int main(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}

class LC215_Solution1 {

    public static int main(int[] nums, int k) {

        Queue<Integer> heap = new PriorityQueue<>();
        for(int n: nums) {
            heap.add(-1*n);
        }

        int ans = 1;
        while(!heap.isEmpty() & k>0) {
            ans = heap.poll();
            k -= 1;
        }
        return -1 * ans;
        
    }
}

public class LC215 {

    public static int solution(int[] nums, int k) {
        return LC215_Solution2.main(nums, k);
    }
}
