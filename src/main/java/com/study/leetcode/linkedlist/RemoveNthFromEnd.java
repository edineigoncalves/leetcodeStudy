package com.study.leetcode.linkedlist;

public class RemoveNthFromEnd {

    public static void main(String[] args) {
        ListNode next44 = new ListNode(5);
        ListNode next33 = new ListNode(4,next44);
        ListNode next22 = new ListNode(3,next33);
        ListNode next11 = new ListNode(2,next22);
        ListNode list1 = new ListNode(1,next11);
        System.out.println(removeNthFromEnd(list1,2));
    }

    static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode internal = head;
        int listNodeSize = 0;
        while(internal != null){
            internal = internal.next;
            listNodeSize++;
        }

        int avgPosition = listNodeSize-n;
        ListNode internal2 = head;

        int index = 0;
        while(index<listNodeSize){
            if(avgPosition == 0){
                return head.next;
            } else if(index == (avgPosition-1)){
                internal2.next = internal2.next.next;
                return head;
            }else {
                internal2 = internal2.next;
                index++;
            }
        }

        return head;
    }
}
