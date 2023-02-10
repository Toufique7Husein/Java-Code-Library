//created by Toufique on 11/02/2023

import java.io.*;
import java.util.*;

public class LeetCode_94 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ls = new ArrayList<Integer>();
        inOrder(root, ls);
        return ls;
    }

    public void inOrder(TreeNode root, List<Integer> ls) {
        if (root == null) return;
        inOrder(root.left, ls);
        ls.add(root.val);
        inOrder(root.right, ls);
    }
}
