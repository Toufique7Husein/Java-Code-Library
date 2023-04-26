//created by Toufique on 03/04/2023

import java.io.*;
import java.util.*;

public class Educational_Round_44A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();
        int[] a = new int[n / 2];
        for (int i = 0; i < n / 2; i++) a[i] = in.nextInt();
        pw.println(solve(a, n));

        pw.close();
    }

    static int solve(int[] a, int n) {
        int ans = 0;
        Arrays.sort(a);
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        for (int i : a) dq.addLast(i);
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            int v = dq.pollFirst();
            int dif = Math.abs(v - i);
            debug(dif, v, i);
            sum += dif;
        }
        for (int i : a) dq.addLast(i);
        int sum2 = 0;
        for (int i = 2; i <= n; i += 2) {
            int v = dq.pollFirst();
            int dif = Math.abs(v - i);
            sum2 += dif;
        }
        ans = Math.min(sum, sum2);
        return ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
