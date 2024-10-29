// https://leetcode.com/problems/greatest-common-divisor-of-strings/description/?envType=study-plan-v2&envId=leetcode-75
package com.leetcode;


class LC1071_Solution1 {

    static boolean checkStringMatch(String S1, String S2, String S,int gcd1, int gcd2) {
        String str1="", str2="";
        
        while(gcd1>0) {
            str1 = str1.concat(S);
            gcd1--;
        }
        while(gcd2>0) {
            str2 = str2.concat(S);
            gcd2--;
        }

        return S1.equals(str1) && S2.equals(str2);
    }

    static String main(String str1, String str2) {
        
        String ans = "";
        int l1 = str1.length(), l2=str2.length();
        

        int i = l2;
        while(i > 0) {
            String S = str2.substring(0, i);
            if(l1%i == 0 && l2%i == 0 && checkStringMatch(str1, str2,S, l1/i, l2/i)) {
                return S;
            }
            i--;
        }
        return ans;
        
    }
}


public class LC1071 {

    public static String solution(String str1, String str2) {
        return LC1071_Solution1.main(str1, str2);
    }
}
