//created by Toufique on 21/02/2023

import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        SinglyLikedList sll = new SinglyLikedList();
        sll.addFirst(1);
        sll.addFirst(3);
        sll.addFirst(34);


        sll.print();


       pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
