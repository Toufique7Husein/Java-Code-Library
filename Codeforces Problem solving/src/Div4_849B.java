//created by Toufique on 03/02/2023

import java.io.*;
import java.util.*;

public class Div4_849B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            char[] s = in.next().toCharArray();
            int x = 0, y = 0;
            boolean ok = false;
            for (int i = 0; i < n; i++) {
                if (s[i] == 'U') y++;
                if (s[i] == 'D') y--;
                if (s[i] == 'R') x++;
                if (s[i] == 'L') x--;
                if (x == 1 && y == 1) ok = true;
            }
            if (ok) pw.println("YES");
            else pw.println("NO");
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
