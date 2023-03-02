//created by Toufique on 02/03/2023

import java.io.*;
import java.util.*;

public class Div3_855A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            String s = in.next().toLowerCase();
            char[] ss = s.toCharArray();
            //debug(ss, s);
            String temp = "meow";

            String s1 = "";
            for (int i = 0; i < ss.length; i++) {
                if (s1.isEmpty()) s1 = s1 + ss[i];
                else {
                    if (s1.charAt(s1.length() - 1) != ss[i]) {
                        s1 = s1 + ss[i];
                    }
                }
            }
            if (s1.equals(temp)) pw.println("YES");
            else pw.println("NO");


        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
