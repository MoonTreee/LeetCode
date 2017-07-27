package com.njust.easy.numcomplement;

/**
 * Created by trey on 17-7-7.
 */
public class Test {
    public static void main(String[] args) {
        Sulotion sulotion = new Sulotion();
        LeetSolution leetSolution = new LeetSolution();
        int num = 2147483647;
        int result = sulotion.findComplement(num);
        System.out.println(result);

        int lr = leetSolution.findComplement(num);
        System.out.println("leetcode的答案： "+lr);
    }

}
