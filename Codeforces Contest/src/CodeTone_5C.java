//created by Toufique on 24/06/2023

import java.io.*;
import java.util.*;

public class CodeTone_5C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            pw.println(solve(a, n));
        }
        pw.close();
    }
    static int solve(int[] a, int n) {
        ArrayList<Integer> ls = new ArrayList<>();
        for (int i = 0; i < n; ) {
            int cnt = 0;
            int j = i;
            int idx = i;
            for (; j < n; j++) {
                if (a[i] == a[j]) cnt++;
                else break;
            }
            i = j;
            if (cnt > 2) ls.add(a[idx]);
            else {
                for (int k = 0; k < cnt; k++) ls.add(a[idx]);
            }
        }
        int[][] minMax = new int[n + 1][2];
        for (int i = 0;i <= n; i++) minMax[i][0] = n + 1000;
      //  debug(ls);
        for (int i = 0; i < ls.size(); i++) {
            minMax[ls.get(i)][0] = Math.min(minMax[ls.get(i)][0], i);
            minMax[ls.get(i)][1] = Math.max(minMax[ls.get(i)][1], i);
        }

        ArrayList<Integer> len = new ArrayList<>();
        int curr = 0, till = -1;
        for (int i = ls.size() - 1; i >= 1; i--) {
            if (till == i) {
                len.add(curr);
                curr = 0;
                till = -1;
            }
            if (till == -1) {
                int x = ls.get(i);
                int l = minMax[x][0];
                if (l == (n + 1000)) continue;
                curr = minMax[x][1] - l + 1;
                till = l;
                continue;
            }
            int x = ls.get(i);
            int h = minMax[i][1];
            if (h == 0) continue;
        }


        return n;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
