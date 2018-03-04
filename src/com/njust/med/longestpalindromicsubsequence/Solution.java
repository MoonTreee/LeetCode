package com.njust.med.longestpalindromicsubsequence;

/**
 * Created by Tree on 2017/12/18.
 */
public class Solution {
    /**
     * 最长回文字符串
     *Given a string s, find the longest palindromic subsequence's length in s.
     *You may assume that the maximum length of s is 1000.
     *思路：
     *1.对字符串进行截取：截取的规则是选取indexOf和lastIndexOf，即对于频数>2的进行首位截取
     *2.递归进行，直到剩下的字符串无频数>2的字符
     *3.如果剩下的字符串为空，则返回result；否则返回result+1
     *
     *通过率为74 / 83
     *原因：对频数的判断默认顺序是按照字符串顺序，不同的截取方式可能对结果造成影响；
     *例如："aabaaba"
     *第一次截取：abaab，没毛病
     *第二次截取：ba 或者 aa，两种截取方式产生结果不同
     *
     *
     *
     * longestPalindromeSubseqTop()为leetcode高赞解法，非常美妙，其中心思想是利用矩阵记录最长回文长度,
     * 并采用动态规划迭代进行。
     * 例如：dp[2][6]就是子字符串s.substring(2,7)的最大回文长度
     * 对于dp[i][j]：
     * 1.如果s[i] == s[j],那么dp[i][j] = dp[i+1][j-1] + 2  之所以为i+1，是因为i是从s.length-1开始到0；
     * 2.如果s[i] != s[j],那么dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1])
     *
     * 由此，dp[0][s.length-1]就是最终答案了。
     */
    public int longestPalindromeSubseq(String s) {
        int result = 0;
        while(moreThen2(s)){
            int gap = 0;
            int X = 0;
            int Y = 0;
            for(int i=0;i<s.length();i++){
                Character c = s.charAt(i);
                int x = s.indexOf(c);
                int y = s.lastIndexOf(c);
                if(gap<(y-x)){
                    gap = y - x;
                    X = x;
                    Y = y;
                }
            }

            s = s.substring(X+1, Y);
            // System.out.println(s);
            result+=2;
        }
        if(s.length()==0){
            return result;
        }else{
            return result + 1;
        }
    }

    public boolean moreThen2(String s){
        boolean result = false;
        for(int i=0;i<s.length();i++){
            if(s.indexOf(s.charAt(i))!=s.lastIndexOf(s.charAt(i))){
                result = true;
                break;
            }
        }
        return result;

    }

    public int longestPalindromeSubseqTop(String s) {
        int[][] dp = new int[s.length()][s.length()];

        for (int i = s.length() - 1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i+1][j-1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
                }
            }
        }
        return dp[0][s.length()-1];
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Solution solution = new Solution();
        String s = "aabaaba";
        // System.out.println(s);
        int i = solution.longestPalindromeSubseqTop(s);
        System.out.println(i);
    }

}
