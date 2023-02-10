//created by Toufique on 10/02/2023

import java.io.*;
import java.util.*;

public class CirculerLinkedList {
    private Node head;
    private Node tail;

    CirculerLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void print() {
        Node node = head;
        if (head != null) {
            do {
                System.out.println(node.val);
                node = node.next;
            } while (node != head);
        }
    }

    private class Node{
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
