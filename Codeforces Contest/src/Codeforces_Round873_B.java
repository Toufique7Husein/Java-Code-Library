//created by Toufique on 14/05/2023

import java.io.*;
import java.util.*;

public class Codeforces_Round873_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int[] a = new int[n + 1];
            for (int i = 1; i <= n; i++) a[i] = in.nextInt();
            pw.println(solve(a, n));
        }

        pw.close();
    }

    static int solve(int[] a, int n) {
        ArrayList<Integer> set = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i == a[i]) continue;
            set.add(Math.abs(a[i] - i));
        }
        int ans = set.get(0);
        for (int i = 1; i < set.size(); i++) ans = gcd(ans, set.get(i));
        return ans;
    }

    public static int gcd(int a, int b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
