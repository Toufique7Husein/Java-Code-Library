//created by Toufique on 24/02/2023

import java.io.*;
import java.util.*;

public class DoublyLInkedList {
    private class Node{
        int data;
        Node next, prev;
        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head, tail;
    DoublyLInkedList() {
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
        node.prev = null;
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
    public void addAt(int pos, int val) {
        if (pos == 0) {
            addFirst(val);
            return;
        }
        int cnt = 0;
        Node curr = head;
        while (curr != null) {
            if (cnt == (pos - 1)) {
                break;
            }
            cnt++;
            curr = curr.next;
        }
        if (curr == null) return;
        Node next = curr.next;
        if (next == null) {
            addLast(val);
            return;
        }
        Node node = new Node(val);
        curr.next = node;
        node.prev = curr;
        node.next = next;
        next.prev = node;
    }

    public void deleteAt(int idx) {
        Node delete = head;
        int cnt = 0;
        while (delete != null) {
            if (cnt == idx) {
                break;
            }
            cnt++;
            delete = delete.next;
        }
        if (delete == null) return;   
        (delete.prev).next = delete.next;
    }
    public void print() {
        Node node = head;
        while (node != null) {
            debug(node.data);
            node = node.next;
        }
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
