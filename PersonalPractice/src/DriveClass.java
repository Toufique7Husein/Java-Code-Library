//created by Toufique on 14/02/2023

import java.io.*;
import java.util.*;

public class DriveClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
/*
        *//*
        *               0
        *             /   \
        *            2     3
        *          /   \ /   \
        *        4     5 6    7
        *
        * *//*
        BST2 bst = new BST2();
        bst.add(45);
        bst.add(10);
        bst.add(7);
        bst.add(12);
        bst.add(90);
        bst.add(50);

        bst.preOrder();

        System.out.println(bst.search(-7));*/

       DLL3 dll = new DLL3();
       dll.addFirst(1);
       dll.addFirst(2);
       dll.addFirst(34);
       dll.addFirst(12);
       dll.addFirst(45);
       dll.addFirst(12);


       dll.print();




        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
