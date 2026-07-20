package com.study.leetcode.linkedlist;

public class Node {
    int val;
    Node next;
    Node random;

    public Node(){

    }

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

    public Node(int val, Node next, Node random) {
        this.val = val;
        this.next = next;
        this.random = random;
    }
}