//created by Toufique on 15/08/2023

import java.io.*;
import java.util.*;

public class isSorted {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        debug(pow(2, 6));

        pw.close();
    }

    static int pow(int b, int p) {
        if (p == 0) return 1;
        int x = pow(b, p / 2);
        x *= x;
        if (p % 2 == 0) return x;
        return b * x;
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
