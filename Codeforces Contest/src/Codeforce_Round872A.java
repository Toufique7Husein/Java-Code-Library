//created by Toufique on 30/06/2023

import java.io.*;
import java.util.*;

public class Codeforce_Round872A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), m = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            pw.println(solve(a, n, m));
        }

        pw.close();
    }

    static int solve(int[] a, int n, int m) {
        int right = 0, pos = 0, left = 0;
        ArrayList<Integer> poss = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (a[i] == -2) {
                right++;
                continue;
            }
            if (a[i] == -1) {
                left++;
                continue;
            }
            if (!set.contains(a[i])) {
                poss.add(a[i]);
                pos++;
                set.add(a[i]);
            }

        }
        int sl1 = left(left, pos, m);
        int sl2 = right(right, pos, m);
        int sl3 = tryAll(left, right, poss, m);
        return Math.max(sl1, Math.max(sl2, sl3));
    }

    static int left(int left, int pos, int m) {
        return Math.min(m, left + pos);
    }

    static int tryAll(int left, int right, ArrayList<Integer> pos, int m) {
        Collections.sort(pos);
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        for (int x: pos) dq.addLast(x);
        int delete = 0;
        int ans = 0;
        while (!dq.isEmpty()) {
            int at = dq.pollFirst();
            int templ = Math.min(left + delete, at - 1);
            int tempR = Math.min(m - at, right + dq.size());
         //   debug(templ, tempR, right, m - at, m, at);
            ans = Math.max(templ + tempR + 1, ans);
            delete++;
        }
        return ans;
    }
    static int right(int right, int pos, int m) {
        return Math.min(m, right + pos);
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
