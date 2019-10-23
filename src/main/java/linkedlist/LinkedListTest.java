package linkedlist;

import java.util.LinkedList;

/**
 * @description: 单链表模拟实现
 * @author: caozhijia
 * @create: 2019/10/19 14:45
 */
public class LinkedListTest {
    public static void main(String[] args) {

        LinkedList linkedList1 = new LinkedList();
        Node node = new Node(1);
        LinkedListDemo linkedList = new LinkedListDemo();
        linkedList.addNode(node);
        linkedList.addNode(new Node(2));
        linkedList.showList();
    }
}


class LinkedListDemo {
    private Node headNode = new Node(0);

    public boolean addNode(Node addNode) {
        Node temp = headNode;
        while (true) {
            if (temp.next == null) {
                temp.next = addNode;
                break;
            }
            temp = temp.next;
        }
        return true;
    }

    public void showList() {
        Node node = headNode;
        while (true) {
            if (node == null) {
                break;
            }
            System.out.println(node);
            node = node.next;
        }
    }


    public void insert(Node n) {
        Node node = headNode;

        Node tmp = n;
        while (true) {
            if (node == null) {
                break;
            }
            if (node.data < n.data) {
                tmp.next = node.next;
                node.next = tmp;
            }
            node = node.next;
        }
    }


    public void delete(int n) {
        Node node = headNode;


    }


}

class Node {
    public int data;
    public Node next;

    public Node(int _data) {
        this.data = _data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
