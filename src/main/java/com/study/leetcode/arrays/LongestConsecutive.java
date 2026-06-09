package com.study.leetcode.arrays;

import java.util.Arrays;

public class LongestConsecutive {

    public static void main(String[] args) {

        int[] strs = new int[]{100,4,200,1,3,2};
        System.out.println(longestConsecutive(strs));
    }

    static int longestConsecutive(int[] nums) {

        if(nums.length ==0) return 0;
        int [] numSorted = Arrays.stream(nums).sorted().toArray();
        int lengthLongestNum =1;
        int currentStack = 1;
        char c = 'c';

        for(int i=0; i<numSorted.length;i++){
            if(i==0){
                continue;
            }

            if(numSorted[i-1]==numSorted[i])
                continue;

            if(numSorted[i-1]==(numSorted[i]-1)){
                currentStack ++;
                lengthLongestNum = Math.max(lengthLongestNum,currentStack);
            }
            else{
                currentStack = 1;
            }
        }

        return lengthLongestNum;
    }
}
