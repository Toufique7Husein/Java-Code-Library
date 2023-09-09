//created by Toufique on 31/08/2023

import java.io.*;
import java.util.*;

public class A154_cf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            char[] s = in.next().toCharArray();
            //13
            String st = "";
            for (int i = 0; i < s.length; i++) {
                if (st.length() == 1 && s[i] == '3') st = st + 3;
                if (s[i] == '1') st = "1";
            }
            if (st.length() > 1) {
                pw.println(13);
            } else pw.println(31);
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
