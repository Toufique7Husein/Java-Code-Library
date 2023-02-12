import java.io.*;
import java.util.*;

public class SLL{
    class Node{
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    Node head, tail;
    SLL() {
        this.head = null;
        this.tail = null;
    }

    void addFirst(int val) {
        Node node = new Node(val);
        if(head == null) {
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        head = node;
    }

    void addLast(int val) {
        Node node = new Node(val);
        if(head == null) {
            addFirst(val);
            return;
        }
        tail.next = node;
        tail = node;
    }

    void print() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}