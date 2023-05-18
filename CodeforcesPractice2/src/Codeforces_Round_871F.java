//created by Toufique on 06/05/2023

import java.io.*;
import java.util.*;

public class Codeforces_Round_871F {
    static ArrayList<Integer>[] adj;
    static HashSet<Integer> ls;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            adj = new ArrayList[n + 1];
            ls = new HashSet<>();
            for (int i = 0; i <= n; i++) {
                adj[i] = new ArrayList<>();
            }
            int m = in.nextInt();
            for (int i = 0; i < m; i++) {
                int u = in.nextInt(), v = in.nextInt();
                ls.add(u);
                ls.add(v);
                adj[u].add(v);
                adj[v].add(u);
            }
            pw.println(cntCentral());
        }
        pw.close();
    }

    static String cntCentral() {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int l : ls) {
            if (adj[l].size() == 1) {
                continue;
            }
            int s = adj[l].size();
            int cnt = 1;
            if (map.containsKey(s)) {
                cnt = map.get(s);
                cnt++;
            }
            map.put(s, cnt);
        }

        int ans1 = 1;
        int ans2 = 0;
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() == 1) ans1 = m.getKey();
            if (m.getValue() > 1) ans2 = m.getKey() - 1;
        }
        return ans1 + " " + ans2;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
