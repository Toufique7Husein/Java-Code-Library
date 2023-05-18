//created by Toufique on 28/04/2023

/*
*Write a recursive function to print an array in the following order. [0] [n-1] [1] [n-2] ......... ......... [(n-1)/2] [n/2]
* Input:
5
1 5 7 8 9
Output:
1 9
5 8
7 7
* */

import java.io.*;
import java.util.*;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = in.nextInt();
       // print(0, n, a);
        anotherSolution(0, n - 1, a);
        pw.close();
    }

    static void print(int i, int n, int[] a) {
        if (i <= (n / 2)) {
            System.out.println(a[i] + " " + a[n - i - 1]);
            print(i + 1, n, a);
        }
    }
    static void anotherSolution(int i, int j, int[] a) {
        if (i <= j) {
            System.out.println(a[i] + " " + a[j]);
            anotherSolution(i + 1, j - 1, a);
        }
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
