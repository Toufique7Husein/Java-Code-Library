//created by Toufique on 31/08/2023

import java.io.*;
import java.util.*;

public class B154cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            char[] a = in.next().toCharArray(), b = in.next().toCharArray();
            if (isEqual(a, b)) {
                pw.println("YES");
                continue;
            }
            if (isPossible(a, b)) {
                pw.println("YES");
                continue;
            }
            pw.println("NO");
        }

        pw.close();
    }

    static boolean isPossible(char[] a, char[] b) {
        int n = a.length - 1;
        boolean aOne = true, bOne = true;
        for (int i = n - 1; i >= 1; i--) {
            boolean aTemp = a[i] == '1';
            boolean bTemp = b[i] == '1';

            if (aOne && bOne && !aTemp && !bTemp) return true;
            aOne = aTemp;
            bOne = bTemp;
        }
        if (aOne && bOne) return true;
        return false;
    }

    static boolean isEqual(char[] a, char[] b) {
        boolean ok = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                ok = false;
                break;
            }
        }
        if (ok) return true;
        return false;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
