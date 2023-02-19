//created by Toufique on 20/02/2023

import java.io.*;
import java.util.*;

public class DLLT {
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
    DLLT() {
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

    public void addLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            addFirst(val);
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    public void addAt(int idx, int val) {
        Node node = new Node(val);
        Node temp = head;
        if (idx == 0) {
            addFirst(val);
            return;
        }
        Node curr = null;
        int cnt = 0;
        while (temp != null) {
            if (cnt == idx) {
                curr = temp;
                break;
            }
            temp = temp.next;
            cnt++;
        }
        Node prev = curr.prev;
        node.next = curr;
        curr.prev = node;
        prev.next = node;
        node.prev = prev;
    }

    public void deleteAt(int idx) {
        if (idx == 0) {
            return;
        }
        Node temp = head;
        Node delete = null;
        int cnt = 0;
        while (temp != null) {
            if (cnt == idx) {
                delete = temp;
                break;
            }
            cnt++;
            temp = temp.next;
        }
        if (delete == null) return;
        Node prev = delete.prev;
        Node next = delete.next;
        prev.next = next;
        next.prev = prev;
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
