//created by Toufique on 03/06/2023

import java.io.*;
import java.util.*;

public class Codeforces_Round876B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            ArrayList<Integer>[] ls = new ArrayList[n + 1];
            for (int i = 0; i <= n; i++) ls[i] = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                ls[a].add(b);
            }
            for (int i = 1; i <= n; i++) Collections.sort(ls[i]);
            ArrayDeque<Integer>[] dq = new ArrayDeque[n + 1];
            for (int i = 0; i <= n; i++) {
                dq[i] = new ArrayDeque<>();
                for (int v: ls[i]) {
                    dq[i].addFirst(v);
                }
            }

            int cnt = 0;
            long ans = 0;

            int[] freq = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                while (cnt < i && !dq[i].isEmpty()) {
                    ans += (long)dq[i].pollFirst();
                    freq[i]++;
                    cnt++;
                    if (i <= cnt) {
                        cnt -= freq[i];
                        break;
                    }
                }
            }
            pw.println(ans);
        }

        pw.close();
    }



    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
