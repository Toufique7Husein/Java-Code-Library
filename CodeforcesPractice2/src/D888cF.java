//created by Toufique on 25/07/2023

import java.io.*;
import java.util.*;

public class D888cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            long[] a = new long[n - 1];
            for (int i = 0; i < n - 1; i++) a[i] = in.nextLong();
            pw.println(solve(a, n) ? "YES" : "NO");
        }

        pw.close();
    }

    static boolean solve(long[] a, int n) {
        HashSet<Long> set = new HashSet<>();
        HashMap<Long, Integer> map = new HashMap<>();
        set.add(a[0]);
        map.put(a[0], 1);
        for (int i = 1; i < n - 1; i++) {
            set.add(a[i] - a[i - 1]);
            map.put(a[i] - a[i - 1], map.getOrDefault(a[i] - a[i - 1], 0) + 1);
        }
        ArrayList<Long> missing = new ArrayList<>();
        for (long i = 1; i <= n; i++) if (!set.contains(i)) missing.add(i);
    //    debug(set, missing);
        if (missing.size() == 1) {
            set.add(missing.get(0));
            for (long i = 1; i <= n; i++) if (!set.contains(i)) return false;
            return true;
        }
        if (missing.size() != 2) return false;
        long need = missing.get(0) + missing.get(1);
        if (need <= n) {
          //  debug(need);
            if (map.getOrDefault(need, 0) >= 2L) {
                set.add(missing.get(0));
                set.add(missing.get(1));
             //   debug(set);
                for (long i = 1; i <= n; i++) if (!set.contains(i)) return false;
                return true;
            }
            return false;
        }
        if (set.contains(need)) {
            set.remove(need);
            set.add(missing.get(0));
            set.add(missing.get(1));
            for (long i = 1; i <= n; i++) if (!set.contains(i)) return false;
            return true;
        }
        return false;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
