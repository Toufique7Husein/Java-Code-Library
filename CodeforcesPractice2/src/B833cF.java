//created by Toufique on 10/07/2023

import java.io.*;
import java.util.*;

public class B833cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            char[] s = in.next().toCharArray();
            pw.println(solve(s, n));
        }

        pw.close();
    }
    static long solve(char[] s, int n) {
        long ans = 0;
        for (int i = 0; i < n; i++) {
            int max = 0;
            int[] cnt = new int[10];
            HashSet<Integer> set = new HashSet<>();
            for (int j = 0; j < 100; j++) {
                if (i < j) break;
                int v = s[i - j] - '0';
                set.add(v);
                cnt[v]++;
                max = Math.max(cnt[v], max);
                if (max <= set.size()) ans++;
            }
        }
        return ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
