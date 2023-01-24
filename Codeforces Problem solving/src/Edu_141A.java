//created by Toufique on 23/01/2023

import java.io.*;
import java.util.*;

public class Edu_141A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            ArrayList<Integer> ls = new ArrayList<>();
            for (int i = 0; i < n; i++) ls.add(in.nextInt());
            Collections.sort(ls);
            int[] ans = new int[n];
            Collections.reverse(ls);
            for (int i = 0; i < n; i++) ans[i] = ls.get(i);
            boolean ok = true;
            for (int i = 1; i < n; i++) {
                if (ans[i - 1] == ans[i]) {
                    ok = false;
                    break;
                }
            }
            debug(ans);
            if (ok) {
                pw.println("Yes");
                for (int i: ans) pw.print(i + " ");
                pw.println();
            }else pw.println("No");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
