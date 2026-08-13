package com.study.leetcode.linkedlist;

public class NodeLRU {
    int key;
    int value;
    NodeLRU previous;
    NodeLRU next;

    public NodeLRU(){

    }

    public NodeLRU(int value){
        this.value = value;
    }

    public NodeLRU(int key, int value, NodeLRU previous, NodeLRU next) {
        this.key = key;
        this.value = value;
        this.previous = previous;
        this.next = next;
    }

    public NodeLRU(int key, int value) {
        this.key = key;
        this.value = value;
    }
}