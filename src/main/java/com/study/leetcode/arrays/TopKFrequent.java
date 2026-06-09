package com.study.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class TopKFrequent {

    public static void main(String[] args) {

        int[] strs = new int[]{1,1,1,2,2,3};
        System.out.println(topKFrequent(strs,2));
    }

    static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> kFrequentElements = new HashMap<>();

        for(int num: nums){
            kFrequentElements.put(num,kFrequentElements.getOrDefault(num,0)+1);
        }

        return kFrequentElements.entrySet().stream()
                .sorted((a,b) -> b.getValue() - a.getValue())
                .limit(k)
                .mapToInt(Map.Entry::getKey).toArray();
    }
}
