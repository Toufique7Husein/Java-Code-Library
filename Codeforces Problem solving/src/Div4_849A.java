//created by Toufique on 03/02/2023

import java.io.*;
import java.util.*;

public class Div4_849A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            char[] s = "codeforces".toCharArray();
            HashSet<Character> set = new HashSet<>();
            for (char x: s) set.add(x);
            char c = in.next().charAt(0);
            if (set.contains(c))pw.println("YES");
            else pw.println("NO");
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
