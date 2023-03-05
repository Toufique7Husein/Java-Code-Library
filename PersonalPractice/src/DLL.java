//created by Toufique on 05/03/2023

import java.io.*;
import java.util.*;

public class DLL {
    private  Node head;
    private  Node tail;

    DLL() {
        this.head = null;
        this.tail = null;
    }







    private class Node{
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }
}
