//created by Toufique on 19/03/2023

import java.io.*;
import java.util.*;

public class CodeforcesRound_859F {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        outer:
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            ArrayList<Long> ls = new ArrayList<>();
            for (int i = 0; i < n; i++) ls.add(in.nextLong());
            if (ls.get(0) != 1 && ls.size() == 1) {
                pw.println("NO");
                continue;
            }
            Collections.sort(ls);
            long sum = 1;
            for (int i = 1; i < n; i++) {
                long v = ls.get(i);
                if (v <= sum) {
                    sum += v;
                } else {
                    pw.println("NO");
                    continue outer;
                }
            }
            pw.println("YES");
        }

        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
