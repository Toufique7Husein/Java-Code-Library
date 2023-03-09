//created by Toufique on 09/03/2023

import java.io.*;
import java.util.*;

public class Div2_857C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int minus = 0, pos = 0;
            for (int i = 0; i < n; i++) {
                int v = in.nextInt();
                if (v < 0) minus++;
                else pos++;
            }
            int val = 0;
            int temp = pos;
            for (int i = 0; i < n; i++) {
                if (pos != 0) {
                    val++;
                    pos--;
                    pw.print(val + " ");
                } else {
                    val--;
                    pw.print(val + " ");
                }
            }
            pw.println();
            int tempV = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    temp--;
                    tempV++;
                    pw.print(tempV + " ");
                    continue;
                }
                if (minus != 0) {
                    minus--;
                    tempV--;
                    pw.print(tempV + " ");
                    continue;
                }
                tempV++;
                pw.print(tempV + " ");
            }
            pw.println();

        }

        pw.close();
    }



    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
