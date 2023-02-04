//created by Toufique on 04/02/2023

import java.io.*;
import java.util.*;

public class BST {
    public Node root = null;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {

        }

        pw.close();
    }

    public Node add(Node n, int k, int val) {
        if (root == null) return (new Node(k, val));
        if (n.key < k) {
            n.left = add(n.left, k, val);
        } else if (n.key > k) {
            n.right = add(n.right, k, val);
        } else n.val = val;
        return n;
    }

    public void add(int k) {
        root = add(root, k, k);
    }

    public void add(int k, int n) {
        root = add(root, k, n);
    }
    static class Node {
        Integer key, val;
        Node left, right;
        Node(Integer key, Integer val) {
            this.key = key;
            this.val = val;
        }

        Node(int key) {
            this.key = key;
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
