package LinkedList;

import java.util.LinkedList;

public class SingleLinkedList {
    Node head;

//    public SingleLinkedList remove(SingleLinkedList list, int i) {
//        if (list.head == null) {
//            System.out.println("List is null ");
//        } else {
//
//            while (list.head.data != i) {
//    list.head
//            }
//        }
//    }

    static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public static SingleLinkedList add(SingleLinkedList list, int d) {
        Node node = new Node(d);
        if (list.head == null) {
            list.head = node;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
            System.out.println("Element added" + last.next.data);

        }
        return list;
    }

    public static void print(Node head) {
        if (head != null) {
            while (head != null) {
                System.out.println(">" + head.data);
                head = head.next;
            }
        } else {
            System.out.println("List is Blank");
        }
    }


}

class ImplListList {
    public static void main(String ar[]) {
        SingleLinkedList list = new SingleLinkedList();
        list = list.add(list, 1);
        list = list.add(list, 2);
       // list = list.remove(list, 2);
        list.print(list.head);
    }
}
