package com.study.leetcode.linkedlist;

import java.util.*;

public class HasCycle {

    public static void main(String[] args) {
        ListNode next3 = new ListNode(2);
        ListNode next2 = new ListNode(4,next3);
        ListNode next1 = new ListNode(3,next2);
        ListNode list1 = new ListNode(1,next1);
        next3.next = list1;
        System.out.println(hasCycle(list1));
    }

    static boolean hasCycle(ListNode head) {

        Set<ListNode> setListNodeCheck = new HashSet<>();
        ListNode internal = head;
        while(internal!=null){
            if(setListNodeCheck.contains(internal)){
                return true;
            }

            setListNodeCheck.add(internal);
            internal = internal.next;
        }

        return false;
    }
}
