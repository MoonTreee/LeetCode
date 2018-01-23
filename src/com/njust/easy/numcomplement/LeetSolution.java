package com.njust.easy.numcomplement;

public class LeetSolution {
    public int findComplement(int num) {
        return ~num & ((Integer.highestOneBit(num) << 1) - 1);
    }
}
