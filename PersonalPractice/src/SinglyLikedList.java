//created by Toufique on 25/04/2023

import java.io.*;
import java.util.*;

public class SinglyLikedList {
    private Node head, tail;


    public void addFirst(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = head;
            return;
        }
        node.next = head;
        head = node;
    }

    public void addLast(int data) {
        Node node = new Node(data);
        if (tail == null) {
            addFirst(data);
            return;
        }
        tail.next = node;
        node = tail;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            debug(temp.data);
            temp = temp.next;
        }
    }


    public class Node{
        Node next;
        int data;
        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
