package com.study.leetcode.linkedlist;

import java.util.HashSet;

public class FindDuplicate {

    public static void main(String[] args) {
        int[] nums = new int[]{1,4,3,2,2};
        System.out.println(findDuplicate(nums));
    }

    static int findDuplicate(int[] nums) {
        int slow=0;
        int fast=0;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow!=fast);

        slow=nums[0];
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
}
