//created by Toufique on 08/05/2023

import java.io.*;
import java.util.*;

public class Codeforces_Round_872A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            char[] s = in.next().toCharArray();
            pw.println(solve(s, s.length));
        }

        pw.close();
    }
    static int solve(char[] s, int n) {
        HashSet<Character> set = new HashSet<>();
        for (char c: s) set.add(c);

        if (set.size() == 1) return -1;
        return n - 1;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
