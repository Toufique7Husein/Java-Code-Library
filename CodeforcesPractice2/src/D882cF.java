//created by Toufique on 07/07/2023

import java.io.*;
import java.util.*;

public class D882cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);


        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            double d = in.nextDouble(), h = in.nextDouble();
            double[] a = new double[n];
            for (int i = 0; i < n; i++) a[i] = in.nextDouble();
            pw.println(solve(n, d, h, a));
        }

        pw.close();
    }

    static double solve(int n, double d, double h, double[] a) {
        double ans = 0.0;
        double theta = Math.atan((h / (d / 2.0)));
        ans += n * ((d * h) / 2.0);
        for(int i = 1; i < n; i++) {
            if ((a[i] - a[i - 1]) <= h) {
                double delta = (h - (a[i] - a[i - 1]));
              //  debug(delta);
                double base = (delta / Math.tan(theta));
                double overlap = (base * delta);
               // debug(overlap);
                ans -= overlap;
            }
        }
        return ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
