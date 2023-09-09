//created by Toufique on 24/08/2023

import java.io.*;
import java.util.*;

public class A894cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), m = in.nextInt();

            char[][] mat = new char[n][];
            for (int j = 0; j < n; j++) mat[j] = in.next().toCharArray();

            ArrayList<Integer> v = new ArrayList<>(), i = new ArrayList<>(), k = new ArrayList<>(), a = new ArrayList<>();
            for (int ii = 0; ii < n; ii++) {
                for (int j = 0; j < m; j++) {
                    if (mat[ii][j] == 'v') v.add(j);
                    if (mat[ii][j] == 'i') i.add(j);
                    if (mat[ii][j] == 'k') k.add(j);
                    if (mat[ii][j] == 'a') a.add(j);
                }
            }
            Collections.sort(v);
            Collections.sort(i);
            Collections.sort(k);
            Collections.sort(a);

            if (v.isEmpty() || i.isEmpty() || k.isEmpty() || a.isEmpty()) {
                pw.println("NO");
                continue;
            }
            int minV = v.get(0);
            int minI = -1;
            for (int ii: i) if (ii > minV){
                minI = ii;
                break;
            }
            if (minI == -1) {
                pw.println("NO");
                continue;
            }
            int minK = -1;
            for (int kk: k)if (kk > minI){
                minK = kk;
                break;
            }
            if (minK == -1) {
                pw.println("NO");
                continue;
            }
            int minA = -1;
            for (int aa: a)if (aa > minK){
                minA = aa;
                break;
            }
            if (minA == -1) {
                pw.println("NO");
                continue;
            }
            pw.println("YES");
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
