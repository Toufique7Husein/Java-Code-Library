//created by Toufique on 18/02/2023

import java.io.*;
import java.util.*;

public class Div2_392B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        String s = in.next();
        char[] info = new char[4];
        int[] dead = new int[4];
        for (int i = 0; i < s.length(); i++) {
            int idx = i % 4;
            char c = s.charAt(i);
            if (c == '!') {
                dead[idx]++;
            } else {
                info[idx] = c;
            }
        }
        for (char c : "RBYG".toCharArray()) {
            for (int i = 0; i < 4; i++) {
                if (info[i] == c) {
                    pw.print(dead[i] + " ");
                }
            }
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
