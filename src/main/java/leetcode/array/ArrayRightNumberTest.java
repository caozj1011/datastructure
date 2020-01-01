package leetcode.array;

import org.junit.Test;

/**
 * @description: 数组右边最大值
 * @author: caozhijia
 * @create: 2019/12/31 15:52
 * <p>
 * <p>
 * 给你一个数组 arr ，请你将每个元素用它右边最大的元素替换，如果是最后一个元素，用 -1 替换。
 * <p>
 * 完成所有替换操作后，请你返回这个数组。
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * 输入：arr = [17,18,5,4,6,1]
 * 输出：[18,6,6,6,1,-1]
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= arr.length <= 10^4
 * 1 <= arr[i] <= 10^5
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/replace-elements-with-greatest-element-on-right-side
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ArrayRightNumberTest {

    @Test
    public void test() {
//        arr = [17,18,5,4,6,1]
//        [17,18,5,4,6,1]
        int[] array = {17,18,5,4,6,1};

        int[] ints = maxArray(array);

        for (int a :
                ints) {
            System.out.println(a);
        }
        System.out.println();

    }


    public int[] maxArray(int[] array) {
        int maxNumber = 0;
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (maxNumber < array[j]) {
                    maxNumber = array[j];
                }

            }
            if(i == array.length-1){
                maxNumber = -1;
            }
            result[i] = maxNumber;
            maxNumber = 0;
        }

        return result;
    }


}
