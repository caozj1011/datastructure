package queue;

import org.apache.commons.lang.SystemUtils;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @description: 用数组实现队列
 * @author: caozhijia
 * @create: 2019/10/17 19:30
 */
public class ArrayQueueTest {

    private int maxSize;
    private int front;
    private int after;
    private int[] data;


    public ArrayQueueTest(Integer queueMaxSize) {
        if (queueMaxSize <= 0) {
            throw new RuntimeException("初始化队列必须为正整数！");
        }
        maxSize = queueMaxSize;
        data = new int[queueMaxSize];
        front = -1;
        after = -1;
    }


    public boolean isFull() {
        return after == maxSize - 1;
    }


    public boolean isEmpty() {
        return front == after;
    }


    public int put(int number) {
        if (isFull()) {
            throw new RuntimeException("队列已满，不能继续向队列内增加元素");
        }
        after++;
        data[after] = number;
        return number;
    }

    public int get() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空，不能继续获取元素");
        }

        front++;
        return data[front];
    }


    public void printQueue() {
        for (int ele : data) {
            System.out.println(ele);
        }
    }


//    public static void main(String[] args) {
//        ArrayQueueTest arrayQueueTest = new ArrayQueueTest(3);
//
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            String msg = scanner.nextLine();
//            switch (msg) {
//                case "p":
//                    System.out.println("加入操作，请输入要增加的元素：");
//                    int data = scanner.nextInt();
//                    arrayQueueTest.put(data);
//                    arrayQueueTest.printQueue();
//                    break;
//                case "g":
//                    System.out.println("获取操作");
//                    arrayQueueTest.get();
//                    arrayQueueTest.printQueue();
//                    break;
//                case "f":
//                    System.out.println(arrayQueueTest.isFull());
//                    break;
//                case "e":
//                    System.out.println(arrayQueueTest.isFull());
//                    break;
//                default:
//            }
//
//            System.out.println(msg);
//        }
//
//    }


    public static void main(String[] args) {
        Integer[] a = {1,165,165,165,1654,984,98,454354,654,654,65,46,54,654,65,165,13,213,21,654,654,8,498,4,984,98,4654654,65,335,4,543,5435,4,654,5,354,35,435,465,435,4,654,321321,321,3,1,165,165,165,1654,984,98,454354,654,654,65,46,54,654,65,165,13,213,21,654,654,8,498,4,984,98,4654654,65,335,4,543,5435,4,654,5,354,35,435,465,435,4,654,321321,321,31,165,165,165,1654,984,98,454354,654,654,65,46,54,654,65,165,13,213,21,654,654,8,498,4,984,98,4654654,65,335,4,543,5435,4,654,5,354,35,435,465,435,4,654,321321,321,31,165,165,165,1654,984,98,454354,654,654,65,46,54,654,65,165,13,213,21,654,654,8,498,4,984,98,4654654,65,335,4,543,5435,4,654,5,354,35,435,465,435,4,654,321321,321,31,165,165,165,1654,984,98,454354,654,654,65,46,54,654,65,165,13,213,21,654,654,8,498,4,984,98,4654654,65,335,4,543,5435,4,654,5,354,35,435,465,435,4,654,321321,321,31,165,165,165,1654,984,98,454354,654,654,65,46,54,654,65,165,13,213,21,654,654,8,498,4,984,98,4654654,65,335,4,543,5435,4,654,5,354,35,435,465,435,4,654,321321,321,31,165,165,165,1654,984,98,454354,654,654,65,46,54,654,65,165,13,213,21,654,654,8,498,4,984,98,4654654,65,335,4,543,5435,4,654,5,354,35,435,465,435,4,654,321321,321,31,165,165,165,1654,984,98,454354,654,654,65,46,54,654,65,165,13,213,21,654,654,8,498,4,984,98,4654654,65,335,4,543,5435,4,654,5,354,35,435,465,435,4,654,321321,321,31,165,165,165,1654,984,98,454354,654,654,65,46,54,654,65,165,13,213,21,654,654,8,498,4,984,98,4654654,65,335,4,543,5435,4,654,5,354,35,435,465,435,4,654,321321,321,3};
        long beginTime = System.currentTimeMillis();

        int sum = 0;
        boolean flag = true;
        int lastIndex = 0;
        int sortIndex = a.length -1;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 -i; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    flag = false;
                    lastIndex = j;
                }
                sum += 1;
            }
            sortIndex = lastIndex;
            if(flag){
                break;
            }
        }
        long endTime = System.currentTimeMillis();

        List<Integer> ints = Arrays.asList(a);
        ints.stream().forEach(x -> System.out.println(x));
        System.out.println(endTime -beginTime);
    }

    public static int digui(int n) {


        if (n == 1) {
            return 1;
        }
        System.out.println(n);
        int result = n * digui(n - 1);
        return result;
    }

@Test
    public void test01() {



    }


}
