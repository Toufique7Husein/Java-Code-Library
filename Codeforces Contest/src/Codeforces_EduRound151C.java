//created by Toufique on 29/06/2023

import java.io.*;
import java.util.*;

public class Codeforces_EduRound151C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            char[] s = in.next().toCharArray();
            int m = in.nextInt();
            char[] l = in.next().toCharArray();
            char[] r = in.next().toCharArray();
            pw.println(solve(s, m, l, r) ? "YES" : "NO");
        }

        pw.close();
    }


    static boolean solve(char[] s, int m, char[] l, char[] r) {
        HashSet<Integer> set = new HashSet<>();
        int j = 0;
        for (int i = 0; i < s.length; i++) {
            if (set.isEmpty() && j < m) {
                for (int k = l[j] - '0';  k <= r[j] - '0'; k++) {
                    set.add(k);
                }
                j++;
            }
            if (set.contains(s[i] - '0')) {
                set.remove(s[i] - '0');
            }
        }
        if (j == m && set.isEmpty()) return false;
        return true;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
