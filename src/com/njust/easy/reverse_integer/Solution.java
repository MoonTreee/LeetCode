package com.njust.easy.reverse_integer;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * Assume we are dealing with an environment which could only hold integers within
 * the 32-bit signed integer range. For the purpose of this problem, assume that your
 * function returns 0 when the reversed integer overflows.
 *
 * tips：首先需要明白在计算机中最高位为符号位，0表示正数，1表示负数。
 * 在计算机中数据是使用其补码表示的，但正数补码是其本身，负数的补码是负数的源码取反加一得到的补码。
 * 32 bit 的范围 ：
 * Integer.MIN_VALUE= -2147483648 （-2的31次方）
 * Integer.MAX_VALUE= 2147483647  （2的31次方-1）
 */

public class Solution {
    public int reverse(int x) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        if(x==max || x==min || x==0){
            return 0;
        }
        // 判断是否为负数
        boolean flag = false;
        if (x<0){
            x = 0 - x;
            flag = true;

        }
        char[] chars = new Integer(x).toString().toCharArray();
        int len = chars.length;
        String res = "";
        for (int i=len-1;i>=0;i--){
            res = res + chars[i];
        }
        // 去除首位的0
        while (res.startsWith("0")){
            res = res.substring(1);
        }
        if(new Long(res).longValue()>max){
            return 0;
        }else {
            int result = new Integer(res).intValue();
            if(flag){
                return 0-result;
            }else {
                return result;
            }
        }


    }




    public static void main(String[] args) {
//        Solution solution = new Solution();
//        int x = -214748364;
//        System.out.println(solution.reverse(x));
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        hashSet.add(2);
        for (Object obj:hashSet){
            System.out.println(obj.toString());
        }

    }
}
