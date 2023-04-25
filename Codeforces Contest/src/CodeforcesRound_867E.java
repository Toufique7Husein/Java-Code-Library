//created by Toufique on 24/04/2023

import java.io.*;
import java.util.*;

public class CodeforcesRound_867E {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            char[] s =  (("#") + in.next()).toCharArray();
            pw.println(solve(s, n));
        }
        pw.close();
    }

    static int solve(char[] s, int n) {
        if (n % 2 != 0) return -1;
        int[] cnt = new int[26];
        for (int i = 1; i <= n; i++) cnt[s[i] - 'a']++;
        int half = n / 2;
        for (int i: cnt) if (i > half) return -1;
        int[] miss = new int[26];
        int total = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (s[i] == s[n - i + 1]) {
                miss[s[i] - 'a']++;
                total++;
            }
        }
       // debug(total);
        int ans = total + 1 >> 1;
        for (int i : miss) {
            ans = Math.max(i, ans);
        }
        return ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
