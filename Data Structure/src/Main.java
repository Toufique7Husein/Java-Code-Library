//created by Toufique on 21/01/2023

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);

        int[] a = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        /*
         *               1
         *            /    \
         *           2      3
         *         /  \      \
         *        4    5      6
         * */
        BinaryTree bt = new BinaryTree();
        bt.buildTree(a, a.length);
      //  bt.preOrder();
        //bt.inOrder();
       // bt.postOrder();
       // bt.levelOrder();
        //debug(bt.countNode());
      //  debug(bt.sumOfNode());
        debug(bt.Height());
        pw.close();
    }

    static void debug(Object...obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
