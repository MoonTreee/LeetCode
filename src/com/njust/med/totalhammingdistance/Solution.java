package com.njust.med.totalhammingdistance;

/**
 * The Hamming distance between two integers is the number of positions at which the
 * corresponding bits are different.
 * Now your job is to find the total Hamming distance between all pairs of the given numbers.
 *
 * 思路1：利用在easy中的hammingdistace进行计算-->此思路在测试集运行到哦最后一个的时候超时
 *
 * 思路2：leetcode上的高票答案 -- 厉害
 * 数组里面的元素都看成是一个32位二进制；逐位进行统计。
 * 例如，先统计第一位上所有元素的值，令nums数组中所有元素的第一位中，有bitCount个1，对应的有n-bitCount个0，
 * 仅根据以上信息就可以推断这些差异会对hamming距离贡献bitCount*(n - bitCount)
 *
 *
 * public int totalHammingDistance(int[] nums) {
 * int total = 0, n = nums.length;
 * for (int j=0;j<32;j++) {
 * int bitCount = 0;
 * for (int i=0;i<n;i++)
 * bitCount += (nums[i] >> j) & 1;
 * total += bitCount*(n - bitCount);
 * }
 * return total;
 * }
 *
 */
public class Solution {

    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    public int totalHammingDistance(int[] nums) {
        int result = 0;
        int  j = 1;
        int len = nums.length;
        while (j<len){
           for (int i=0;i<j;i++){
               result += hammingDistance(nums[i],nums[j]);
           }
            j++;
        }
        return result;
    }
}
