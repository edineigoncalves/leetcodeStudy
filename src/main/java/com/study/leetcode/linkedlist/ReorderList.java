package com.study.leetcode.linkedlist;

import java.util.List;

public class ReorderList {

    public static void main(String[] args) {
        ListNode next44 = new ListNode(5);
        ListNode next33 = new ListNode(4,next44);
        ListNode next22 = new ListNode(3,next33);
        ListNode next11 = new ListNode(2,next22);
        ListNode list1 = new ListNode(1,next11);
        System.out.println(reorderList(list1));
    }


    static ListNode reorderList(ListNode head) {
        ListNode internal = head;
        int sizeListNode = 0;
        //achando o meio da lista
        while(internal != null){
            sizeListNode++;
            internal = internal.next;
        }
        //inverter lista
        int avgSizeListNode = sizeListNode/2;
        int internalQty = 0;

        //separa em duas listas
        internal = head;
        ListNode secondListNode = null;
        ListNode firstListNode = head;
        while(internal != null){
            if(internalQty==avgSizeListNode)
            {
                secondListNode = internal.next;
                internal.next = null;
                break;
            }

            internalQty++;
            internal = internal.next;
        }

        ListNode prev = null;
        ListNode current = secondListNode;
        ListNode next = null;
        //faz o reverso da segunda lista
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        ListNode firstNext = null;
        ListNode secondNext = null;
        ListNode firstNode = null;
        ListNode secondNode = null;
        //reoderna a lista
        while( prev != null){

            firstNode = firstListNode;
            secondNode = prev;
            firstNext = firstNode.next;
            secondNext = secondNode.next;

            firstNode.next = secondNode;
            secondNode.next = firstNext;

            firstListNode = firstNext;
            prev = secondNext;
        }

        return null;
    }
}

