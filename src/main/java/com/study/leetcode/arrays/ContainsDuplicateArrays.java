package com.study.leetcode.arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateArrays {

    public static void main(String[] args) {

        int[] nums = new int[]{1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }

    static boolean containsDuplicate(int[] nums) {
        Set<Integer> containsDuplicateSet = new HashSet<>();

        for(int num: nums){
            if(containsDuplicateSet.contains(num)){
                return true;
            }
            containsDuplicateSet.add(num);
        }
        return false;
    }
}
