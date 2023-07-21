//created by Toufique on 20/06/2023

import java.io.*;
import java.util.*;

public class Cf_Round881A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            Arrays.sort(a);
            int i = 0, j = n - 1;
            long ans = 0;
            while (i <= j) {
                ans += (a[j] - a[i]);
                i++;
                j--;
            }
            pw.println(ans);
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
