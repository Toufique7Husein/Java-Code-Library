//created by Toufique on 19/05/2023

import java.io.*;
import java.util.*;

public class Codeforces_Round_874D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int[] p = new int[n];
            for (int i = 0; i < n; i++) p[i] = in.nextInt();
            ArrayList<Integer> ans = solve(p, n);
            for (int i: ans) pw.print(i + " ");
            pw.println();
        }

        pw.close();
    }
    static ArrayList<Integer> solve(int[] p, int n) {
        if (n == 1) {
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(p[0]);
            return ans;
        }
        int ind = -1;
        int val = 0;
        for (int i = 1; i < n; i++) {
            if (val < p[i]) {
                val = p[i];
                ind = i;
            }
        }
        if (n != (ind + 1)) {
            ArrayList<Integer> ans = new ArrayList<>();
            for (int i = ind; i < n; i++) {
                ans.add(p[i]);
            }
            ans.add(p[ind - 1]);
            int idx = ind - 1;
            for (int i = idx - 1; i >= 0; i--) {
                if (p[i] > p[0]) ans.add(p[i]);
                else {
                    for (int k = 0; k <= i; k++) ans.add(p[k]);
                    break;
                }
            }
            return ans;
        } else {
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(p[n - 1]);
            for (int i = n - 2; i >= 0; i--) {
                if (p[i] > p[0]) ans.add(p[i]);
                else {
                    for (int j = 0; j <= i; j++) ans.add(p[j]);
                    break;
                }
            }
            return ans;
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
