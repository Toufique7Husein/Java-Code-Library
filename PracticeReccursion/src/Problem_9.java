//created by Toufique on 28/04/2023

import java.io.*;
import java.util.*;

/*
* Write a recursive function that finds the gcd of two non-negative integers.
Input:
25 8895
Output:
5
*
* */

public class Problem_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        pw.println(gcd(in.nextLong(), in.nextLong()));

        pw.close();
    }

    static long gcd(long a, long b){
        if (a == 0) return b;
        else return gcd(b % a, a);
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
