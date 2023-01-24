//created by Toufique on 24/01/2023

import java.io.*;
import java.util.*;

public class Edu_142A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (int i = 0; i < n; i++) pq.add(in.nextInt());
            int ans = 0;
            while (!pq.isEmpty()) {
                int f = pq.remove();
                ans++;
                if (f == 1) {
                    if (pq.isEmpty()) break;
                    int s = pq.remove();
                    if (s == 1) continue;
                    s--;
                    pq.add(s);
                }
            }
            pw.println(ans);
        }
        int ans = 0;

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
