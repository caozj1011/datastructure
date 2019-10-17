package arrayqueue;

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


    public static void main(String[] args) {
        ArrayQueueTest arrayQueueTest = new ArrayQueueTest(3);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String msg = scanner.nextLine();
            switch (msg) {
                case "p":
                    System.out.println("加入操作，请输入要增加的元素：");
                    int data = scanner.nextInt();
                    arrayQueueTest.put(data);
                    arrayQueueTest.printQueue();
                    break;
                case "g":
                    System.out.println("获取操作");
                    arrayQueueTest.get();
                    arrayQueueTest.printQueue();
                    break;
                case "f":
                    System.out.println(arrayQueueTest.isFull());
                    break;
                case "e":
                    System.out.println(arrayQueueTest.isFull());
                    break;
                default:
            }

            System.out.println(msg);
        }

    }

}
