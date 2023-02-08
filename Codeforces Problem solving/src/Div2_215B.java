//created by Toufique on 08/02/2023

import java.io.*;
import java.util.*;

public class Div2_215B {
    static int[] pref;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt(), m = in.nextInt();
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) a[i] = in.nextInt();
        build(n, a);
        for (int i = 0; i < m; i++) {
            int x = in.nextInt();
            pw.println(pref[x]);
        }
        pw.close();
    }

    static void build(int n, int[] a) {
        pref = new int[n + 1];
        HashSet<Integer> set = new HashSet<>();
        for (int i = n; i >= 1; i--) {
            if (!set.contains(a[i])) {
                set.add(a[i]);
                pref[i] = 1;
            }
        }
       // debug(pref);
        for (int i = n - 1; i >= 1; i--) {
            //debug(pref[i]);
            pref[i] += pref[i + 1];
            //debug(pref[i]);
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
