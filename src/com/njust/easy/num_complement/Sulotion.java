package com.njust.easy.num_complement;

/**
 * Created by trey on 17-7-7.
 * Given a positive integer, output its complement number.
 * The complement strategy is to flip the bits of its binary representation.
 *
 * 思路：
 * 1.求出n的二进制表示的位数为i;
 * 2.result = 2的i次方-1-n
 *
 * 遇到的问题：2147483647应该输出的0,但是我输出的是-1.
 * 原因，直接使用强制转换（int）会有损失，--应该先new 一个Double类型再进行intValue--；
 * 上面那句话是博客上说的，实践证明并没有什么卵用！
 *
 * 熟悉一下java中的位运算
 * 按位与 &
 * 按位或 |
 * 按位异或 ^
 * 按位取反 ~
 * 左移 <<
 *
 */
class Sulotion {
    int findComplement(int num) {
        int i = Integer.toBinaryString(num).length();
        int d = 1;
//        Double d = Math.pow(2,i);
//        int result = d.intValue()-1-num;

        for(int j=0;j<i;j++){
            d*=2;
        }
        return d-1-num;
    }
}
