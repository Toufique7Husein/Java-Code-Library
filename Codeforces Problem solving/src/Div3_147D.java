//created by Toufique on 09/02/2023

import java.io.*;
import java.util.*;

public class Div3_147D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            ArrayList<Integer> ls = new ArrayList<>();
            HashMap<Integer, Integer> map = new HashMap<>();
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                int x = in.nextInt();
                ls.add(x);
                int cnt = getOcr(map, x);
                map.put(x, cnt + 1);
            }
            Collections.sort(ls);
            pw.println(solve(ls, map, n));
        }

        pw.close();
    }
    static int getOcr(HashMap<Integer, Integer> map, int key) {
        return map.getOrDefault(key, 0);
    }

    static int solve(ArrayList<Integer> ls, HashMap<Integer, Integer> map, int n) {
        int ans = 0;
        debug(ls);
        for (int i = 0; i < n; i++) {
            int v = ls.get(i);
            if (map.containsKey(v)) {
                ans++;
                int cnt = map.get(v);
                cnt--;
                if (cnt == 0) {
                    map.remove(v);
                    continue;
                }
                map.put(v, cnt);
                for (int j = v + 1; ; j++) {
                    if (!map.containsKey(j)) break;
                    int ocr = map.get(j);
                    ocr--;
                    if (ocr <= 0)map.remove(j);
                    else map.put(j, ocr);
                }
            }
        }
        return ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
