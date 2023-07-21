//created by Toufique on 06/07/2023

import java.io.*;
import java.util.*;

public class C882cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int ans = 0;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = in.nextInt();
            Set<Integer> set = new HashSet<>();
            int xor = 0;
            for (int a : arr) {
                xor ^= a;
                ans = Math.max(ans, xor);
                for (int b : set) {
                    ans = Math.max(ans, xor ^ b);
                }
                //   debug(xor);
                set.add(xor);
            }
            pw.println(ans);
        }

        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
