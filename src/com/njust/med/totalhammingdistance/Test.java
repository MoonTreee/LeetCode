package com.njust.med.totalhammingdistance;

public class Test {
    public static void main(String[] args) {
        Solution solution =new Solution();
        LeetcodeSolution leetcodeSolution = new LeetcodeSolution();
        int nums[] = new int[]{4, 14, 2};
        int result = solution.totalHammingDistance(nums);
        int lresult = leetcodeSolution.totalHammingDistance(nums);
        System.out.println(result);
        System.out.println(lresult);
    }
}
