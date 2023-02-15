//created by Toufique on 15/02/2023

import java.io.*;
import java.util.*;

public class SLL2 {
    Node head, tail;

    SLL2() {
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
        Node node = new Node(val);
        if (head == null) {
            addFirst(val);
            return;
        }
        tail.next = node;
        tail = node;
    }

    public void addPos(int pos, int val) {
        Node temp = head;
        if (pos == 0) {
            addFirst(val);
            return;
        }
        Node prev = null;
        int currPos = 0;
        while (temp != null) {
            if (currPos == (pos - 1)) {
                prev = temp;
                break;
            }
            temp = temp.next;
            currPos++;
        }
        Node node = new Node(val);
        node.next = temp.next;
        prev.next = node;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void removeFirst() {
        if (head == null) return;
        head = head.next;
    }

    public void removeLast() {
        if (head == null) return;
        Node temp = head;
        Node prev = null;
        while (temp != tail) {
            prev = temp;
            temp = temp.next;
        }
        System.err.println(prev.data);
        prev.next = null;
        tail = prev;
    }

    public void removeAt(int ind) {
        if (ind == 0) {
            removeFirst();
            return;
        }
        Node temp = head;
        Node prev = null;
        int curr = 0;
        while (temp != null) {
            if (curr == (ind - 1)) {
                prev = temp;
                break;
            }
            temp = temp.next;

        }
        prev.next = prev.next.next;
    }

    private class Node{
        Node next;
        int data;
        Node(int data) {
            this.data = data;
        }
    }
}
