//created by Toufique on 13/02/2023

import java.io.*;
import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int[] a = {3, 4,1,2,4,5,-100};
        selectionSort(a, a.length);
        debug(a);
        pw.close();
    }

    static void selectionSort(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
