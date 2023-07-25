//created by Toufique on 21/07/2023

import java.io.*;
import java.util.*;

public class A886cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            ArrayList<Integer> ls = new ArrayList<>();
            for (int i = 0; i < 3; i++) ls.add(in.nextInt());
            Collections.sort(ls);
            Collections.reverse(ls);
            if (ls.get(0) + ls.get(1) >= 10) pw.println("Yes");
            else pw.println("No");
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
