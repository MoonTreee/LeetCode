package com.njust.easy.anagrams;


import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abab";
        String p = "ab";
        List<Integer> result = solution.findAnagrams(s,p);
        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i).toString());
        }
    }
}
