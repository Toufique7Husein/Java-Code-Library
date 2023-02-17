//created by Toufique on 15/02/2023

import java.io.*;
import java.util.*;

public class DLL {
    private class Node{
        Node next;
        Node prev;
        int data;


        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;

    public void addFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void addLast(int val) {
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        Node node = new Node(val);
        last.next = node;
        node.prev = last;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void addAt(int at, int val) {
        Node node = new Node(val);
        if (at == 0) {
            addFirst(val);
            return;
        }
        int cnt = 0;
        Node temp = head;
        Node need = null;
        while (temp != null) {
            if (cnt == at) {
                need = temp;
                break;
            }
            temp = temp.next;
            cnt++;
        }
        Node prev = need.prev;
        prev.next = node;
        node.next = need;
    }

    public void printRevers() {
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        while (last != null) {
            System.out.println(last.data);
            last = last.prev;
        }
    }

    public void deleteFirst() {
        if (head == null) return;
        head = head.next;
        head.prev = null;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
