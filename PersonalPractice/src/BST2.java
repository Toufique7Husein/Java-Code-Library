//created by Toufique on 15/02/2023

import java.io.*;
import java.util.*;

public class BST2 {
    private class Node{
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.left = null;
            this.right = null;
            this.data = data;
        }
    }

    Node root;
    BST2() {
        this.root = null;
    }

    public void add(int v) {
        root = add(this.root, v);
    }
    public Node add(Node root,int v) {
        if (root == null) {
            root = new Node(v);
            return root;
        }
        if (root.data > v) {
            root.left = add(root.left, v);
        } else if(root.data < v) {
            root.right = add(root.right, v);
        }
        return root;
    }

    public void preOrder() {
        preOrder(root);
    }
    public void preOrder(Node root) {
        if (root == null) return;
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder() {
        preOrder(root);
    }

    public void inOrder(Node root) {
        if (root == null) return;
        preOrder(root.left);
        System.out.println(root.data);
        preOrder(root.right);
    }

    public void postOrder() {
        preOrder(root);
    }

    public void postOrder(Node root) {
        if (root == null) return;
        preOrder(root.left);
        preOrder(root.right);
        System.out.println(root.data);
    }

    public boolean search(int data) {
        root = search(root,data);
        if (root == null) return false;
        else return true;
    }

    public Node search(Node root,int val) {
        if (root == null  || root.data == val) return root;
        if (root.data > val) return search(root.left, val);
        else return search(root.right, val);
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
