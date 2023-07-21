//created by Toufique on 12/06/2023

import java.io.*;
import java.util.*;

public class NT_G {
    static HashSet<Integer> set = new HashSet<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        long n = in.nextLong();
        int k = in.nextInt();
        long[] a = new long[k];
        for (int i = 0; i < k; i++) a[i] = in.nextLong();
        pw.println(Cnt(n, k, a));

        pw.close();
    }
    static int Cnt(long n, int k, long[] p) {
        int x = 1 << k;
        int ans = 0;
        for (int i = 1; i < x; i++) {
            int sum = 1;
            int bitCnt = bits(i);
            for (int j = 0; j < k; j++) {
                if ((i & (1 << j)) > 0) {
                    //   debug(p[j], i);
                    sum *= p[j];
                }
            }
            if (bitCnt == 0) continue;
            if (bitCnt == 1) ans += n / sum;
            else if (bitCnt > 0 && bitCnt % 2 == 0) ans -= (n / sum);
            else ans += (n / sum);
        }
        return ans;
    }
    static int bits(int v) {
        int cnt = 0;
        while (v != 0) {
            if (v % 2 != 0) cnt++;
            v /= 2;
        }
        return cnt;
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
