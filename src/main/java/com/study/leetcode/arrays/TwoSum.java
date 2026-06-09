package com.study.leetcode.arrays;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = new int[]{2,7,11,15};
        System.out.println(twoSum(nums,9));
    }

    static int[] twoSum(int[] nums, int target) {
        int[] numsReturned = new int[2];
        for(int i=0; i<nums.length;i++){
            int numMinusTarget =  target - nums[i];

            for(int j=i+1; j<nums.length;j++){
                if(numMinusTarget == nums[j]){
                    numsReturned[0] = i;
                    numsReturned[1] = j;
                    return numsReturned;
                }
            }
        }
        return numsReturned;
    }
}
