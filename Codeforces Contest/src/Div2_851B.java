//created by Toufique on 09/02/2023

import java.io.*;
import java.util.*;

public class Div2_851B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            char[] s = in.next().toCharArray();
            ArrayList<Integer> A = new ArrayList(), B = new ArrayList();
            boolean a = false;
            for (int i = 0; i < s.length; i++) {
                int v = s[i] - '0';
                if (v % 2 == 0) {
                    A.add((v / 2));
                    B.add((v / 2));
                } else {
                    int x = v / 2;
                    int y = x + 1;
                    if (a) {
                        a = false;
                        A.add(y);
                        B.add(x);
                    } else {
                        a = true;
                        B.add(y);
                        A.add(x);
                    }
                }
            }
            boolean zero = true;
            boolean print = false;
            for (int x: A) {
                if (x > 0) zero = false;
                if (!zero) {
                    print = true;
                    pw.print(x);
                }
            }
            if (!print) pw.print(0);
            pw.print(" ");
            zero = true;
            print = false;
            for (int x: B) {
                if (x > 0) zero = false;
                if (!zero)  {
                    pw.print(x);
                    print = true;
                }
            }
            if (!print) pw.print(0);
            pw.println();

        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
