package com.njust.easy.hammingdistance;

/**
 * Created by trey on 17-7-7.
 */
public class Test {
    public static void main(String[] args) {
        Sulotion sulotion =new Sulotion();
        LeetSulotion leetSulotion =new LeetSulotion();
        int x =13;
        int y = 9;
        int result=sulotion.hammingDistance(x,y);
        System.out.println("my answer: "+result);
        int lr =leetSulotion.hammingDistance(x, y);
        System.out.println("leet answer: "+lr);
    }
}
