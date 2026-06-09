package com.study.leetcode.slidingwindows;

import java.util.HashMap;
import java.util.Map;

public class CharacterReplacement {

    public static void main(String[] args) {

        String s = "AABBC";
        System.out.println(characterReplacement(s,3));
    }

    static int characterReplacement(String s, int k) {
        Map<Character,Integer> qtyCharacter = new HashMap<>();
        int right = 0;
        int left = 0;
        int maxFrequencyLetter = 0;
        int changeNecessary = 0;
        int windowSize=0;
        int maxLength = 0;

        while(right<s.length()){
            Character key = s.charAt(right);
            qtyCharacter.put(key,  qtyCharacter.getOrDefault(key,0)+1);

            maxFrequencyLetter = qtyCharacter.values().stream().max(Integer::compareTo).stream().findFirst().get();
            windowSize = right - left +1;
            changeNecessary = windowSize - maxFrequencyLetter;

            if(changeNecessary > k){
                Character keyIntern = s.charAt(left);
                qtyCharacter.put(keyIntern,qtyCharacter.get(keyIntern)-1);
                left++;
            }

            windowSize = right - left +1;
            if(windowSize > maxLength)
                maxLength=windowSize;

            right++;
        }

        return maxLength;
    }
}
