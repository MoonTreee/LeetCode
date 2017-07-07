package com.njust.easy.hammingdistance;

/**
 * Created by trey on 17-7-7.
 * The Hamming distance between two integers is the number of
 * positions at which the corresponding bits are different.
 * Given two integers x and y, calculate the Hamming distance.
 * Note: 0 ≤ x, y < 2的31次方.
 * ps
 * 汉明距离：在信息论中，两个等长字符串之间的汉明距离是两个字符串对应位置的不同字符的个数。
 * 换句话说，它就是将一个字符串变换成另外一个字符串所需要替换的字符个数。
 *
 * 思路：
 * 1.建立int[31]，用来标识x，y
 * 2.比较
 *
 * 好吧 又被leetcode上的答案惊艳到了！
 */
public class Sulotion {
    public int hammingDistance(int x, int y) {
        int result=0;
        int[] xVal = new int[32];
        int[] yVal = new int[32];
        char[] xChars = Integer.toBinaryString(x).toCharArray();
        char[] yChars = Integer.toBinaryString(y).toCharArray();
        for(int i=0;i<32;i++){
            if(i>=32-xChars.length && xChars[i+xChars.length-32]=='1')xVal[i]=1;
            if(i>=32-yChars.length && yChars[i+yChars.length-32]=='1')yVal[i]=1;
        }

        for(int i=0;i<=31;i++){
            //System.out.println(xVal[i]+"---"+yVal[i]);
            if(xVal[i]!=yVal[i])result++;
        }
        return result;
    }

}
