//created by Toufique on 15/08/2023

import java.io.*;
import java.util.*;

public class C893cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            ArrayList<Integer> ans = solve(n);
            for (int i: ans) pw.print(i + " ");
            pw.println();
        }

        pw.close();
    }

    static ArrayList<Integer> solve(int n) {
        ArrayList<Integer> ls = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 2; i <= n; i++) {
            if (set.contains(i)) continue;
            set.add(i);
            ls.add(i);
            int j = i * 2;
            while (j <= n) {
                ls.add(j);
                set.add(j);
                j *= 2;
            }
        }
        //debug(ls);

        for (int i = 1;  i <= n; i++) if (!set.contains(i)){
            ls.add(i);
            set.add(i);
        }
     //   debug(ls.size());
        return ls;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
