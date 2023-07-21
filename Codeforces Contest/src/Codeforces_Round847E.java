//created by Toufique on 02/07/2023

import java.io.*;
import java.util.*;

public class Codeforces_Round847E {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);



        TreeSet<Integer> set = new TreeSet<>();
        for (int a = 1; a < 10000; a++) {
            for (int b = 1; b < 10000; b++) {
                if ((a ^ b) == ((a + b) / 2)) {
                 //   debug(a ^ b,   a, b,   Math.abs((a ^ b) - a), Math.abs((a ^ b) - b));
                    set.add((a ^ b));
                }
            }
        }
        debug(set);
        debug(set.size());



        /*int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {

        }*/

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
