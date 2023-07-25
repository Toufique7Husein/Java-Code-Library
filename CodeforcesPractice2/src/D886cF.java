//created by Toufique on 21/07/2023

import java.io.*;
import java.util.*;

public class D886cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            long k = in.nextLong();
            ArrayList<Long> ls = new ArrayList<>();
            for (int i = 0; i < n; i++) ls.add(in.nextLong());
            pw.println(solve(ls, n, k));
        }

        pw.close();
    }

    static int solve(ArrayList<Long> ls, int n, long k) {
        int ans = 1;
        ArrayList<Integer> answers = new ArrayList<>();
        Collections.sort(ls);
        int prev = 1;
        for (int i = 1; i < n; i++) {
            long v1 = ls.get(i - 1);
            long v2 = ls.get(i);
            if ((v2 - v1) <= k) {
                prev++;
            } else {
                answers.add(prev);
                prev = 1;
            }
        }
        answers.add(prev);
        int ans2 = n - Collections.max(answers);
        return ans2;
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
