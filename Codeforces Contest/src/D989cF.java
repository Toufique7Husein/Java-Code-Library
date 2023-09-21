//created by Toufique on 21/09/2023

import java.io.*;
import java.util.*;

public class D989cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int k = in.nextInt();
            char[] s = in.next().toCharArray();
            pw.println(solve(s, n, k));
        }

        pw.close();
    }

    static int solve(char[] s, int n, int k) {
        int ans = 0;
        ArrayDeque<Character> dq = new ArrayDeque<>();
        for (char c: s) dq.addLast(c);
        while (!dq.isEmpty()) {
            cleanFromFront(dq);
            cleanFromBack(dq);
            boolean ok = false;
            for (int i = 0; i < k; i++) {
                if (dq.isEmpty())break;
                dq.pollFirst();
                ok = true;
            }
            if (ok) ans++;
        }
        return ans;
    }

    static void cleanFromFront(ArrayDeque<Character> dq) {
        while (!dq.isEmpty()) {
            char c = dq.peekFirst();
            if (c == 'B') break;
            dq.pollFirst();
        }
    }
    static void cleanFromBack(ArrayDeque<Character> dq) {
        while (!dq.isEmpty()) {
            char c = dq.peekLast();
            if (c == 'B') break;
            dq.pollLast();
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
