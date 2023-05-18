//created by Toufique on 28/04/2023


/*
* Problem:
* You will be given an array of integers, write a recursive solution to print it in reverse order.
Input:
5
69 87 45 21 47
Output:
47 21 45 87 69
*
* */

import java.io.*;
import java.util.*;

public class Problem_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = 5;
        int[] a = {69, 87, 45, 21, 47};
        printRevers(0, n, a);
        pw.close();
    }
    static void printRevers(int i, int n, int[] a) {
        if (i == n) {
            return;
        }
        printRevers(i + 1, n, a);
        debug(a[i]);
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
