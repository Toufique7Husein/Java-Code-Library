//created by Toufique on 20/02/2023

import java.io.*;
import java.util.*;

public class BST3 {
    public class Node{
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public Node root;
    BST3() {
        this.root = null;
    }

    public void add(int val) {
        root = add(root, val);
    }

    public Node add(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = add(root.left, val);
        }
        if (root.data < val) {
            root.right = add(root.right, val);
        }
        return root;
    }

    public void preOrder() {
        preOrder(this.root);
    }

    public void preOrder(Node root) {
        if (root == null) return;
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }



    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
