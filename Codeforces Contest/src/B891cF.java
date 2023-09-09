//created by Toufique on 07/08/2023

import java.io.*;
import java.util.*;

public class B891cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            char[] s = in.next().toCharArray();
            int[] a = new int[s.length];
            debug(s);
            for (int i = 0; i < s.length; i++) a[i] = (s[i] - '0');
            solve(a, s.length);
        }

        pw.close();
    }

    static int[] solve(int[] a, int n) {
        debug(a);
        boolean all = true;
        for (int i = 0; i < n; i++) {
            if (a[i] >= 5) {
                all = false;
                break;
            }
        }
        if (all) return a;
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        for (int i: a) dq.addLast(i);
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i: a) map.put(i, map.getOrDefault(i, 0) + 1);
        while (!dq.isEmpty()) {
            int v = dq.pollLast();
            int cnt = map.get(v);
            cnt--;
            if (cnt <= 0) map.remove(v);
            else map.put(v, cnt);
            if (dq.isEmpty()) {
              //  debug(v);
                ans.add(v);
                break;
            }
            if (v < 5){
                boolean find = false;
                for (int i = 0; i <= 9; i++) {
                    if (map.containsKey(i)) {
                        find = true;
                    }
                }
                if (!find) {
                    ans.add(v);
                }
                ans.add(0);
            } else {
                ans.add(0);
                int v1 = dq.pollLast();
                int cnt1 = map.get(v1);
                cnt1--;
                if (cnt1 <= 0) map.remove(v1);
                else map.put(v1, cnt1);
                v1++;
                map.put(v1, map.getOrDefault(v1, 0) + 1);
                if (v1 == 10) {
                    dq.addFirst(1);
                    ans.add(0);
                } else {
                    dq.addLast(v1);
                }
            }
        }
        debug(ans);
        debug(ans.size(), a.length);
        return a;
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
