//created by Toufique on 21/07/2023

import java.io.*;
import java.util.*;

public class F886cF {

    static ArrayList<Integer>[] divs;
    static int N = (int)1e5;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        sieve();
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int x = in.nextInt();
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
            pw.println(solve(map, n));
        }
        pw.close();
    }
    static int solve(HashMap<Integer, Integer> map, int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            int temp = 0;
            ArrayList<Integer> ls = divs[i];
            for (int x: ls) temp += map.getOrDefault(x, 0);
            ans = Math.max(ans, temp);
        }
        return ans;
    }

    static void sieve() {
        divs = new ArrayList[2 * N + 5];
        for (int i = 0; i <= 2 * N + 3; i++) divs[i] = new ArrayList<>();
        for (int i = 1; i <= 2 * N; i++) {
            for (int j = i; j <= 2 * N; j += i) divs[j].add(i);
        }
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
