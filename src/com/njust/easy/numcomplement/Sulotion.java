package com.njust.easy.numcomplement;

/**
 * Created by trey on 17-7-7.
 * Given a positive integer, output its complement number.
 * The complement strategy is to flip the bits of its binary representation.
 *
 * 思路：
 * 1.求出n的二进制表示的位数为i;
 * 2.result = 2的i次方-1-n
 *
 * 遇到的问题：2147483647应该输出的0,但是我输出的是-1.
 */
public class Sulotion {
    public int findComplement(int num) {
        int i = Integer.toBinaryString(num).length();
        System.out.println(i);
        System.out.println((int)Math.pow(2,i));
        int result = ((int)Math.pow(2,i))-1-num;
        return result;
    }
}
