//created by Toufique on 08/03/2023

import java.io.*;
import java.util.*;

public class OnlineMiror2018B1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        HashMap<Integer, Integer> map = new HashMap<>();
        int n = in.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int v = in.nextInt();
            int u = in.nextInt();
            map.put(v, cnt(v, map) + 1);
            map.put(u, cnt(u, map) + 1);
        }
        int ans = 0;
        for (Integer v: map.values()) {
            if (v == 1) ans++;
        }
        pw.println(ans);
        pw.close();
    }
    static int cnt(int key, HashMap<Integer, Integer> map) {
        if (map.containsKey(key)) return map.get(key);
        return 0;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
