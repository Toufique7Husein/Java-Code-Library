//created by Toufique on 28/04/2023


/*
* Write a recursive solution to find the second maximum number from a given set of integers.
Input:
5
5 8 7 9 3
Output:
8
*
*
* */

import java.io.*;
import java.util.*;

public class Problem_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);


        pw.close();
    }

    static void secondMax(int[] a, int i, int fl, int sl) {
        if (i == a.length) return;
        if (fl < a[i]) fl = a[i];
        secondMax(a, i + 1, fl, sl);
        
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
