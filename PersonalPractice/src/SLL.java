//created by Toufique on 21/02/2023

import java.io.*;
import java.util.*;

public class SLL {
    private Node head, tail;

    SLL() {
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
        head = node;
    }

    public void addLast(int val) {
        if (head == null) {
            addLast(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
    }

    public void print() {
        Node curr = head;
        while (curr != null) {
            debug(curr.data);
            curr = curr.next;
        }
    }



    private class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
        @Override
        public String toString() {
            return "[" + this.data + "]";
        }
    }
    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
