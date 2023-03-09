//created by Toufique on 10/03/2023

import java.io.*;
import java.util.*;

public class LeetCode_98 {

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

    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> ls = new ArrayList<Integer>();
        inOrder(root, ls);
        for (int i = 1; i < ls.size(); i++) {
            if (ls.get(i - 1) >= ls.get(i)) return false;
        }
        return true;
    }

    public void inOrder(TreeNode root, ArrayList<Integer> ls) {
        if (root == null) return;
        inOrder(root.left, ls);
        ls.add(root.val);
        inOrder(root.right, ls);
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
