package com.njust.easy.twosum;

public class Test {

	public static void main(String[] args) {
		TwoSum twoSum = new TwoSum();
		int[] nums = new int[]{2, 5, 5, 11};
		int target = 10;
		int[] reslut = twoSum.twoSum(nums, target);
		for(int i:reslut){
			System.out.print(i);
		}

	}

}
