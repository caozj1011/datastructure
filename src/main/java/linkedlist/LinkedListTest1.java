package linkedlist;


import java.util.HashMap;

/**
 * @description: 递归反转链表
 * @author: caozhijia
 * @create: 2019/10/22 09:54
 */
public class LinkedListTest1 {


    public static class Node {
        public int value;
        public Node next;

        public Node(int data) {
            this.value = data;
        }


        public int addList(Node node){
            if(this.next == null){
                this.next = node;
            }

            while (this.next != null){
                this.next = this.next.next;
            }
            this.next = node;
            return node.value;
        }

        public void showList(Node node){
            if(node == null){
                System.out.println("链表为空");
                return;
            }

            while (node.next != null){
                System.out.println();
            }
        }

    }

    public Node reverse(Node head) {
        if (head == null || head.next == null){
            return head;
        }
        Node temp = head.next;
        Node newHead = reverse(head.next);
        temp.next = head;
        head.next = null;
        return newHead;
    }




    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        HashMap hashMap1 = new HashMap();
        HashMap hashMap2 = new HashMap();
        System.out.println(hashMap.hashCode());
        System.out.println(hashMap1.hashCode());
        System.out.println(hashMap2.hashCode());
        System.out.println("sssss".hashCode());
        System.out.println("sss1ss".hashCode());
    }
}
