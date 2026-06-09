package com.study.leetcode.slidingwindows;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {

    public static void main(String[] args) {

        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    static int lengthOfLongestSubstring(String s) {
        Set<Character> lengthChar = new HashSet<>();
        int qtyLongestCharacter = 0;
        int left = 0;
        int right = 0;

        while (right < s.length()) {
            Character key = s.charAt(right);

            while (lengthChar.contains(key)) {
                lengthChar.remove(s.charAt(left));
                left++;
            }

            lengthChar.add(key);
            right++;

            int size = right - left;
            if (size > qtyLongestCharacter)
                qtyLongestCharacter = size;
        }
        return qtyLongestCharacter;
    }
}
