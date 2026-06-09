package com.study.leetcode.slidingwindows;

public class MaxProfit {

    public static void main(String[] args) {

        int[] numbers = new int[] {7,1,5,3,6,4};
        System.out.println(maxProfit(numbers));
    }

    static int maxProfit(int[] prices) {
        if(prices.length == 0)
            return 0;

        int minPrice = prices[0];
        int maxProfit = 0;

        for(int price: prices){

            if(minPrice > price ){
                minPrice = price;
            }

            int maxProfitIntern = price - minPrice;
            if(maxProfitIntern > maxProfit)
                maxProfit = maxProfitIntern;
        }
        return maxProfit;
    }
}
