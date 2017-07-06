package com.njust.easy.anagrams;


import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abab";
        String p = "ab";
        List<Integer> result = solution.findAnagrams(s,p);
        for(int i=0;i<result.size();i++){
            System.out.print(result.get(i).toString());
        }
        System.out.println();

        System.out.println("标准答案的：");
        LeetSolution leetSolution = new LeetSolution();
        List<Integer> lr = leetSolution.findAnagrams(s,p);
        for(int i=0;i<lr.size();i++){
            System.out.print(lr.get(i).toString());
        }
    }
}
