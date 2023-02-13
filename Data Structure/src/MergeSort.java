//created by Toufique on 13/02/2023

import java.io.*;
import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {

        }

        pw.close();
    }

    static void mergeSort(int l, int h) {
        if (l == h) return;
        int mid = l + (h - l) / 2;

        mergeSort(l, mid);
        mergeSort(l, mid + 1);

        int i, j,k;
        for (i = l, j = mid + 1, k = l; k <= h; k++) {

        }

    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
