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

        for(String token : tokens){
            switch(token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                case "/": {
                    int right = stack.pop();
                    int left = stack.pop();
                    if (token.equals("-"))
                        stack.push(left - right);
                    else
                        stack.push(left / right);
                    break;
                }
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                default:
                    stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
