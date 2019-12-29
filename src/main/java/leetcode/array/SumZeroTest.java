package leetcode.array;

import org.junit.Test;

/**
 * @description: 数组中心索引
 * @author: caozhijia
 * @create: 2019/12/26 15:07
 *
 * 给你一个整数 n，请你返回 任意 一个由 n 个 各不相同 的整数组成的数组，并且这 n 个数相加和为 0 。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：n = 5
 * 输出：[-7,-1,1,3,4]
 * 解释：这些数组也是正确的 [-5,-1,1,2,3]，[-3,-1,2,-2,4]。
 * 示例 2：
 *
 * 输入：n = 3
 * 输出：[-1,0,1]
 * 示例 3：
 *
 * 输入：n = 1
 * 输出：[0]
 *
 */
public class SumZeroTest {

    @Test
    public void test() {
        int[] ints = sumZero(11);
        for (int num :
                ints) {
            System.out.println(num);
        }
    }

    public int[] sumZero(int n) {
        if (n == 1) {
            return new int[]{0};
        } else if (n % 2 == 0) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                if (i < n / 2) {
                    arr[i] = i+1;
                } else {
                    arr[i] = i - n ;
                }
            }
            return arr;
        } else {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                if (i < n / 2) {
                    arr[i] = i+1;
                } else if (i == n / 2) {
                    arr[i] = 0;
                } else {
                    arr[i] = i - n;
                }
            }
            return arr;
        }
    }

}
