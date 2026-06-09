package com.study.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecodeStrings {

    public static void main(String[] args) {

        List<String> strs = new ArrayList();
        strs.add("Hello");
        strs.add("World");
        String encodeReturn = encode(strs);
        System.out.println(encodeReturn);
        List<String> decodeReturn = decode(encodeReturn);
        System.out.println(decodeReturn);
    }

        static String encode(List<String> strs) {
            StringBuilder strBuilder = new StringBuilder();
            for(String str: strs){
                strBuilder.append(str.length());
                strBuilder.append("#");
                strBuilder.append(str);
            }
            return strBuilder.toString();
        }

        static List<String> decode(String str) {
            List<String> strs = new ArrayList();
            int i=0;
            while(i< str.length()){
                int delimiter = str.indexOf("#",i);
                int size = Integer.parseInt(str.substring(i,delimiter));
                int start = delimiter+1;
                int end = start + size;
                strs.add( str.substring(start, end));
                i=end;
            }
            return strs;
        }


}
