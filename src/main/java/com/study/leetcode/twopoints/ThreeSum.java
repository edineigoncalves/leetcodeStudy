package com.study.leetcode.twopoints;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {

        int[] numbers = new int[] {-1,0,1,2,-1,-4};
        System.out.println(threeSum(numbers));
    }

    static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> nums3sum3 = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length;i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum= nums[i]+nums[left]+nums[right];
                if(sum<0)
                    left++;
                else if(sum>0)
                    right--;
                else {
                    nums3sum3.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
            }
        }
        return nums3sum3;
    }
}
