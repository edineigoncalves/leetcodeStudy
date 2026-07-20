package com.study.leetcode.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class CopyRandomList {

    public static void main(String[] args) {

        Node node5 = new Node(1);
        Node node4 = new Node(10);
        Node node3 = new Node(11,node4,node5);
        Node node2 = new Node(13);
        Node node1 = new Node(7,node2,null);
        node2.random = node1;
        node2.next = node3;
        node4.next = node5;
        node4.random = node3;
        node5.next = null;
        node5.random = node1;
        System.out.println(copyRandomList(node1));
    }

    static Node copyRandomList(Node head) {
        if (head == null)
            return null;

        Node dummy = new Node(0);
        Node tail = dummy;
        Node current = head;

        Map<Node,Node> nodeMap = new HashMap<>();

        while(head != null){
            tail.next = new Node(head.val);
            tail = tail.next;
            nodeMap.put(head, tail);
            head = head.next;
        }

        while(current != null){
            Node copyNode = nodeMap.get(current);
            copyNode.next = nodeMap.get(current.next);
            copyNode.random = nodeMap.get(current.random);
            current = current.next;
        }

        return dummy.next;
    }
}
