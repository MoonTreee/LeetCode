package com.njust.easy.array_parition;

/**
 * Created by trey on 17-7-7.
 */
public class Test {
    public static void main(String[] args) {
        Sulotion sulotion =new Sulotion();
        int[] nums = new int[]{1,6,3,4,5,2};
        int result=sulotion.arrayPairSum(nums);
        System.out.println(result);
    }

}
