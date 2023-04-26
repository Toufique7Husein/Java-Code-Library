//created by Toufique on 22/03/2023

import java.io.*;
import java.util.*;

public class Div2_598B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int cntZero = 0, cnt = 0;
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                int x = in.nextInt();
                if (x != 0) cnt++;
                else cntZero++;
            }
            if (cnt == 0) {
                pw.println(1);
                continue;
            }
          //  debug(cnt, cntZero);
            if ((cnt + 1) >= cntZero) {
                pw.println(0);
                continue;
            }
            pw.println(1);
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
