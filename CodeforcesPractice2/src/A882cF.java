//created by Toufique on 06/07/2023

import java.io.*;
import java.util.*;

public class A882cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();
        int x = in.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i <= x; i++) set.add(in.nextInt());
        int y = in.nextInt();
        for (int i = 1; i <= y; i++) set.add(in.nextInt());

        boolean ok = true;
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                ok = false;
                break;
            }
        }
        if (ok) pw.println("I become the guy.");
        else pw.println("Oh, my keyboard!");

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
