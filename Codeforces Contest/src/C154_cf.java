//created by Toufique on 31/08/2023

import java.io.*;
import java.util.*;

public class C154_cf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            char[] s = in.next().toCharArray();
            TreeSet<Integer> nd = new TreeSet<>(), dec = new TreeSet<>();
            int curr = 0;
            boolean ok = true;
            for (int i = 0; i < s.length; i++) {
                if (s[i] == '+') curr++;
                if (s[i] == '-') curr--;
                if (s[i] == '0') {
                    if (curr == 0 || curr == 1) {
                        ok = false;
                        break;
                    }
                    if (nd.contains(curr)) {
                        debug(curr);
                        ok = false;
                        break;
                    } else {
                        debug(curr);
                        dec.add(curr);
                    }
                }
                if (s[i] == '1') {
                    if (dec.contains(curr)) {
                        ok = false;
                        break;
                    } else {
                        nd.add(curr);
                    }
                }
            }
            if (ok)pw.println("YES");
            else pw.println("NO");
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
