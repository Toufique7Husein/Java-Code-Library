//created by Toufique on 21/01/2023

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);

        CirculerLinkedList cls = new CirculerLinkedList();
        cls.add(12);
        cls.add(23);
        cls.add(2233);
        cls.add(0);
        cls.add(3);
        cls.add(1);

        cls.print();

        pw.close();
    }

    static void debug(Object...obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
