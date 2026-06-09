package com.study.leetcode.slidingwindows;

import java.util.HashMap;
import java.util.Map;

public class CheckInclusion {

    public static void main(String[] args) {

        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1,s2));
    }

    static boolean checkInclusion(String s1, String s2) {
        int sizeS1 = s1.length();
        int sizeS2 = s2.length();

        if(sizeS1>sizeS2)
            return false;

        int leftS1=0;
        Map<Character,Integer> frequencyS1= new HashMap<>();

        while(leftS1< sizeS1){
            char key = s1.charAt(leftS1);
            frequencyS1.put(key, frequencyS1.getOrDefault(key,0)+1);
            leftS1++;
        }

        Map<Character,Integer> frequencyWindow= new HashMap<>();
        int right = sizeS1;
        int left = 0;
        while (left<right){
            char key = s2.charAt(left);
            frequencyWindow.put(key,frequencyWindow.getOrDefault(key,0)+1);
            left++;
        }
        left = 0;
        if(frequencyWindow.equals(frequencyS1))
            return true;

        while(right<sizeS2){
            char keyLeft = s2.charAt(left);
            if(frequencyWindow.get(keyLeft)-1 == 0)
                frequencyWindow.remove(keyLeft);
            else
                frequencyWindow.put(keyLeft, frequencyWindow.getOrDefault(keyLeft,0)-1);

            char keyRight = s2.charAt(right);
            left++;
            frequencyWindow.put(keyRight, frequencyWindow.getOrDefault(keyRight,0)+1);
            right++;
            if(frequencyWindow.equals(frequencyS1))
                return true;
        }


        return false;
    }
}
