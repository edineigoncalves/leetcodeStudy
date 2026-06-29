package com.study.leetcode.linkedlist;

import java.util.List;

public class ReverseList {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

    public static void main(String[] args) {
        //ListNode next4 = new ListNode(5);
        //ListNode next3 = new ListNode(4,next4);
        ListNode next2 = new ListNode(3);//,next3);
        ListNode next1 = new ListNode(2,next2);
        ListNode head = new ListNode(1,next1);
        System.out.println(reverseList(head));
    }


    static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

}
