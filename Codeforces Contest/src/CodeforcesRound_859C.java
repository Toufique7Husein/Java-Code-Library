//created by Toufique on 19/03/2023

import java.io.*;
import java.util.*;

public class CodeforcesRound_859C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        test:
        for (int tt = 0; tt < t; tt++) {
            HashSet<Character> even = new HashSet<>(), odd = new HashSet<>();
            int n = in.nextInt();
            char[] s = in.next().toCharArray();
            for (int i = 0; i < s.length; i++) {
                if (i % 2 == 0) even.add(s[i]);
                else odd.add(s[i]);
            }

            for (char c: even) {
                if (odd.contains(c)) {
                    pw.println("NO");
                    continue test;
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
