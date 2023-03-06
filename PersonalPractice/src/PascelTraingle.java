//created by Toufique on 07/03/2023

import java.io.*;
import java.util.*;

public class PascelTraingle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        ArrayList<Integer> ans = pascal(5);
        debug(ans);

        pw.close();
    }

    static ArrayList<Integer> pascal(int n) {
        ArrayList<Integer>[] ls = new ArrayList[n + 1];
        for (int i = 0; i < n; i++) ls[i] = new ArrayList<>();
        ls[0].add(1);
        ls[1].add(1);
        ls[1].add(1);

        for (int i = 2; i < n; i++) {
            ls[i].add(1);
            /*
            *       1
            *     1   1
            *  1    2    1--->0, 1
            * */
            for (int j = 1; j < i; j++) {
                int v = ls[i - 1].get(j - 1) + ls[i - 1].get(j);
                ls[i].add(v);
            }
            ls[i].add(1);
        }
        return ls[n - 1];
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
