package com.study.leetcode.twopoints;

public class IsPalindrome {

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    static boolean isPalindrome(String s) {
        StringBuilder sBuilder = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sBuilder.append(Character.toLowerCase(c));
            }
        }
        return sBuilder.toString().equals(sBuilder.reverse().toString());
    }
}