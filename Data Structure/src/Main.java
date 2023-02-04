//created by Toufique on 21/01/2023

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        SLL sll = new SLL();
        sll.addFirst(1);
        sll.addFirst(2);
        sll.addLast(12);
        sll.addLast(123);
        sll.addLast(133);
        sll.addLast(163);

        sll.print();
        sll.add(2, 10000);
        sll.print();
        pw.println(sll.delete(2));
        sll.print();
        pw.close();
    }

    static void debug(Object...obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
