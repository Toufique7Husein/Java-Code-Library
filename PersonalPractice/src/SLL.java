//created by Toufique on 21/02/2023

import java.io.*;
import java.util.*;

public class SLL {
    private Node head, tail;
    SLL() {
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
        tail = node;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            debug(temp.data);
            temp = temp.next;
        }
    }

    public void addAt(int at, int data) {
        if (at == 0) {
            addLast(data);
            return;
        }
        Node prev = head;
        int cnt = 0;
        while (prev != null) {
            if ((cnt == at - 1)) {
                break;
            }
            cnt++;
            prev = prev.next;
        }
        debug(cnt, at, prev);
        Node node = new Node(data);
        node.next = prev.next;
        prev.next = node;
    }

    public void deleteFirst() {
        if (head == null) return;
        head = head.next;
    }
    public void deleteLast() {
        Node temp = head;
        Node prev = head;
        while (temp != null) {
            if (temp != tail) {
                prev = temp;
            }
            temp = temp.next;
        }
        prev.next = prev;
        tail = prev;
        tail.next = null;
    }

    public void deleteAt(int at) {
        Node temp = head;
        if (at == 0) return;
        int cnt = 0;
        while (temp != null) {
            if (at - 1 == cnt) break;
            cnt++;
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }









    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
