package com.blue.leetcode.subject;

/**
 * 1510. 石子游戏 IV
 * Alice 和 Bob 两个人轮流玩一个游戏，Alice 先手。
 * <p>
 * 一开始，有 n 个石子堆在一起。每个人轮流操作，正在操作的玩家可以从石子堆里拿走 任意 非零 平方数 个石子。
 * <p>
 * 如果石子堆里没有石子了，则无法操作的玩家输掉游戏。
 * <p>
 * 给你正整数 n ，且已知两个人都采取最优策略。如果 Alice 会赢得比赛，那么返回 True ，否则返回 False 。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：n = 1
 * 输出：true
 * 解释：Alice 拿走 1 个石子并赢得胜利，因为 Bob 无法进行任何操作。
 * 示例 2：
 * <p>
 * 输入：n = 2
 * 输出：false
 * 解释：Alice 只能拿走 1 个石子，然后 Bob 拿走最后一个石子并赢得胜利（2 -> 1 -> 0）。
 * 示例 3：
 * <p>
 * 输入：n = 4
 * 输出：true
 * 解释：n 已经是一个平方数，Alice 可以一次全拿掉 4 个石子并赢得胜利（4 -> 0）。
 * 示例 4：
 * <p>
 * 输入：n = 7
 * 输出：false
 * 解释：当 Bob 采取最优策略时，Alice 无法赢得比赛。
 * 如果 Alice 一开始拿走 4 个石子， Bob 会拿走 1 个石子，然后 Alice 只能拿走 1 个石子，Bob 拿走最后一个石子并赢得胜利（7 -> 3 -> 2 -> 1 -> 0）。
 * 如果 Alice 一开始拿走 1 个石子， Bob 会拿走 4 个石子，然后 Alice 只能拿走 1 个石子，Bob 拿走最后一个石子并赢得胜利（7 -> 6 -> 2 -> 1 -> 0）。
 * 示例 5：
 * <p>
 * 输入：n = 17
 * 输出：false
 * 解释：如果 Bob 采取最优策略，Alice 无法赢得胜利。
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= n <= 10^5
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/stone-game-iv
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Subject1510 {

    public class Solution {

        public boolean winnerSquareGame(int n) {
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
                }
                m--;
            }
            if (count % 2 != 0) {
                return true;
            }
            return false;
        }
    }

}
