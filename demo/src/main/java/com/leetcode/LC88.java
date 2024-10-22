// https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
package com.leetcode;


// O(n): 2 pointer system
class LC88_Solution1 {
    
    static void main(int[] nums1, int m, int[] nums2, int n) {
        int l = nums1.length-1;

        int i=m-1, j=n-1;
        
        while(i>=0 && j>=0) {
            if(nums1[i] > nums2[j]){
                nums1[l]=nums1[i];
                i--;
            } else {
                nums1[l]=nums2[j];
                j--;
            }
            l--;
        }
        while(i>=0){
            nums1[l]=nums1[i];
            l--;
            i--;
        }
        while(j>=0){
            nums1[l]=nums2[j];
            l--;
            j--;
        }

    }
}

public class LC88 {

    public static void solution(int[] nums1, int m, int[] nums2, int n){
        LC88_Solution1.main(nums1, m, nums2, n);
    }
}
