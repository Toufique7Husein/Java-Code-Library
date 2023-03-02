//created by Toufique on 02/03/2023

import java.io.*;
import java.util.*;

public class Div3_855B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int[][] cnt = new int[26][2];
            int n = in.nextInt(), k = in.nextInt();
            char[] s = in.next().toCharArray();
            for (int i = 0; i < n; i++) {
                if (s[i] >= 'A' && s[i] <= 'Z') {
                    cnt[s[i] - 'A'][0]++;
                } else cnt[s[i] - 'a'][1]++;
            }
            int[] extra = new int[26];
            int ans = 0;
            for (int i = 0; i < 26; i++) {
                ans += Math.min(cnt[i][0], cnt[i][1]);
                extra[i] = (Math.max(cnt[i][1], cnt[i][0]) - Math.min(cnt[i][0], cnt[i][1])) / 2;
            }
            for (int i = 0; i < 26; i++) {
                if (k > extra[i] ) {
                    k -= extra[i];
                    ans += extra[i];
                } else {
                    ans += k;
                    break;
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
