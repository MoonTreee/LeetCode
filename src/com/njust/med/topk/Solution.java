package com.njust.med.topk;

import java.util.*;

/**
 *  Given a non-empty array of integers, return the k most frequent elements.
 *  For example,
 *  Given [1,1,1,2,2,3] and k = 2, return [1,2].
 *  Note:
 *  You may assume k is always valid, 1 ? k ? number of unique elements.
 *  Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 *
 *  思路：
 *  1.使用Map记录每个int出现的次数
 *
 */
public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int len = nums.length;
        for(int i=0;i<len;i++){
            int num = nums[i];
            if(map.containsKey(num)){
                int time = map.get(num) + 1;
                map.put(num, time);
            }else {
                map.put(num, 1);
            }
        }
        ArrayList<Map.Entry<String,Integer>> entries= sortMap(map);

        for(int i=0;i<k;i++){
            System.out.println(entries.get(i).toString());
        }

        return list;
    }

    //重写sortMap，以value降序排列
    public static ArrayList<Map.Entry<String,Integer>> sortMap(Map map){
        List<Map.Entry<String, Integer>> entries = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> obj1 , Map.Entry<String, Integer> obj2) {
                return obj2.getValue() - obj1.getValue();
                // return obj2.getValue() + obj1.getValue();以升序排列
            }
        });
        return (ArrayList<Map.Entry<String, Integer>>) entries;
    }

}