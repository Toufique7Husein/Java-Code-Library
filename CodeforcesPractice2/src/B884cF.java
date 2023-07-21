//created by Toufique on 11/07/2023

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class B884cF {
    static ArrayList<Integer> prime;
    static boolean[] isPrime;
    static int N = (int)100;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        sieve();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int[] ans = solve(n);
            for (int i = 0; i < n; i++) pw.print(ans[i] + " ");
            pw.println();
        }


        pw.close();
    }

    static int[] solve(int n) {
        if (n < 3) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = i + 1;
            return a;
        }
        int[] a = new int[n + 1];
        a[n / 2] = 1;
        a[0] = 2;
        a[n - 1] = 3;

        ArrayDeque<Integer> dq = new ArrayDeque<>();
        for (int i = 4; i <= n; i++) dq.addLast(i);
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) continue;
            a[i] = dq.pollFirst();
        }
        return a;
    }




    static void sieve() {
        isPrime = new boolean[N + 1];
        Arrays.fill(isPrime, true);
        for (int i = 2; i * i <= N; i++) {
            if (!isPrime[i]) continue;
            for (int j = i * i; j <= N; j += i) {
                isPrime[j] = false;
            }
        }
        prime = new ArrayList<>();
        for (int i = 2; i <= N; i++) if (isPrime[i]) prime.add(i);
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
