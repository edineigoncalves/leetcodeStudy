package com.study.leetcode.twopoints;

public class TwoSum {

    public static void main(String[] args) {

        int[] numbers = new int[] {2,7,11,15};
        System.out.println(twoSum(numbers,9));
    }

    //brute force
    /*static int[] twoSum(int[] numbers, int target) {
        for(int i=0; i< numbers.length;i++){
            for(int j=i+1;j< numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                    return new int []{i+1,j+1};
                }
            }
        }
        return new int []{0,0};
    }*/

    static int[] twoSum(int[] numbers, int target) {
            int left = 0;
            int right = numbers.length-1;

            while(left<right){
                int sum = numbers[left]+numbers[right];
                if(sum<target){
                    left++;
                }else if(sum>target){
                    right--;
                }else {
                    return new int[]{left+1,right+1};
                }
            }
        return new int []{0,0};
    }

}
