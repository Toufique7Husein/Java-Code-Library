//created by Toufique on 12/06/2023

import java.io.*;
import java.util.*;

/*
* https://vjudge.net/contest/563116#problem/C
* */


public class NT_C {
    static int[] tau;
    static int N = (int)1e6 + 7;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        sieve();
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            pw.println(tau[in.nextInt()]);
        }

        pw.close();
    }

    static void sieve() {
        tau = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = i; j <= N; j += i) tau[j]++;
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
