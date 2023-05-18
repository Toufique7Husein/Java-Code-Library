//created by Toufique on 28/04/2023

/*
* Write a recursive program to compute n!
Input:
5
Output:
120
*
* */

import java.io.*;
import java.util.*;

public class Problem_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(solve(in.nextLong()));
        pw.close();
    }

    static long solve(long n) {
        if (n == 1) return 1;
        return n * solve(n - 1);
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
