package leetcode.array;

import org.junit.Test;

/**
 * @description: 多点之间最小距离 (切比雪夫距离)
 * @author: caozhijia
 * @create: 2019/12/29 21:37
 *
 * 平面上有 n 个点，点的位置用整数坐标表示 points[i] = [xi, yi]。请你计算访问所有这些点需要的最小时间（以秒为单位）。
 *
 * 你可以按照下面的规则在平面上移动：
 *
 * 每一秒沿水平或者竖直方向移动一个单位长度，或者跨过对角线（可以看作在一秒内向水平和竖直方向各移动一个单位长度）。
 * 必须按照数组中出现的顺序来访问这些点。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-time-visiting-all-points
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class PrvotIndexTest {


    @Test
    public void test() {
        int[][] points = {{1, 1}, {3, 4}, {-1, 0}};
        int result = minTimeToVisitAllPoints(points);
        System.out.println(result);
    }

    public int minTimeToVisitAllPoints(int[][] points) {
        int count = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int countX = Math.abs(points[i][0] - points[i + 1][0]);
            int countY = Math.abs(points[i][1] - points[i + 1][1]);
            if (countX > countY) {
                count += countX;
            } else if (countX == countY) {
                count += countX;
            } else {
                count += countY;
            }
        }
        ;

        return count;
    }
}
