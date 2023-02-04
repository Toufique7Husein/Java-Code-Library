//created by Toufique on 03/02/2023

import java.io.*;
import java.util.*;

public class Div2_849C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            char[] s = in.next().toCharArray();
            ArrayDeque<Character> deque = new ArrayDeque<>();
            for (char c: s) deque.addLast(c);

            while (deque.size() >= 2) {
                if (deque.peekFirst() != deque.peekLast()) {
                    deque.pollLast();
                    deque.pollFirst();
                } else break;
            }
            pw.println(deque.size());
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
