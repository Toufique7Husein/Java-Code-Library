//created by Toufique on 21/01/2023

import java.io.*;
import java.util.*;

public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList() {
        this.size = 0;
    }

    public void addFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        size += 1;
        if (tail == null) {
            tail = head;
        }
    }

    public void addLast(int val) {
        if (tail == null) {
            addFirst(val);
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;
    }

    public int getFirst() {
        return 0;
    }
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


    private class Node{
        private int data;
        private Node next;
        Node(int data) {
            this.data = data;
        }
        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

}
