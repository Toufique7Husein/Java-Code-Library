//created by Toufique on 21/02/2023

import java.io.*;
import java.util.*;

public class SLL {
    private class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head, tail;
    public SLL() {
        this.head = null;
        this.tail = null;
    }

    public void addFirst(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        head = node;
    }
    public void addLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            addFirst(data);
            return;
        }
        tail.next = node;
        node = tail;
    }

    public void addAt(int idx, int data) {
        Node node = new Node(data);
        if (idx == 0) {
            addFirst(data);
            return;
        }
        int cnt = 0;
        Node curr = head;
        Node prev = null;

        while (curr != null){
            if ((cnt + 1) == idx) {
                prev = curr;
                break;
            }
            cnt++;
            curr = curr.next;
        }
        node.next = prev.next;
        prev.next = node;
    }

    public void deleteFirst() {
        if (head == null) return;
        head = head.next;
    }

    public void deleteAt(int idx) {
        Node curr = head;
        if (idx == 0) {
            deleteFirst();
            return;
        }
        int cnt = 0;
        while (curr != null) {
            if ((cnt + 1) == idx) {
                break;
            }
            curr = curr.next;
            cnt++;
        }
        curr.next = curr.next.next;
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
