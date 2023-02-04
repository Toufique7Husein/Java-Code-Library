//created by Toufique on 04/02/2023

import java.io.*;
import java.util.*;

public class SLL {
    private Node head, tail;
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
        Node node = new Node(val);
        if (tail == null) {
            addFirst(val);
            return;
        }
        tail.next = node;
        tail = node;
    }

    public void add(int at, int val) {
        if (at == 0) {
            addFirst(val);
            return;
        }
        Node temp1 = null;
        Node node = new Node(val);
        Node t = head;
        for (int i = 0; i <= at - 1; i++) {
            temp1 = t;
            t = t.next;
        }
        temp1.next = node;
        node.next = t;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val  + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public Integer removeFirst() {
        if (head == null) return null;
        Node node = head.next;
        int v = head.val;
        head = node;
        return v;
    }

    public Integer removeLast() {
        if (tail == null) return null;
        Node node = head;
        Node temp = null;
        while (node != tail) {
            temp = node;
            node = node.next;
        }
        int val = tail.val;
        tail = temp;
        temp.next = tail;
        tail.next = null;
        return val;
    }

    public int delete(int ind) {
        Node temp = head;
        Node temp1 = null;
        for (int i = 0; i < ind; i++) {
            temp1 = temp;
            temp = temp.next;
        }
        int v = temp.val;
        Node nextLink = temp.next;
        temp1.next = nextLink;
        return v;
    }



    private class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
            next = null;
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
