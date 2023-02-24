//created by Toufique on 25/02/2023

import java.io.*;
import java.util.*;

public class MargeSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int[] a = {1, 6, 2, 1, -100};
        debug(margeSort(a));

        pw.close();
    }

    static int[] margeSort(int[] a) {
        if (a.length == 1) {
            return a;
        }
        int mid = a.length / 2;
        int[] left = margeSort(Arrays.copyOfRange(a, 0, mid));
        int[] right = margeSort(Arrays.copyOfRange(a, mid, a.length));

        return marge(left, right);
    }

    static int[] marge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mix[k] = left[i];
                i++;
            } else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            mix[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            mix[k] = right[j];
            k++;
            j++;
        }
        return mix;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
