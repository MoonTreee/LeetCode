package com.njust.easy.balancedbinarytree;
/*
* Given a binary tree, determine if it is height-balanced.
* For this problem, a height-balanced binary tree is defined as:
* a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
*
* 思路：
*1.递归进行如果子树为非平衡，那么整个数就一定为非平衡，因此：
*  if (Math.abs(rDepth-lDepth)>1){return -1;}
*2.同时 为了保证-1可以“冒上来”：if (lDepth == -1){return -1;}
* */

// 定义二叉树
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        this.val = x;
    }
}


public class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null){
            return true;
        }

        return getDepth(root)!= -1;

    }

    public int getDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int lDepth = getDepth(root.left);
        if (lDepth == -1){
            return -1;
        }
        int rDepth = getDepth(root.right);
        if (rDepth == -1){
            return -1;
        }

        if (Math.abs(rDepth-lDepth)>1){
            return -1;
        }
        return Math.max(lDepth, rDepth) +1;
    }
}
