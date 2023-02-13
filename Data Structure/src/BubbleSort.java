//created by Toufique on 13/02/2023

import java.io.*;
import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int[] a = {3, 4,1,2,4,5,-100};
        bubble(a, a.length);
        debug(a);

        pw.close();
    }

    static void bubble(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (a[i] > a[j + 1]) {
                    int temp = a[i];
                    a[i] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
