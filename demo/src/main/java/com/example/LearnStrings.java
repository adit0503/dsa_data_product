package com.example;

public class LearnStrings {

    static void test2(){
        String S="qwerty";
        StringBuilder sb = new StringBuilder();
        for(char c: S.toCharArray()){
            sb.append(c);
        }
        System.out.println(sb.toString());
    }

    static void test1() {
        String S = "qwerty";
        for(char c: S.toCharArray()){
            System.err.print(c + " ");
        }
    }

    public static void main(String[] args) {
        
        // test1();
        test2();
    }
}
