package sparsearray;

import org.junit.Test;

import java.io.*;

/**
 * @description: 稀疏数组的抽象和还原
 * @author: caozhijia
 * @create: 2019/10/16 10:50
 */
public class SparseArrayTest {

    @Test
    public void test01() throws IOException {
        int[][] array1 = new int[10][10];

        System.out.println(array1.length);



        array1[1][2] = 1;
        array1[2][3] = 2;

        int count = 0;
        for (int[] tmpArray : array1) {
            for (int data : tmpArray) {
                if(data != 0){
                    count ++;
                }
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }

        // 1.将二维数组转为稀疏数组
        int[][] sparseArray = new int[count + 1][3];
        sparseArray[0][0] = 10;
        sparseArray[0][1] = 10;
        sparseArray[0][2] = count;

        int countNumber = 0;
        for (int i = 0;i<10;i++) {
            for (int j =0;j<10;j++) {
                if(array1[i][j] != 0){
                    countNumber ++;
                    sparseArray[countNumber][0] = i;
                    sparseArray[countNumber][1] = j;
                    sparseArray[countNumber][2] = array1[i][j];
                }
            }
        }


        for (int[] tmpArray : sparseArray) {
            for (int data : tmpArray) {
                if(data != 0){
                    count ++;
                }
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }

        FileOutputStream fileInputStream = new FileOutputStream(new File("./number.txt"));
        fileInputStream.write("发反反复复".getBytes());
        fileInputStream.close();
    }
}
