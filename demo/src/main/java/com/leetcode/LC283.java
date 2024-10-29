// https://leetcode.com/problems/move-zeroes/description/?envType=study-plan-v2&envId=leetcode-75
package com.leetcode;


class LC283_Solution1 {

    static void main(int[] nums) {

        int j=0;
        for(int i=0; i< nums.length; i++) {
            if(nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        while(j<nums.length){
            nums[j] = 0;
            j++;
        }
    }
}

public class LC283 {
    
    public static void solution(int[] nums) {
        LC283_Solution1.main(nums);
    }
}
