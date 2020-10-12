package com.blue.leetcode.test;

import com.blue.leetcode.interview.Interview0109;
import com.blue.leetcode.subject.Subject1510;
import com.blue.leetcode.subject.Subject307;

public class MainTest {
    public static void main(String[] args) {
        System.out.println(winnerSquareGame(3));

    }

    public static boolean winnerSquareGame(int n) {
        int count = 0;
        double sqrt = Math.sqrt(n);
        //判断是否含有小数
        if (sqrt - (int) sqrt == 0) {
            //平方数
            return true;
        }
        int m = n;
        while (m > 1) {
            sqrt = Math.sqrt(m);
            //判断是否含有小数
            if (sqrt - (int) sqrt == 0) {
                //平方数
                n = n - m;
                count++;
                m = n;
            }
            m--;
        }
        if (count != 1 && count % 2 != 0) {
            return true;
        }
        return false;
    }


}
