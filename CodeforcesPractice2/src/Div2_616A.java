//created by Toufique on 30/04/2023

import java.io.*;
import java.util.*;

public class Div2_616A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            char[] s = in.next().toCharArray();
            pw.println(solve(n, s));
        }

        pw.close();
    }

    static char[] solve(int n, char[] s) {
        String ans = "";
        for (int i = n - 1; i >= 0; i--) {
            if ((s[i] - '0') % 2 == 0) {
                s[i] = '.';
            } else break;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (s[i] != '.') sum += (s[i] - '0');
        }
        for (int i = 0; i < n; i++) {
            if (s[i] == '0') s[i] = '.';
            else break;
        }
        if (sum % 2 == 0) return s;



        return s;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
