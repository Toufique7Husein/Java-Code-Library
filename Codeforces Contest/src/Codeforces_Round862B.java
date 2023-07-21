//created by Toufique on 06/06/2023

import java.io.*;
import java.util.*;

public class Codeforces_Round862B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            char[] s = in.next().toCharArray();
            int indx = -1;
            char rep = s[0];
            //for (int j = 'a'; j <= 'z'; j++)
            for (int j = 'a'; j <= 'z'; j++){
                boolean ok = false;
                for(int i = n - 1; i >= 1; i--) {
                    if (j == s[i] && s[i] <= s[0]) {
                        indx = i;
                        rep = s[i];
                        ok = true;
                        break;
                    }
                }
                if (ok)break;
            }
            if (indx == -1) {
                for (char c: s)pw.print(c);
                pw.println();
            } else {
                pw.print(rep);
                for (int i = 0; i < s.length; i++) {
                    if (indx != i)pw.print(s[i]);
                }
                pw.println();
            }
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
