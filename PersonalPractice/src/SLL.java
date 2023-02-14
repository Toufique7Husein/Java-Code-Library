//created by Toufique on 14/02/2023

import java.io.*;
import java.util.*;

public class SLL {
    private Node head, tail;
    SLL() {
        this.tail = null;
        this.head = null;
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
        if (tail == null) {
            addFirst(val);
            return;
        }
        tail.next = node;
        tail = node;
    }

    public void addAfter(int after, int val) {
        Node temp = head;
        while (temp != null && temp.data != after) {
            temp = temp.next;
        }
        if (temp == null) {
            return;
        }
        Node node = new Node(val);
        Node next = temp.next;
        temp.next = node;
        node.next = next;
    }

    public void addAtPoint(int pos, int val) {
        if (pos == 0) {
            addFirst(val);
        }
        int currInd = 0;
        Node prev = head;
        Node currNode = head;
        while (currNode != null) {
            if (currInd == (pos - 1)) {
                prev = currNode;
                break;
            }
            currNode = currNode.next;
            currInd++;
        }
        if (prev == null) return;
        Node node = new Node(val);
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

    public void removeFirst() {
        Node temp = head;
        if (temp == null) return;
        head = temp.next;
    }

    public void removeLast() {
        Node temp = tail;
        if (temp == null) return;
        temp = head;
        Node prevLast = null;
        while (temp.next != null) {
            prevLast = temp;
            temp = temp.next;
        }
        prevLast.next = null;
        tail = prevLast;
    }

    public void removeAtPoint(int v) {
        if (v == 0) {
            removeFirst();
        }
        Node temp = head;
        int curr = 0;
        Node prev = null;
        while (temp != null) {
            if (curr == (v - 1)) {
                prev = temp;
                break;
            }
            temp = temp.next;
            curr++;
        }
        prev.next = prev.next.next;
    }


    private class Node{
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
