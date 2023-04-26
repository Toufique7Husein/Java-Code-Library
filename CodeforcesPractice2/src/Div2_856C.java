//created by Toufique on 10/04/2023

import java.io.*;
import java.util.*;

public class Div2_856C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            Queue<Integer> pq = new PriorityQueue<>();
            for (int i = 0; i < n; i++) {
                int a = in.nextInt();
                pq.add(a);
 //               debug(pq.peek());
                if (pq.peek() < pq.size()) {
                    pq.poll();
                }
                pw.print(pq.size() + " ");
            }
            pw.println();
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
