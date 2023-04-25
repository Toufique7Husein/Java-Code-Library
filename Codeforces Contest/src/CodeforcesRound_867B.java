//created by Toufique on 24/04/2023

import java.io.*;
import java.util.*;

public class CodeforcesRound_867B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            ArrayList<Long> pos = new ArrayList<>(), neg = new ArrayList<>();
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                long  x = in.nextLong();
                if (x < 0) neg.add(x);
                else pos.add(x);
            }
            Collections.sort(pos);
            Collections.sort(neg);
            if (pos.size() == 1) {
                if (neg.size() > 1) {
                    pw.println(neg.get(0) * neg.get(1));
                    continue;
                }
                pw.println(pos.get(0) * neg.get(neg.size() - 1));
                continue;
            }
            if (neg.size() == 1) {
                if(pos.size() > 1){
                    pw.println(pos.get(pos.size() - 1) * pos.get(pos.size() - 2));
                    continue;
                }
                pw.println(pos.get(0) * neg.get(neg.size() - 1));
                continue;
            }

            Collections.reverse(pos);
            if (pos.size() == 0) {
                pw.println(neg.get(0) * neg.get(1));
                continue;
            }
            if (neg.size() == 0) {
                pw.println(pos.get(0) * pos.get(1));
                continue;
            }

            long p = pos.get(0) * pos.get(1);
            long nn = neg.get(0) * neg.get(1);
            pw.println(Math.max(p, nn));
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
