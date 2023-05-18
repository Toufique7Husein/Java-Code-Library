//created by Toufique on 28/04/2023

import java.io.*;
import java.util.*;

/*
* Problem 7:
Write a recursive program to compute nth fibonacci number. 1st and 2nd fibonacci numbers are 1, 1.
Input:
6
Output:
8
*
* */

public class Problem_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        pw.println(fib(in.nextInt()));


        pw.close();
    }

    static long fib(int x) {
        if (x == 0) return 0;
        if (x == 1) return 1;
        if (x == 2) return 1;
        return fib(x - 1) + fib(x - 2);
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
