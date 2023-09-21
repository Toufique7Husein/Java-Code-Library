//created by Toufique on 11/09/2023

import java.io.*;
import java.util.*;

public class B897cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            char[] s = in.next().toCharArray();
            ArrayList<Integer> ans = solve(s, n);
            for (int i = 0; i < ans.size(); i++) pw.print(ans.get(i));
            Collections.reverse(ans);
            if (n % 2 == 0) {
                for (int i = 1; i < ans.size(); i++) pw.print(ans.get(i));
                pw.println();
                continue;
            }
            for (int i: ans) pw.print(i);
            pw.println();
        }
        pw.close();
    }

    static ArrayList<Integer> solve(char[] s, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        int cnt = cnt(s, n);
        int h = (n + 1) / 2;
        for (int i = 0; i < h; i++) {
            if (cnt > i) {
                ans.add(0);
                continue;
            }
            if (i % 2 == 0) {
                if (cnt % 2 == 0) ans.add(1);
                else ans.add(0);
            } else {
                ans.add(1);
            }
        }
        if (n % 2 == 0) {
            int mid = n / 2;
            if (mid % 2 == 0) {
                if (cnt % 2 == 0) ans.add(1);
                else ans.add(0);
            } else {
                if (cnt % 2 != 0)ans.add(0);
                else ans.add(1);
            }
        }
        return ans;
    }

    static int cnt(char[] s, int n) {
        ArrayDeque<Character> dq = new ArrayDeque<>();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            dq.addLast(s[i]);
        }
        for (int i = 0; i < n / 2; i++) {
            char temp = dq.pollLast();
            if (temp != s[i]) cnt++;
        }
        return cnt;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
