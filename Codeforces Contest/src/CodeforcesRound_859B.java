//created by Toufique on 19/03/2023

import java.io.*;
import java.util.*;

public class CodeforcesRound_859B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
            if ((a + b) == c) {
                pw.println("+");
            } else if ((a - b) == c){
                pw.println("-");
            }
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
