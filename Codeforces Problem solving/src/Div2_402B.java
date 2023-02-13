//created by Toufique on 13/02/2023

import java.io.*;
import java.util.*;

public class Div2_402B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        char[] s = in.next().toCharArray();
        int k = in.nextInt();
        pw.println(solve(s, k));

        pw.close();
    }

    static int solve(char[] s, int k) {
        if (k == 0) return 0;
        int ans = 0;
        for (int i = s.length - 1; i >= 0; i--) {
            if (s[i] == '0') {
                k--;
                if (k == 0) return ans;
            } else {
                ans++;
            }
        }
        ans = s.length - 1;
        return ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
