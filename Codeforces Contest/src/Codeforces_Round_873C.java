//created by Toufique on 14/05/2023

import java.io.*;
import java.util.*;

public class Codeforces_Round_873C {
    static long mod = (long)1e9 + 7;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            ArrayList<Long> a = new ArrayList<>(), b = new ArrayList<>();
            for (int i = 0; i < n; i++) a.add(in.nextLong());
            for (int i = 0; i < n; i++) b.add(in.nextLong());

            debug(a, b);

            pw.println(solve(a, b, n));
        }

        pw.close();
    }

    static long solve(ArrayList<Long> a, ArrayList<Long> b, int n) {
        Collections.sort(a);
        Collections.sort(b);

        for (int i = 0; i < n; i++) {
            if (a.get(i) <= b.get(i)) return 0L;
        }
        int ans = 1;
        for (int i = 1; i < n; i++) {
            if (a.get(i) > b.get(i - 1)) ans *= 2;
        }
        return ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
