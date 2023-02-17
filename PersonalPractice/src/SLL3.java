//created by Toufique on 15/02/2023

import java.io.*;
import java.util.*;

public class SLL3 {
    private class Node{
        Node next;
        int data;
        Node(int data) {
            this.data = data;
        }
    }

    private Node head, tail;
    SLL3() {
        this.head = null;
        this.tail = null;
    }

    public void addFirst(int v) {
        Node node = new Node(v);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        head = node;
    }

    public void addLast(int v) {
        Node node = new Node(v);
        if (head == null) {
            addFirst(v);
            return;
        }
        tail.next = node;
        tail = node;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void addAt(int ind, int val) {
        if (ind == 0) {
            addFirst(val);
            return;
        }
        int curr = 0;
        Node currNode = head;
        Node prev = null;

        while (currNode != null) {
            if (curr == (ind - 1)) {
                prev = currNode;
                break;
            }
            currNode = currNode.next;
            curr++;
        }
        if (prev == null) return;
        Node node = new Node(val);
        node.next = prev.next;
        prev.next = node;
    }

    public void deleteFirst() {
        if (head == null) return;
        head = head.next;
    }
    public void deleteLast() {
        Node currNode = head, temp = null;
        while (currNode != tail) {
            temp = currNode;
            currNode = currNode.next;
        }
        temp.next = null;
        tail = temp;
    }

    public void deleteAt(int ind) {
        Node curr = head;
        if (ind == 0) {
            deleteFirst();
            return;
        }
        int cnt = 0;
        Node temp = null;
        while (curr != null) {
            if (cnt == (ind - 1)) {
                temp = curr;
            }
            curr = curr.next;
            cnt++;
        }
        if (temp == null) return;
        temp.next = temp.next.next;
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
