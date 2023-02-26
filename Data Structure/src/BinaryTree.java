//created by Toufique on 27/02/2023

import java.io.*;
import java.util.*;

public class BinaryTree {
    private class Node{
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    Node root;
    int idx = -1;
    BinaryTree() {
        this.root = null;
    }
    public int getRoot(int[] data) {
        return buildTree(data).data;
    }
    public Node buildTree(int[] data, int n) {
        root = buildTree(data);
        return root;
    }

    public Node buildTree(int[] data) {
        idx++;
        if (data[idx] == -1) return null;
        Node newNode = new Node(data[idx]);
        newNode.left = buildTree(data);
        newNode.right = buildTree(data);
        return newNode;
    }
    public void preOrder() {
        preOrder(this.root);
    }
    public void inOrder() {
        inOrder(root);
    }
    public void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    public void preOrder(Node root) {
        if (root == null) return;
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    public void postOrder() {
        postOrder(root);
    }

    public void postOrder(Node root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }

    public void levelOrder() {
        levelOrder(root);
    }

    public void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node node = q.poll();
            if (node == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(node.data + " ");
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
        }
    }

    public int countNode() {
        return countNode(root);
    }
    public int countNode(Node root) {
        if (root == null) return 0;
        int left = countNode(root.left);
        int right = countNode(root.right);
        return left + right + 1;
    }
    public int sumOfNode() {
        return sumOfNode(root);
    }
    public int sumOfNode(Node root) {
        if (root == null) return 0;
        int left = sumOfNode(root.left);
        int right = sumOfNode(root.right);
        return left + right + root.data;
    }

    public int Height() {
        return Height(root);
    }
    public int Height(Node root) {
        if (root == null) return 0;
        int left = Height(root.left);
        int right = Height(root.right);
        int curr = Math.max(left, right) + 1;
        return curr;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
