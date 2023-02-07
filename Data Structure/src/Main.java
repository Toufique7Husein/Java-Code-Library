//created by Toufique on 21/01/2023

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);

        /*
        *                    12
        *                  /     \
        *                 1       23
        *              /    \    /  \
        *              0     2  5    6
        *
        * */
        BST bst = new BST();
        bst.add(12);
        bst.add(1);
        bst.add(23);
        bst.add(0);
        bst.add(2);
        bst.add(5);
        bst.add(6);
        bst.inOrder();
        pw.close();
    }

    static void debug(Object...obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
