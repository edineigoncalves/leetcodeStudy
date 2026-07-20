package com.study.leetcode.linkedlist;

import java.util.List;

public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode next3 = new ListNode(2);
        ListNode next2 = new ListNode(4,next3);
        ListNode next1 = new ListNode(3,next2);
        ListNode list1 = new ListNode(1,next1);

        ListNode next33 = new ListNode(5);
        ListNode next22 = new ListNode(6,next33);
        ListNode next11 = new ListNode(4,next22);
        ListNode list2 = new ListNode(1,next11);
        System.out.println(addTwoNumbers(list1,list2));
    }

    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode intermediateList = new ListNode();
        ListNode dummy = intermediateList;
        int valL1=0;
        int valL2=0;
        int sumNode = 0;
        int carry=0;
        while(l1 != null || l2 != null || carry>0){

            if(l2 == null){
                valL2 = 0;
            }else{
                valL2 = l2.val;
                l2 = l2.next;
            }

            if(l1 == null){
                valL1 = 0;
            }else{
                valL1 = l1.val;
                l1 = l1.next;
            }

            sumNode = valL1 + valL2 + carry;
            carry = sumNode/10;
            sumNode = sumNode%10;

            dummy.next = new ListNode(sumNode);
            dummy = dummy.next;
        }

        return intermediateList.next;
    }
}
