//created by Toufique on 18/02/2023

import java.io.*;
import java.util.*;

public class DLL3 {
    private class Node{
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    Node head, tail;
    DLL3() {
        this.head = null;
    }

    public void addFirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        head.prev = node;
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

    public void print() {
        Node node = head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }


}
