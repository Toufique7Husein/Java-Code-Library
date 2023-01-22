//created by Toufique on 21/01/2023

import java.io.*;
import java.util.*;

public class Div2_845A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            for (int i = 0; i < n; i++) a[i] %= 2;

            ArrayList<Integer> adjlen = new ArrayList<>();

            for (int i = 0; i < n; ) {
                int curr = a[i];
                int cnt = 0;
                int pre = i;
                while (i < n && curr == a[i]) {
                    i++;
                    cnt++;
                }
                if (pre == i) i++;
                if (cnt != 0)adjlen.add(cnt);
            }
            int ans = 0;
            for (int i: adjlen) ans += (i - 1);
            pw.println(ans);
        }


        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
