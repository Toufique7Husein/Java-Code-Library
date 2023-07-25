//created by Toufique on 21/07/2023

import java.io.*;
import java.util.*;

public class C886cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            char[][] mat = new char[8][];
            for (int i = 0; i < 8; i++) {
                mat[i] = in.next().toCharArray();
            }
            pw.println(solve(mat));
        }

        pw.close();
    }

    static String solve(char[][] mat) {
        ArrayList<Character> ls = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (mat[j][i] >= 'a' && mat[j][i] <= 'z') ls.add(mat[j][i]);
            }
        }
        String ans = "";
        for (char x: ls) ans = ans + x;
        return ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
