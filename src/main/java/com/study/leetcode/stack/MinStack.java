package com.study.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinStack {

    Deque<Integer> minStack = new ArrayDeque<>();
    Deque<Integer> stack = new ArrayDeque<>();


    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(12);
        obj.pop();
        int param_3 = obj.top();
        int param_4 = obj.getMin();
    }

    public MinStack() {
    }

    public void push(int value) {
        stack.push(value);

        if(minStack.isEmpty())
            minStack.push(value);
        else{
            int minNumberStack = minStack.peek();
            if(minNumberStack>value)
                minStack.push(value);
            else
                minStack.push(minNumberStack);
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
