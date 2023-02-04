//created by Toufique on 04/02/2023

import java.io.*;
import java.util.*;

public class FibonacciUsingRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        //0 1 1 2 3 5 8 13
        //0 1 2 3 4 5 6 7
        debug(fib(10));

        pw.close();
    }

    static int fib(int n) {
        if (n == 0 || n == 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
