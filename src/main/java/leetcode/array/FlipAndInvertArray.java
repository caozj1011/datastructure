package leetcode.array;

import org.junit.Test;

/**
 * @description: 翻转数组
 * @author: caozhijia
 * @create: 2020/01/01 15:08
 * <p>
 * <p>
 * 给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
 * <p>
 * 水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
 * <p>
 * 反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [[1,1,0],[1,0,1],[0,0,0]]
 * 输出: [[1,0,0],[0,1,0],[1,1,1]]
 * 解释: 首先翻转每一行: [[0,1,1],[1,0,1],[0,0,0]]；
 * 然后反转图片: [[1,0,0],[0,1,0],[1,1,1]]
 */
public class FlipAndInvertArray {

@Test
    public void test(){
//        [[1,1,0],[1,0,1],[0,0,0]]

        int[][] testArray = {{1,1,0},{1,0,1},{0,0,0}};


        flipAndInvertArray(testArray);
    }

    @Test
    public void test2(){
        int [] arr   = {1,2,3};

        for (int i = arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }


    }

    public int[][] flipAndInvertArray(int[][] arr) {
        int[][] result = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i].length-1; j >= 0; j--) {
                result[i][arr[i].length -1 - j] = arr[i][j] == 0 ? 1:0;
            }
        }
        return null;
    }
}
