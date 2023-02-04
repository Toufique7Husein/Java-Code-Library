//created by Toufique on 03/02/2023

import java.io.*;
import java.util.*;

public class Div4_849D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            HashMap<Character, Integer> left = new HashMap<>(), right = new HashMap<>();

            char[] s = in.next().toCharArray();

            for (int i = 0; i < n; i++) {
                if (right.containsKey(s[i])) {
                    int cnt = right.get(s[i]);
                    cnt++;
                    right.put(s[i], cnt);
                } else right.put(s[i], 1);
            }
            int ans = 0;
            for (int i = 0; i < n; i++) {
                left.put(s[i], 1);
                int cnt = right.get(s[i]);
                cnt--;
                if (cnt <= 0) right.remove(s[i]);
                else right.put(s[i], cnt);
                ans = Math.max(countDistinct(left, right), ans);
            }
            pw.println(ans);
        }

        pw.close();
    }

    static int countDistinct(HashMap<Character, Integer> left, HashMap<Character, Integer> right) {
        int cnt = 0;
        for (int i = 'a'; i <= 'z'; i++) {
            char x = (char) i;
            if (left.containsKey(x)) cnt++;
            if (right.containsKey(x)) cnt++;
        }
        return cnt;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
