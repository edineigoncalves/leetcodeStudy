package com.study.leetcode.linkedlist;

public class MergeTwoLists {

    public static void main(String[] args) {
        ListNode next2 = new ListNode(4);
        ListNode next1 = new ListNode(2,next2);
        ListNode list1 = new ListNode(1,next1);

        ListNode next22 = new ListNode(4);
        ListNode next11 = new ListNode(3,next22);
        ListNode list2 = new ListNode(1,next11);
        System.out.println(mergeTwoLists(list1,list2));
    }

    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        while(list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }

            tail = tail.next;
        }

        tail.next = (list1 != null) ? list1 : list2;

        return dummy.next;
    }
}
