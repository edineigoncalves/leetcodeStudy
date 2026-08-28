package com.study.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class EvalRPN {

    public static void main(String[] args) {
        String[] nums = {"2", "1", "+", "3", "*"};
        System.out.println(evalRPN(nums));
    }

    static int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i=0; i<tokens.length; i++){
            switch (tokens[i]){
                case "+": {
                    if(stack.size()>1){
                        int right = stack.pop();
                        int left = stack.pop();
                        stack.push(right+left);
                    }
                    break;
                }
                case "-": {
                    if(stack.size()>1){
                        int right = stack.pop();
                        int left = stack.pop();
                        stack.push(left-right);
                    }
                    break;
                }
                case "/": {
                    if(stack.size()>1){
                        int right = stack.pop();
                        int left = stack.pop();
                        if(right!=0)
                            stack.push(left/right);
                    }
                    break;
                }
                case "*": {
                    if(stack.size()>1){
                        int right = stack.pop();
                        int left = stack.pop();
                        stack.push(right*left);
                    }
                    break;
                }
                default:
                    stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return !stack.isEmpty() ? stack.peek() : 0;
    }
}
