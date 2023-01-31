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
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;
    }

    public int removeLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node temp = getReference(size - 1);
        size -= 1;
        int ans = 0;
        tail = temp;
        temp.next = tail;
        tail.next = null;
        return ans;
    }

    public int remove(int ind) {
        if (size == ind) return removeLast();
        if (size == 1) return deleteFirst();
        Node temp1 = getReference(ind - 1);
        debug(temp1.data);
        Node deleteNode = getReference(ind);
        Node temp2 = getReference(ind + 1);
        temp1.next = temp2;
        return deleteNode.data;
    }

    private Node getReference(int ind) {
        Node temp = head;
        int cnt = 1;
        while (temp != null) {
            cnt++;
            temp = temp.next;
            if (cnt == ind) return temp;
        }
        return null;
    }

    public int deleteFirst() {
        int delete = head.data;
        Node temp = head.next;
        head = temp;
        size -= 1;
        return delete;
    }


    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public int getSize() {
        return size;
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

    static void debug(Object...obj) {
        System.err.println(Arrays.deepToString(obj));
    }

}
