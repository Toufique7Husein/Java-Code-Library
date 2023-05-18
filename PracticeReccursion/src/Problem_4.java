//created by Toufique on 28/04/2023

/*
* Write a recursive solution to print the polynomial series for any input n: 1 + x + x2 + ................. + xn-1
* */

import java.io.*;
import java.util.*;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();
        polynomial(0, n);
        pw.close();
    }

    static void polynomial(int i, int n) {
        if (i < n) {
            if (i == 0) System.out.print(1);
            else if (i == 1) System.out.print(" + x");
            else System.out.print(" + x^" + i);
            polynomial(i + 1, n);
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
