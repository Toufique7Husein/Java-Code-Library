//created by Toufique on 03/04/2023

import java.io.*;
import java.util.*;

public class Div3_855A {
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
    static int solve(char[] s, int n) {
        int ans = n - 1;
        for (int i = 0; i < n - 2; i++) {
            if (s[i] == s[i + 2]) ans--;
        }
        return ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
