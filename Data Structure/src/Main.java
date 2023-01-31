//created by Toufique on 21/01/2023

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //1->2->3->4->5->6->90
        SinglyLinkedList ls = new SinglyLinkedList();
        ls.addLast(1);
        ls.addLast(2);
        ls.addLast(3);
        ls.addLast(4);
        ls.addLast(5);
        ls.addLast(6);
        ls.addLast(90);
        ls.print();
    }

    static void debug(Object...obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
