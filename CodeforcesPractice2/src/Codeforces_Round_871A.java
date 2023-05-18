//created by Toufique on 06/05/2023

import java.io.*;
import java.util.*;

public class Codeforces_Round_871A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            char[] s = "codeforces".toCharArray();
            char[] f = in.next().toCharArray();
            int cnt = 0;
            for (int i = 0; i < f.length; i++) if (f[i] != s[i]) cnt++;
            pw.println(cnt);
        }
        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
