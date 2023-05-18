//created by Toufique on 28/04/2023

import java.io.*;
import java.util.*;
/*
* Write a recursive solution to compute lcm of two integers. You must not use the formula lcm(a,b) = (a x b) / gcd(a,b); find lcm from scratch...
Input:
23 488
Output:
11224*/

public class Problem_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(lcm(in.nextLong(), in.nextLong(), 1));
        pw.close();
    }

    static long lcm(long a, long b, long m) {
        if ((a * m) % b == 0) return m * a;
        else return lcm(a, b, m + 1);
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
