package com.njust.easy.array_parition;

/**
 * Created by trey on 17-7-7.
 * Given an array of 2n integers, your task is to group these integers into n pairs of integer,
 * say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
 *
 * 1.shell排序
 * 2.前n/2相加
 */
public class Sulotion {
    public int arrayPairSum(int[] nums) {
        int result=0;
        int len = nums.length;
        int i,j,r,temp;
        for(r=len/2;r>=1;r/=2){
            for (i=r;i<len;i++){
                temp = nums[i];
                j=i-r;
                while (j>=0 && temp<nums[j]){
                    nums[j+r]=nums[j];
                    j-=r;
                }
                nums[j+r] = temp;
            }

        }

        for (int k=0;k<len/2;k++){
            result+=nums[2*k];
        }
        return result;

    }
}
