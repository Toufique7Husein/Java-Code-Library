//created by Toufique on 12/02/2023

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);


        SLL sll = new SLL();
        sll.addLast(100);
        sll.addFirst(12);
        sll.addFirst(23);
        sll.addFirst(34);
        sll.addLast(123);


        sll.print();


        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
