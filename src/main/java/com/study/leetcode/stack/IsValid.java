package com.study.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class IsValid {

    public static void main(String[] args) {

        String s = "()[]{}";
        System.out.println(isValid(s));
    }

    static boolean isValid(String s) {
        if(s.isEmpty())
            return false;

        Deque<Character> stack = new ArrayDeque<>();

        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{')
                stack.push(c);
            else{
                if(stack.isEmpty())
                    return false;

                char top = stack.peek();
                if(top == '[' && c == ']' || top == '(' && c == ')' || top == '{' && c == '}')
                    stack.pop();
                else
                    stack.push(c);

            }
        }
        return stack.isEmpty();
    }
}
