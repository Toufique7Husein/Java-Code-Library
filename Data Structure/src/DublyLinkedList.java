//created by Toufique on 31/01/2023

import java.io.*;
import java.util.*;

public class DublyLinkedList {
    Node head;
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
        Node node = new Node(val);

    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void printRevers() {
        Node temp = head;
        Node last = null;
        while (temp != null) {
            temp = temp.next;
            if (temp != null) last = temp;
        }
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
        System.out.println();
    }



    private class Node{
        int data;
        Node next, prev;

        Node(int data) {
            this.data = data;
        }

        Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

    }

    public void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
