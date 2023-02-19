//created by Toufique on 19/02/2023

import java.io.*;
import java.util.*;

public class SLL4 {
    private class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    Node head, tail;
    SLL4() {
        head = null;
        tail = null;
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
        Node node = new Node(val);
        if (head == null) {
            addFirst(val);
            return;
        }
        tail.next = node;
        tail = node;
    }

    public void addAt(int idx, int val) {
        if (idx == 0) {
            addFirst(val);
            return;
        }
        Node node = new Node(val);
        Node temp = head;
        Node prev = null;
        int cnt = 0;
        while (temp != null) {
            if (cnt == (idx - 1)) {
                prev = temp;
                break;
            }
            cnt++;
            temp = temp.next;
        }
        node.next = prev.next;
        prev.next = node;
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
