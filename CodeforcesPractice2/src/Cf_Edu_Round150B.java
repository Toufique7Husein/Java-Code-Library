//created by Toufique on 12/06/2023

import java.io.*;
import java.util.*;

public class Cf_Edu_Round150B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            int[] ans = solve(a, n);
            for (int i: ans) pw.print(i);
            pw.println();
        }

        pw.close();
    }

    static int[] solve(int[] a, int n) {
        int[] ans = new int[n];
        ArrayList<Integer> des = new ArrayList<>();
        ans[0] = 1;
        int prev = a[0];
        int f = a[0];
        des.add(0);
        boolean down = false;
        for (int i = 1; i < n; i++) {
            if (prev <= a[i]) {
                prev = a[i];
                des.add(i);
            } else {
                if (f >= a[i]) {
                    des.add(i);
                    down = true;
                    break;
                }
            }
        }
        if (down) {
            int last = des.get(des.size() - 1);
           // debug(des, down, last);
            for (int i = last + 1; i < n; i++) {
               // debug(last, a[i], a[0], a[i]);
                if (a[last] <= a[i] && a[0] >= a[i]) {
                    des.add(i);
                   // debug(i, a[i]);
                    last = i;
                }
            }
        }
        for (int i: des)ans[i] = 1;
        return ans;
    }
    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
