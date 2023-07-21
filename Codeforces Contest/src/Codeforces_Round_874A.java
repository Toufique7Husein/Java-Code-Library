//created by Toufique on 19/05/2023

import java.io.*;
import java.util.*;

public class Codeforces_Round_874A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            char[] s = in.next().toCharArray();
            HashSet<String> set = new HashSet<>();
            int ans = 1;
            set.add(s[0] + "" + s[1]);
            for (int i = 2; i < s.length; i++) {
                String str = s[i - 1] +""+ s[i];
                if (!set.contains(str)) {
                    set.add(str);
                    ans++;
                }
            }
            pw.println(ans);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
