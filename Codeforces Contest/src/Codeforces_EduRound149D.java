//created by Toufique on 29/06/2023

import java.io.*;
import java.util.*;

public class Codeforces_EduRound149D {
    static HashSet<Integer> set;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            set = new HashSet<>();
            int n = in.nextInt();
            char[] s = in.next().toCharArray();
            if (!possible(s, n)) {
                pw.println(-1);
                continue;
            }
            int[] ans = solve(n,s);
            HashSet<Integer> set = new HashSet<>();
            for (int i: ans) set.add(i);
            pw.println(set.size());
            for (int i: ans) pw.print(i + " ");
            pw.println();
        }

        pw.close();
    }

    static boolean check(int n, char[] s, boolean rev) {
        if (rev) {
            for (int i = 0; i < n / 2; i++) {
                char temp = s[i];
                s[i] = s[n - i - 1];
                s[n - i - 1] = temp;
            }
        }

        Stack<Character> stack = new Stack<>();
        for (char x: s) {
            if (x == '(') stack.push(x);
            if (x == ')') {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }
        return true;
    }

    static int[] solve(int n, char[] s) {
        int[] ans = new int[n];
        char[] temp = Arrays.copyOf(s, s.length);
        if (check(n, temp, false) || check(n, temp, true)) {
            Arrays.fill(ans, 1);
            return ans;
        }
        HashSet<Integer> set = new HashSet<>();
        {
            for (int i = 0; i < n / 2; i++) {
                if (s[i] == '(') {
                    ans[i] = 1;
                    set.add(i);
                }
            }
            for (int i = n / 2; i < n; i++) {
                if (s[i] == ')') {
                    ans[i] = 1;
                    set.add(1);
                }
            }
        }
        {
            int v = 1;
            if (set.size() > 0) v++;
            for (int i = 0; i < n / 2; i++) {
                if (s[i] == ')') {
                    ans[i] = v;
                    set.add(v);
                }
            }
            for (int i = n / 2; i < n; i++) {
                if (s[i] == '(') {
                    ans[i] = v;
                    set.add(v);
                }
            }
        }
        return ans;
    }

    static boolean possible(char[] s, int n) {
        int l = 0, r = 0;
        for (int i = 0; i < n; i++) {
            if (s[i] == '(') l++;
            else r++;
        }
        if (l != r) return false;
        return true;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
