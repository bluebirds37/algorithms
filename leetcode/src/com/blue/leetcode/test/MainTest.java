package com.blue.leetcode.test;

import com.blue.leetcode.interview.Interview0109;
import com.blue.leetcode.subject.Subject1510;
import com.blue.leetcode.subject.Subject307;

public class MainTest {
    public static void main(String[] args) {
        System.out.println(winnerSquareGame(8));
        System.out.println(winnerSquareGame(2));
        System.out.println(winnerSquareGame(3));
        System.out.println(winnerSquareGame(7));
        System.out.println(winnerSquareGame(17));

    }

    public static boolean winnerSquareGame(int n) {
        int countA = 0;
        int countB = 0;
        double sqrt = Math.sqrt(n);
        //判断是否含有小数
        if (sqrt - (int) sqrt == 0) {
            //平方数
            return true;
        }
        int m = n;
        while (m >= 1) {
            sqrt = Math.sqrt(m);
            //判断是否含有小数
            if (sqrt - (int) sqrt == 0) {
                if (countA <= countB) {
                    countA++;
                } else {
                    countB++;
                }
                //平方数
                n = n - m;
                m = n;
                continue;
            }
            m--;
        }
        if (countA > countB) {
            return true;
        } else {
            return false;
        }
    }


}
