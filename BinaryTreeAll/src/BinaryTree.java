//created by Toufique on 29/07/2023

import java.io.*;
import java.util.*;

public class BinaryTree {
    static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }

    }

    static class BinaryTreeImpl{
        static int idx = -1;
        static Node BuildTree(int[] tree) {
            idx++;
            if (tree[idx] == -1) return null;
            Node node = new Node(tree[idx]);
            node.left = BuildTree(tree);
            node.right = BuildTree(tree);
            return node;
        }

        static void preOrder(Node root) {
            if (root == null) return;
            debug(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }

        static void postOrder(Node root) {
            if (root == null) return;
            postOrder(root.left);
            postOrder(root.right);
            debug(root.data);
        }

        static void inOrder(Node root) {
            if (root == null) return;
            inOrder(root.left);
            debug(root.data);
            inOrder(root.right);
        }

        static void levelOrder(Node root) {
            Queue<Node> queue = new ArrayDeque<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                Node node = queue.poll();
            //    debug(node.data);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
        }

        static int countOfNode(Node root) {
            if (root == null) return 0;
            int l = countOfNode(root.left);
            int r = countOfNode(root.right);
            return l + r + 1;
        }

        static int sumOfNodes(Node root) {
            if (root == null) return 0;
            int l_sum = sumOfNodes(root.left);
            int r_sum = sumOfNodes(root.right);
          //  debug(root.data);
            return l_sum + r_sum + root.data;
        }

        static int heightOftheTree(Node root) {
            if (root == null) return 0;
            int leftHeight = heightOftheTree(root.left);
            int rightHeight = heightOftheTree(root.right);
            int currHeight = Math.max(leftHeight, rightHeight) + 1;
            return currHeight;
        }
    }


    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = BinaryTreeImpl.BuildTree(nodes);
        debug(BinaryTreeImpl.sumOfNodes(root));
        debug(BinaryTreeImpl.heightOftheTree(root));
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
