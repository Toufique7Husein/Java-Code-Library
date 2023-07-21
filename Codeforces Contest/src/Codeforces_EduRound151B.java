//created by Toufique on 29/06/2023

import java.io.*;
import java.util.*;

public class Codeforces_EduRound151B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            long xA = in.nextLong(), yA = in.nextLong();
            long xB = in.nextLong(), yB = in.nextLong();
            long xC = in.nextLong(), yC = in.nextLong();


            pw.println(solve(xA, yA, xB, yB, xC, yC));
        }

        pw.close();
    }


    static long solve(long xA, long yA, long xB, long yB, long xC, long yC) {
        long x = 0;
        if (xA >= xB && xA >= xC) {
            x = Math.min(Math.abs(xA - xB) + 1, Math.abs(xA - xC) + 1);
        } else if (xA <= xB && xA <= xC) {
            x = Math.min(Math.abs(xA - xB) + 1, Math.abs(xA - xC) + 1);
        }


        long y = 0;
        if (yA >= yB && yA >= yC) {
            y = Math.min(Math.abs(yA - yB) + 1, Math.abs(yA - yC) + 1);
        } else if (yA <= yB && yA <= yC) {
            y = Math.min(Math.abs(yA - yB) + 1, Math.abs(yA - yC) + 1);
        }

        long ans = x + y;
        if (x > 0 && y > 0) ans--;
        if (ans == 0) ans = 1;
        return ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
