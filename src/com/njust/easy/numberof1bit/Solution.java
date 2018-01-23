package com.njust.easy.numberof1bit;

/**
 * Created by Tree on 2017/12/18.
 */
public class Solution {
    // you need to treat n as an unsigned value(无符号值)
    public int hammingWeight(int n) {
        String b = Integer.toBinaryString(n);
        int result = 0;
        for(int i=0;i<b.length();i++){
            if(b.charAt(i)=='1'){
                result++;
            }
        }
        // System.out.println(b);
        return result;

    }

    // top-answer
    public static int hammingWeightTop(int n) {
        int ones = 0;
        while(n!=0) {
            ones = ones + (n & 1);
            // ">>>":无符号右移，忽略符号位，空位都以0补齐
            n = n>>>1;
        }
        return ones;
    }
    public static void main(String[] args){
        Solution solution = new Solution();
        int i = solution.hammingWeight(0);
        System.out.println(i);
    }

}
