//created by Toufique on 20/02/2023

import java.io.*;
import java.util.*;

public class Div2_846A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            int[] ans = solve(a, n);
            if (ans[0] == -1) {
                pw.println("NO");
                continue;
            }
            pw.println("YES");
            pw.println(ans[0] + " " + ans[1] + " " + ans[2]);
        }

        pw.close();
    }

    static int[] solve(int[] a, int n) {
        int[] ans = new int[3];

        {
            //cheking three odd
            int idx = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] % 2 != 0) {
                    ans[idx] = i + 1;
                    idx++;
                    if (idx == 3) return ans;
                }
            }
        }
        ans = new int[3];
        {
            //checkng one odd and 2 even
            for (int i = 0; i < n; i++) {
                if (a[i] % 2 != 0) {
                    ans[0] = i + 1;
                    break;
                }
            }
            if (ans[0] == 0) {
                ans[0] = -1;
                return ans;
            }
            int idx = 1;
            for (int i = 0; i < n; i++) {
                if (a[i] % 2 == 0) {
                    ans[idx] = i + 1;
                    idx++;
                    if (idx == 3) return ans;
                }
            }
        }
        ans[0] = -1;
        return ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
