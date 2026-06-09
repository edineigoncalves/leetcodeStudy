package com.study.leetcode.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidAnagram {

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }

    static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        Map<Character,Integer> charExist = new HashMap<>();

        for(int i = 0; i< s.length(); i++){
            char charFound = Character.toLowerCase(s.charAt(i));
            charExist.put(charFound,charExist.getOrDefault(charFound,0)+1);
        }
        List<List<String>> anagramsFound2 = new ArrayList<>();

       for (int j=0; j< t.length(); j++){
           char charFound = Character.toLowerCase(t.charAt(j));
           charExist.put(charFound,charExist.getOrDefault(charFound,0)-1);
       }

        return charExist.values().stream()
                .allMatch(value -> value == 0);
    }
}
