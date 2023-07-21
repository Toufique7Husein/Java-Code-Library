//created by Toufique on 03/07/2023

import java.io.*;
import java.util.*;

public class Codeforces_Round855E1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        outer:
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), k = in.nextInt();
            char[] s = ("#"+ in.next()).toCharArray();
            char[] t1 = ("#"+ in.next()).toCharArray();
            DSU dsu = new DSU(n);
            for (int i = 1; i <= n; i++) {
                if ((i + k) <= n)dsu.union(i, i + k);
                if ((i + k + 1) <= n) dsu.union(i, i + k + 1);
            }
            HashMap<Integer, ArrayList<Character>> s2 = new HashMap<>(), t2 = new HashMap<>();
            for (int i = 1; i <= n; i++){
                s2.put(i, new ArrayList());
                t2.put(i, new ArrayList());
            }

            for (int i = 1; i <= n; i++) {
                int rep = dsu.representative(i);
                ArrayList<Character> temp = s2.get(rep);
                temp.add(s[i]);
                s2.put(rep, temp);
                ArrayList<Character> temp2 = t2.get(rep);
                temp2.add(t1[i]);
                t2.put(rep, temp2);
            }
            HashSet<Integer> set = new HashSet<>();
            for (int i = 1; i <= n; i++) set.add(dsu.representative(i));
            for (int i: set) {
                ArrayList<Character> S = s2.get(i);
                Collections.sort(S);
                ArrayList<Character> T = t2.get(i);
                Collections.sort(T);
                //debug(S, T);
                for (int j = 0; j < T.size(); j++) {
                    try {
                        if (S.get(j) != T.get(j)) {
                            pw.println("NO");
                            continue outer;
                        }
                    } catch (Exception e) {
                        pw.println("NO");
                        continue outer;
                    }
                }
            }
            pw.println("YES");
        }
        pw.close();
    }
    
    static class DSU {
        int N;
        int[] p;
        
        DSU(int N) {
            p = new int[N + 1];
            for (int i = 0; i <= N; i++) p[i] = i;
        }
        
        void union(int a, int b) {
            int u = representative(a);
            int v = representative(b);
            if (u != v) p[u] = v;
        }
        
        int representative(int r) {
            if (p[r] == r) return r;
            p[r] = representative(p[r]);
            return p[r];
        }
    }
    
    

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
