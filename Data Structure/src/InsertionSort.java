//created by Toufique on 13/02/2023

import java.io.*;
import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int[] a = {100, 2, -4, 10,3,4};
        insertionSort(a, a.length);
        debug(a);

        pw.close();
    }

    static void insertionSort(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            int x = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > x) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = x;
        }
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
