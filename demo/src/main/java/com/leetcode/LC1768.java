// https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75
package com.leetcode;

// O(N) 2 pointer solution : can be optimized, using single while loop
class LC1768_Solution1 {
    
    static String main(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        char[] c1 = word1.toCharArray();
        char[] c2 = word2.toCharArray();

        int l1 = c1.length;
        int l2 = c2.length;

        int i=0,j=0;

        while(i<l1 && j<l2) {
            sb.append(c1[i]);
            sb.append(c2[j]);
            i++;
            j++;
        }

        while(i<l1) {
            sb.append(c1[i]);
            i++;
        }

        while(j<l2) {
            sb.append(c2[j]);
            j++;
        }

        return sb.toString();
    }
}

public class LC1768 {

    public static String solution(String word1, String word2) {
        return LC1768_Solution1.main(word1, word2);
        
    }
}
