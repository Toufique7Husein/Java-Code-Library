//created by Toufique on 14/02/2023

import java.io.*;
import java.util.*;

public class DriveClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        SLL sll = new SLL();
        sll.addFirst(12);
        sll.addFirst(11);
        sll.addFirst(23);

        sll.addLast(100);
        sll.addLast(121);
        sll.addAfter(100, -10);
        sll.addAfter(23, -1990);

        sll.addAtPoint(4, 0);
        sll.removeAtPoint(4);
        sll.print();

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
