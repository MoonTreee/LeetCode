package com.njust.med.stockwithtransactionfee;

/*
* Your are given an array of integers prices, for which the i-th element is the price of a given
* stock on day i; and a non-negative integer fee representing a transaction fee.
* You may complete as many transactions as you like, but you need to pay the transaction fee for each
* transaction. You may not buy more than 1 share of a stock at a time (ie. you must sell the stock
* share before you buy again.)
* note：
* 1.0 < prices.length <= 50000.
* 2.0 < prices[i] < 50000
* 3.0 <= fee < 50000
* */
public class Solution {
    public int maxProfit(int[] prices, int fee) {
        // 持有股票为0
        int T_0 = 0;
        // 持有股票为1
        int T_1 = -50001;
        for(int price : prices){
            int T_0_old = T_0;
            T_0 = Math.max(T_0, T_1 + price - fee);
            // System.out.println(T_0);
            T_1 = Math.max(T_1, T_0_old - price);
            // System.out.println(T_1);
        }
        return T_0;
    }

    public static void main(String[] args) {
//        Solution solution = new Solution();
//        int[] prices = {1,3,2,8,4,9};
//        int fee = 2;
//        int result = solution.maxProfit(prices, fee);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE-9);
    }




}
