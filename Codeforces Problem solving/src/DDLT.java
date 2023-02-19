//created by Toufique on 20/02/2023

import java.io.*;
import java.util.*;

public class DDLT {
    private class Node{
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head, tail;
    DDLT() {
        this.head = null;
        this.tail = null;
    }

    public void addFirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            debug(temp.data);
            temp = temp.next;
        }
    }



    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
