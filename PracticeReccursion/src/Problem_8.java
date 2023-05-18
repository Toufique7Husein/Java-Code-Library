//created by Toufique on 28/04/2023

import java.io.*;
import java.util.*;

/*
* Problem 8:
Write a recursive program to determine whether a given integer is prime or not.
* Input:
49
999983
1
Output:
not prime
prime
not prime
* */

public class Problem_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int x = in.nextInt();
        int rt = (int)Math.sqrt(x);
        pw.println(prime(2, rt, x));

        pw.close();
    }

    static boolean prime(int i,int rt, int n) {
       if (n == 1) return false;
       if (n == 2) return true;
       if (i > rt) return true;
       if (i % n == 0) return false;
       return prime(i + 1, rt, n);
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
