//created by Toufique on 06/03/2023

import java.io.*;
import java.util.*;

public class Div2_853B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            in.next();
            char[] S = in.next().toCharArray();
            int min = 1000000;
            int max = 0;
            int count = 0;
            int low = 0;
            int high = S.length - 1;
            while (low < high) {
                if (S[low] != S[high]) {
                    min = Math.min(min, low);
                    max = low;
                    count++;
                }
                low++;
                high--;
            }
            boolean possible = (count == 0) || (count == max - min + 1);
            pw.println(possible ? "Yes" : "No");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
