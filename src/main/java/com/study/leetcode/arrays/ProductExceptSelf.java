package com.study.leetcode.arrays;

public class ProductExceptSelf {

    public static void main(String[] args) {

        int[] strs = new int[]{1,2,3,4};
        System.out.println(productExceptSelf(strs));
    }

    static int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] numsCalculate = new int[size];
        int left = 1;
        int right = 1;
        for(int i=0; i<size;i++){
            numsCalculate[i] = left;
            left *= nums[i];
        }
        for(int i=size-1; i>=0;i--){
            numsCalculate[i] *= right;
            right *= nums[i];
        }
        return numsCalculate;
    }
}
