package com.njust.easy.hammingdistance;

/**
 * Created by trey on 17-7-7.
 */
public class LeetSulotion {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
