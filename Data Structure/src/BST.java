//created by Toufique on 04/02/2023

import java.io.*;
import java.util.*;

public class BST {
    Node root;

    BST() {
        this.root = null;
    }

    public void add(int key) {
        root = add(key, root);
    }

    public Node add(int key, Node root) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (root.key > key) {
            return root.left = add(key, root.left);
        }
        if (root.key < key) {
            return  root.right = add(key, root.right);
        }
        return root;
    }

    public void preOrder() {
        preOrder(root);
    }
    public void preOrder(Node root) {
        if (root == null) return;
        System.out.println(root.key);
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder() {
        inOrder(root);
    }

    public void inOrder(Node root) {
        if (root == null) return;
        preOrder(root.left);
        preOrder(root.right);
    }

    public void postOrder() {
        postOrder(root);
    }

    public void postOrder(Node root) {
        if (root == null) return;
        preOrder(root.left);
        preOrder(root.right);
        System.out.println(root.key);
    }

    static class Node{
        int key;
        Node left, right;
        Node(int key) {
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
