package com.njust.easy.mincostclimbingstairs;
 /*On a staircase, the i-th step has some non-negative cost cost[i] assigned (0 indexed).
   Once you pay the cost, you can either climb one or two steps. You need to find minimum
   cost to reach the top of the floor, and you can either start from the step with index 0, or the step with index 1.*/


public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int[] M = new int[len];
        M[0] = 0;
        M[1] = 0;
        for(int i=2;i<len;i++){
            M[i] =Math.min(M[i-2]+cost[i-2], M[i-1]+cost[i-1]);
        }
        return Math.min(M[len-1]+cost[len-1], M[len-2]+cost[len-2]);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] cost = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int result = solution.minCostClimbingStairs(cost);
        System.out.println(result);
    }
}

