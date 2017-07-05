package com.njust.easy.anagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
 * Strings consists of lowercase English letters only and the length of both strings s and p
 * will not be larger than 20,100.
 * The order of output does not matter.
 *
 *
 * Exa:
 * Input :
 * s: "cbaebabacd" p: "abc"
 * Output :
 * [0, 6]
 *
 *
 * 思路：
 * 1.对于p，建立char-int键值对记录每个字母出现的次数，保存在pDic中；
 * 2.遍历s，每次取出和p等长的字符串，做同样操作生成sDic，并做对比
 */
public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result =new ArrayList<>();
        int pLen = p.length();
        Map<Character,Integer> pDic = this.getDic(p);
        int len = s.length();
        for(int i=0;i<len-pLen+1;i++){
            boolean flag = true;
            String sSub  = s.substring(i,i+pLen);
            //System.out.println(sSub);
            Map<Character,Integer> sDic = this.getDic(sSub);
            //System.out.println(sDic.equals(pDic));
            for(char pDicKey : pDic.keySet()){
                if(!(sDic.get(pDicKey)==pDic.get(pDicKey))){
                    flag = false;
                    break;
                }
            }
            if(flag)result.add(i);
        }
        return result;
    }

    public Map<Character,Integer> getDic(String p){
        Map<Character,Integer> dic = new HashMap<>();
        char[] chars = p.toCharArray();
        for(char c:chars){
            String[] arr = (p+",").split(String.valueOf(c));
            dic.put(c, arr.length-1);
        }
//        System.out.println("字典是");
//        for(char c:dic.keySet()){
//            System.out.println(c+" :"+dic.get(c));
//        }
        return dic;
    }
}
