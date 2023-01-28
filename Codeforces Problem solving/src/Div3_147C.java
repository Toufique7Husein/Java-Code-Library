//created by Toufique on 27/01/2023

import java.io.*;
import java.util.*;

public class Div3_147C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int[][] arr = new int[n][n - 1];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - 1; j++) {
                    arr[i][j] = in.nextInt();
                }
            }
            int[] ans = solve(arr, n);
            for (int i: ans) pw.print(i + " ");
            pw.println();
        }

        pw.close();
    }

    static int[] solve(int[][] arr, int n) {
        int[] ans = new int[n];
        int[] cnt = new int[n + 10];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            cnt[arr[i][n - 2]]++;
        }
        for (int i = 0; i < n; i++) {
            if (cnt[arr[i][n - 2]] == (n - 1)) {
                ans[n - 1] = arr[i][n - 2];
                set.add(arr[i][n - 2]);
                break;
            }
        }

        for (int i = 1, k = n - 2; i < n; i++, k--) {
            for (int j = 0; j < n; j++) {
                int v = arr[j][k];
                if (!set.contains(v)) {
                    ans[k] = v;
                    set.add(v);
                    break;
                }
            }
        }
        return ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
