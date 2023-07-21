//created by Toufique on 30/06/2023

import java.io.*;
import java.util.*;

public class Codeforces_Round862C {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), m = in.nextInt();
            ArrayList<Long> kk = new ArrayList<>();
            for (int i = 0; i < n; i++) kk.add(in.nextLong());
            Collections.sort(kk);
            for (int i = 0; i < m; i++) {
                long a = in.nextLong();
                long b = in.nextLong();
                long c = in.nextLong();


                long kl = findLow(kk, b), kh = findHigh(kk, b);

                long r = 4 * a * c;
                long l1 = (b - kl) * (b - kl), l2 = (b - kh) * (b - kh);

                if (c <= 0) {
                    pw.println("NO");
                    continue;
                }


                if (l1 < r || l2 < r) {
                    pw.println("YES");
                    if (l1 < r) pw.println(kl);
                    else pw.println(kh);
                } else pw.println("NO");
            }
        }

        pw.close();
    }

    static long findLow(ArrayList<Long> K, long x) {
        int low = 0;
        int high = K.size() - 1;
        while (low != high) {
            int mid = (low + high) / 2;
            if (K.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return K.get(low);
    }

    static long findHigh(ArrayList<Long> K, long B) {
        int low = 0;
        int high = K.size() - 1;
        while (low != high) {
            int mid = (low + high + 1) / 2;
            if (K.get(mid) > B) {
                high = mid - 1;
            } else {
                low = mid;
            }
        }
        return K.get(low);
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
