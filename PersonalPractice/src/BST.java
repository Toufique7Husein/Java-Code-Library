//created by Toufique on 15/02/2023

import java.io.*;
import java.util.*;

public class BST {
    private Node root;
    BST() {
        this.root = null;
    }

    public void add(int val) {
        root = add(this.root, val);
    }
    public Node add(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
             root.left = add(root.left, val);
        } else if(root.data < val) {
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

    public void inOrder() {
        inOrder(root);
    }

    public void inOrder(Node root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    public boolean search(int val) {
        root = search(root, val);
        if (root == null) return false;
        return true;
    }
    public Node search(Node root, int val) {
        if (root == null || root.data == val) return root;
        if (root.data > val) return search(root.left, val);
        else return search(root.right, val);
    }

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

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
