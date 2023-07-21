//created by Toufique on 01/06/2023

import java.io.*;
import java.util.*;

public class F {
    static int N = 1500;
    static ArrayList<Integer> prime;
    static ArrayList<Integer> pf;
    static boolean[] isPrime;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        sieve();
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            pw.println("Case " + (tt + 1) + ":");
            int[] cnt = new int[10];
            int n = in.nextInt();
            int m = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            int mod = in.nextInt();

            int[] A = new int[n];

            A[0] = x;
            A[1] = y;

            for (int i = 2; i < n; i++) {
                A[i] = ((((A[i - 2] * i) % mod) + (A[i - 1] % mod)) % mod) + 1;
            }
            for (int i: A) {
                cnt[primeFactor(i)]++;
            }
            for (int k = 1; k <= m; k++) {
                int ans = 0;
                for (int i = 0; i <= 9; i++) {
                    int sum = 0;
                    for (int j = i; j <= Math.min(9, i + k); j++) {
                        sum += cnt[j];
                    }
                    ans = Math.max(sum, ans);
                }
                pw.println(ans);
            }
        }
        pw.close();
    }

    static void sieve() {
        isPrime = new boolean[N + 5];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= N; i++) {
            if (!isPrime[i]) continue;
            for (int j = i * i; j <= N; j += i) isPrime[j] = false;
        }
        prime = new ArrayList<>();
        for (int i = 2; i <= N; i++) if (isPrime[i]) prime.add(i);
    }

    static int primeFactor(int n) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < prime.size(); i++) {
            long v = prime.get(i);
            if (v * v > n) break;
            if (n % v == 0) {
                set.add((int) v);
                while (n % v == 0) {
                    n /= v;
                }
            }
        }
        if (n > 1) set.add(n);
        return set.size();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
