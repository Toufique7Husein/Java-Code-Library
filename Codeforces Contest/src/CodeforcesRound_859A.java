//created by Toufique on 19/03/2023

import java.io.*;
import java.util.*;

public class CodeforcesRound_859A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            ArrayList<Integer> even = new ArrayList<>(), odd = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int x = in.nextInt();
                if (x % 2 == 0) {
                    even.add(x);
                } else {
                    odd.add(x);
                }
            }
            int ev = 0, od = 0;
            for (int i = 0; i < even.size(); i++) ev += even.get(i);
            for (int i: odd) od += i;
            if (od >= ev) {
                pw.println("NO");
                continue;
            }
            pw.println("YES");

        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
