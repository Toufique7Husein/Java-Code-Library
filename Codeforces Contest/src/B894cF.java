//created by Toufique on 24/08/2023

import java.io.*;
import java.util.*;

public class B894cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            ArrayList<Integer> ans = solve(a, n);
            pw.println(ans.size());
            for (int i: ans)pw.print(i + " ");
            pw.println();
        }

        pw.close();
    }

    static ArrayList<Integer> solve(int[] a, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(a[0]);
        for (int i = 1; i < n; i++) {
            int prev = ans.get(ans.size() - 1);
            if (prev <= a[i]) ans.add(a[i]);
            else {
                ans.add(a[i]);
                ans.add(a[i]);
            }
        }

        return ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
