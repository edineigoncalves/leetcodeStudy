package com.study.leetcode.linkedlist;

import java.util.HashMap;

public class LRUCache {

    private int capacity;
    private HashMap<Integer,NodeLRU> cache;
    private NodeLRU leftDummy = new NodeLRU();
    private NodeLRU rightDummy = new NodeLRU();

    public LRUCache(int capacity) {
        this.capacity=capacity;
        cache = new HashMap<>();
        leftDummy.next = rightDummy;
        rightDummy.previous = leftDummy;
    }

    public int get(int key) {
        if(!cache.containsKey(key))
            return -1;
        else {
            NodeLRU nodeFound = cache.get(key);
            remove(nodeFound);
            addMRU(nodeFound);
            return nodeFound.value;
        }
    }

    public void put(int key, int value) {

        if(cache.containsKey(key)){
            NodeLRU nodeFound = cache.get(key);
            nodeFound.value = value;
            remove(nodeFound);
            addMRU(nodeFound);
        }else{
            if(cache.size()==capacity){
                NodeLRU lru = leftDummy.next;
                remove(leftDummy.next);
                cache.remove(lru.key);
            }

            NodeLRU dummy = new NodeLRU(key,value);
            addMRU(dummy);
            cache.put(key,dummy);
        }
    }

    public void addMRU(NodeLRU nodeLRU){
        NodeLRU last = rightDummy.previous;
        nodeLRU.previous = last;
        nodeLRU.next = rightDummy;
        last.next = nodeLRU;
        rightDummy.previous = nodeLRU;
    }

    public void remove(NodeLRU node){
        node.previous.next = node.next;
        node.next.previous = node.previous;
    }

    public static void main(String[] args) {

        LRUCache cache = new LRUCache(2);

        cache.put(1, 1);
        cache.put(2, 2);

        System.out.println(cache.get(1));

        cache.put(3, 3);

        System.out.println(cache.get(2));

        cache.put(4, 4);

        System.out.println(cache.get(1));
        System.out.println(cache.get(3));
        System.out.println(cache.get(4));
    }
}
