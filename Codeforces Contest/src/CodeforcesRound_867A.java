//created by Toufique on 24/04/2023

import java.io.*;
import java.util.*;

public class CodeforcesRound_867A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), T = in.nextInt();
            int curr = -1, ans = -1;
            int[] a = new int[n], b = new int[n];
            Arrays.setAll(a, i -> in.nextInt());
            Arrays.setAll(b, i -> in.nextInt());

            for (int i = 0; i < n; i++) {
                if (T >= a[i]) {
                    if (curr < b[i]) {
                        curr = b[i];
                        ans = i + 1;
                    }
                }
                T--;
            }
            pw.println(ans);
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
