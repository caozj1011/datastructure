package queue;


/**
 * @description: 环形队列的实现
 * @author: caozhijia
 * @create: 2019/10/18 19:44
 */
public class CircleQueueTest {


}


class CircleQueue {
    private int front;
    private int tail;
    private int maxSize;
    private int[] data;

    public CircleQueue(int maxSize) {
        this.maxSize = maxSize;
        this.data = new int[maxSize];
        this.front = 0;
        this.tail = 0;
    }

    /**
     * 判断队列是否满
     *
     * @return
     */
    public boolean isFull() {
        return (tail + 1) % maxSize == front;
    }

    /**
     * 判断队列是否空
     *
     * @return
     */
    public boolean isEmpty() {
        return front == tail;
    }

    /**
     * 向队列中添加元素
     *
     * @param n
     * @return
     */
    public int addQueue(int n) {
        if (isFull()) {
            throw new RuntimeException("环形队列已满，不能继续添加数据!");
        }

        data[tail] = n;
        tail = (tail + 1) % maxSize;
        return n;
    }

    /**
     * 从队列中获取元素
     *
     * @return
     */
    public int getQueue() {

        if (isEmpty()) {
            throw new RuntimeException("队列已空，不能继续取元素");
        }
        int result = data[front];
        front = (front + 1) % maxSize;
        return result;
    }

    /**
     * 现队列中数据个数
     *
     * @return
     */
    public int liveDataNumber() {
        return (tail + maxSize - front) % maxSize;
    }


    public void showQueue() {

        int f = front % maxSize;
        int t = (tail + maxSize - front) % maxSize;
        for (int i = f; i < t; i++) {
            System.out.println(data[i]);
        }
    }

}
