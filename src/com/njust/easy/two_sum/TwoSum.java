package com.njust.easy.two_sum;

import java.util.ArrayList;

/**
 * Given an array of integers, return indices of the
 * two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one
 * solution, and you may not use the same element twice.
 *
 *
 *Exa:
 *Given nums = [2, 7, 11, 15], target = 9,
 *Because nums[0] + nums[1] = 9,
 *return [0, 1]
 *
 *被题目描述坑了，测试之后确认应该是返回最相加之和最接近target的两个元素的索引
 *题目描述的思路应该是思路1，但是测试之后应该是思路2
 *另外不知道为了尽量按照少引入别的类以及另写方法进行调用，所以整个程序的过程很冗余，
 *还不是很熟悉leetcode的套路（刚刚就被题目描述给坑了），谨慎起见，方法进行手工重写吧，见谅！
 *
 *21:35 提交的时候又报bug了，如果数组里面出现负数，情况又不一样，晕。
 *
 *思路1：
 *从nums[0]处开始遍历，先假设nums[0]+nums[i]=target
 *则 nums[i] = target - nums[0]
 *遍历剩下的元素，找到i的值
 *return [0,i]
 *
 *思路2：
 *目标  result = int[1]{nums.indexof(x), nums.indexof(y)}
 *先找出nums[]中所有小于target的元素，并组成含有n个元素新的数组addend[]
 *addend[]中所有的元素于其他元素相加，形成nxn的倒三角矩阵+每相加一次，更新一次x，y的值；
 *如果int[x]+int[y]==target,break
 *
 */
public class TwoSum {
	public int[] twoSum(int[] nums, int target ){
		//x,y用于存放目标索引对应的值
		int x = 0,y = 0;
		//X,Y用户存放目标索引
		int X = 0,Y = 0;
		//flag用于计算两元素和与target的差值，默认为target，当为零时程序遍历结束，否则一直遍历找到最小值
		int flag = target;
		//将数组中比target的所有元素存放在list中，以期提高效率
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i : nums){
			if(i<=target) list.add(i);
		}
		int length = list.size();

		//遍历list，两两求和：为零退出；否则找出最小值-->确定x，y
		for(int i=0;i<length-1;i++){
			for(int j=i+1;j<length;j++){
				int m =target - (list.get(i).intValue()+list.get(j).intValue());
				if(m==0){
					x = list.get(i).intValue();
					y = list.get(j).intValue();
					break;
				}
				if(m != 0 && m<flag){
					flag = m;
					x = list.get(i).intValue();
					y = list.get(j).intValue();
				}
			}
		}

		//确定 X,Y
		boolean stu = false;
		if(!stu){
			for(int i=0;i<nums.length-1;i++){
				if(nums[i]==x){
					stu = true;
					X = i;
					for(int j=i+1;j<nums.length;j++){
						if(nums[j]==y){
							Y = j;
							break;
						}
					}
					if(stu)break;
				}
			}
		}

		int[] result = new int[]{X, Y};
		return result;

	}

}
