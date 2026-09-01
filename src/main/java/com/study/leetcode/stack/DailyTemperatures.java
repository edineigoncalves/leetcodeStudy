package com.study.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class DailyTemperatures {

    public static void main(String[] args) {

        int[] nums = new int[]{73,74,75,71,69,72,76,73};
        System.out.println(dailyTemperatures(nums));
    }

    static int[] dailyTemperatures(int[] temperatures) {
        int[] nums = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i=0;i<temperatures.length;i++){
            while (
                    !stack.isEmpty()
                            && temperatures[i] > temperatures[stack.peek()]
            ) {
                int previousIndex = stack.pop();

                nums[previousIndex] = i-previousIndex;
            }

            stack.push(i);
        }
        return nums;
    }
}
