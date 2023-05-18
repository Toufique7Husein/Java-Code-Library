//created by Toufique on 28/04/2023

import java.io.*;
import java.util.*;

/*
* Suppose you are given an array of integers in an arbitrary order. Write a recursive solution to find the maximum element from the array.
Input:
5
7 4 9 6 2
Output:
9
*
* */

public class Problem_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = in.nextInt();
        pw.println(max(a, 0, 0));
        pw.close();
    }

    static long max(int[] a, int i, int mx) {
        if (i == a.length) {
            return mx;
        }
        if (mx < a[i]) mx = a[i];
        return max(a, i + 1, mx);
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
