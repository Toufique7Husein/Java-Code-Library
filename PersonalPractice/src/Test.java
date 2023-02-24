//created by Toufique on 21/02/2023

import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        DoublyLInkedList dl = new DoublyLInkedList();

        dl.addFirst(1);
        dl.addLast(2);
        dl.addFirst(100);
        dl.addLast(1000);
        dl.addFirst(10000);
        dl.addLast(100000);
        dl.addAt(2, -100);


        dl.deleteAt(2);
        dl.print();

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
